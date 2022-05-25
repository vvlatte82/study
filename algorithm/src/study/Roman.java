package study;
import java.util.*;


public class Roman {
	
    public int romanToInt(String s) {
        HashMap<String, Integer> roman = new HashMap<String, Integer>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        
        int result = 0;
        
        try {
	        if(null==s || s.length() ==0 || s.length() > 15) throw new Exception("length error");

	        int i = 0;
	
	        while(i!=s.length()){
	            char ch = s.charAt(s.length()-i-1);
	            
	            Integer getValue =  roman.get(String.valueOf(ch));
	            
	            if(getValue == null ) throw new Exception("invalid character");
	            
	            if(result > getValue*4) result = result - getValue;
	            else result += getValue;
	            i++;
	        }
        }catch(Exception e) {
          	e.printStackTrace();
        }
        
        return result;
    }
    
    public static void main(String [] args) {
    	Roman rm = new Roman();
    	
    	System.out.println("1 : "+rm.romanToInt("XXIV"));
    }
}
