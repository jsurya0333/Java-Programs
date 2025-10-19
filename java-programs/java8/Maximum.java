package java8;


	@FunctionalInterface
	interface max{
		void maxi(int [] a);
	}
	public class Maximum {

		public static void main(String[] args) {
			int [] nums= {10,50,80,25,35};
			max find=x-> {
			int max=x[0];
			for(int i=0;i<x.length;i++) {
			if(x[i]> max) {
			max=x[i];
			}
			}
			System.out.println(max);
			
			};

	        find.maxi(nums); 
		}
	}


