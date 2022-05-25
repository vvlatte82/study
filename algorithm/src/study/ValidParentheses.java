package study;

public class ValidParentheses {
	
	public boolean isValid(String s) {
		/*
		 * 닫음 문자는 열림문자 없이 올 수 없음.
		 * 무지성 방
		 */
		
		boolean isvalid = true;
		
		if(s==null || "".equals(s))return false;
		
		while(s.length()>0) {
		
			if( (s.indexOf("{}") >= 0) || (s.indexOf("[]") >=0) || (s.indexOf("()") >=0)) {
				s = s.replaceAll("\\{\\}", "").replaceAll("\\[\\]", "").replaceAll("\\(\\)", "");
			}else {
				isvalid = false;
				break;
			}
		}
		
		return isvalid;
	}

	
	public static void main(String [] args) {
		
		String str = "{}[({})]";
		
		
		
		ValidParentheses v = new ValidParentheses();
		System.out.println(String.valueOf(v.isValid(str)));
		
	}
}
