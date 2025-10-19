package collections1;

import java.util.ArrayList;

public class Arraylistprimeno {

		public static void main(String[] args) {
			int start=1;
			int end=10;
			ArrayList<Integer> a=new ArrayList<>();
			for(int i=start;i<=end;i++) {
				int count=0;
				for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
					}
				}
				if(count==2) {
					a.add(i);
				}
			}
			for(int p:a) {
				System.out.println(p);
				}
			}
		}
	