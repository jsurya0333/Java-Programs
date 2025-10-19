package preparation;


public class UsePalindromess {
    public static void main(String[] args) {
        UsePali p = new UsePali();
        p.getPali();   // no parameters passed
    }
}

class UsePali {
   public void getPali() { 
    	String str = "mom";   // 👈 word given inside the class
        String rev = ""; // 👈 no parameters
        for (int i = str.length() - 1; i >= 0; i--) {  // reverse string
            rev = rev + str.charAt(i);
        }

        if (rev.equals(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
//public class UsePalindrome {
//
//	public static void main(String[] args) {
//		UsePali p=new UsePali();
//		p.getPali("mom","");
//
//	}
//
//}
//class UsePali {
//	 public void getPali(String str,String rev)
//	 {
//		 for(int i=0;i<str.length();i++)
//			 rev=rev+str.charAt(i);{
//	 
//	 if(rev.equals(str))
//	 {
//		 System.out.println("palindrome");
//	 }
//	 else
//	 {
//		 System.out.println("not palindrome");
//	 }}}}