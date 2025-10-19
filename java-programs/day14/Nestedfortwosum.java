package day14;

public class Nestedfortwosum {

	public static void main(String[] args) {
		int[] num= {1,5,7,9,8,2};
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==10)
				{
					System.out.println(num[i]+" "+num[j]);
				}
			}
		}
	}

}
