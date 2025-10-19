package day14;

public class Forascendingorder {

	public static void main(String[]args) {
		// TODO Auto-generated method stub

		int[] nums= {1,7,3,4,8};
		for( int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i] > nums[j])
				{
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		
		
		
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		
		}
	}
	


