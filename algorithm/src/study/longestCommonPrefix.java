package study;

public class longestCommonPrefix {

	/*
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * If there is no common prefix, return an empty string "".
	 * ex)
	 * a = "flowable"
	 * b = "flower"
	 * c = "fly"
	 * 
	 * return "fl"
	 * 
	 * 만약에 prefix가 아닌 중간에 공통된 문자도 포함해서 찾는다면?..
	 * a= "flowable"
	 * b= "possible"
	 * c= "accessible"
	 * 
	 * return ble (?)
	 */
    public String longestCommonPrefix(String[] strs) {
       
    	if(null == strs || strs.length ==0) return "";
    	if(strs.length==1)return strs[0];
    	
    	int i = 1;
        boolean ischk = true;
        
        /*
         * 같은 문자일 경우 염두..
         * 
         */
        
        
    	while(i != strs[0].length()) {
    		
    		
    		for(int j=1; j < strs.length; j++) {
    			
    		System.out.println("str[0]: "+strs[0].substring(0, i));
    		System.out.println("str["+j+"]: "+strs[j]);
    		
    		int chr = strs[j].indexOf(strs[0].substring(0, i));
    		
    		System.out.println("chr: "+chr);
    		
    			if(chr!=0) {
    				ischk = false;
    				break;
    			}
    		}
    		
    		if(ischk)i++;
    		else break;
    	}
    	
    	
        return (i-1)<0?"":strs[0].substring(0, i-1);
    }

    public static void main(String [] args) {
    	String [] str = new String[] {"flower", "flow", "fly"};
    	
    	longestCommonPrefix lc = new longestCommonPrefix();
    	
    	System.out.println("longestCommonPrefix :"+ lc.longestCommonPrefix(str));
    }
}
