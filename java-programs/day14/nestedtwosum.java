package day14;

public class nestedtwosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,5,7,9,8,2};
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==7)
				{
					System.out.println(num[i]+" "+num[j]);
				}
			}
		}
	}

}
