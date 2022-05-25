package study;
import java.util.*;

class Palindrome {
	public static void main(String [] args) {
		System.out.println(Palindrome.isPalindrome(1234114321));
	}
	
    public static boolean isPalindrome(int x) {
        int powCnt = 0;
   if(x<0)return false;
   
   ArrayList<Integer> num = new ArrayList<Integer>();
   
   int lValue = x;
   
   while(true){
       
       num.add(lValue%10);
       lValue = (int)lValue/10;

       powCnt++;
       
       if(lValue < 10) {
    	   num.add(lValue);
    	   break;
       }
   }

   int divide = (int)powCnt / 2;
   
   for(int j=0; j < divide; j++) {
   	if(num.get(j) != num.get(num.size()-1-j))return false;
   }
   
   return true;
   
    }
}