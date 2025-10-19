package java8;


@FunctionalInterface
	 interface calculator{
	public int getMax(int[] a);
	}
	
	 class Myclass {
		public int findmax(int[] b) {
			int max=b[0];
			for(int i=0;i<b.length;i++) {
				if(b[i]>max) {
					max=b[i];
				}
			}
			return max;
		}
	}
public class Methodtreference {

	public static void main(String[] args) {
		Myclass m=new Myclass();
		calculator c= m::findmax;
		int[] x= {19,78,90,56,0};
		System.out.println(c.getMax(x));
		}
	}
