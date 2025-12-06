package PreInterviewCoding;

class StaticBlock {
    static {
        for(int i=1;i<=5;i++) {
        	System.out.print(i);
        }
    }
    static {
    	System.out.println(" Static Block 2 executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Executed");
    }
}
