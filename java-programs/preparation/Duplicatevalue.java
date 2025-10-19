package preparation;

public class Duplicatevalue {

	public static void main(String[] args) {
			int[] num= {1,3,2,3,4,6,4};
			for(int i=0;i<num.length;i++) {
				int count=0;
				for(int j=i+1;j<num.length;j++) {
					if(num[i]==num[j]) {
						count++;
						num[j]='#';
					}
				}
				if(count>0 && num[i]!='#') {
						System.out.println(num[i]);
					}}}
}