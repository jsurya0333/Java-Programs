package preparation;

public class Twosum {

	public static void main(String[] args) {
		int[] num= {1,2,5,7,9,10};
		int target=12;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==target) {
					System.out.println(num[i]+" "+num[j]);
				}
			}
		}

	}

}
