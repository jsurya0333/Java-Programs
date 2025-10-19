package java8;

public class StaticandDefault {

	public static void main(String[] args) {
		IndianBank i=new IndianBank();
		System.out.println(i.getIFSCcode());
		System.out.println(i.getbranch());
		System.out.println(Bank.getaccNumber());
		}
	}
	interface Bank {
		public String getIFSCcode();
		public static long getaccNumber() {
			return 644444444;
		}
		public default String getbranch() {
			return "perungudi";
		}
	}
	class IndianBank implements Bank {
		public String getIFSCcode() {
			return "IAF678065443";
		}
		public String getbranch() {
			return "kandanchavadi";
		}
	}