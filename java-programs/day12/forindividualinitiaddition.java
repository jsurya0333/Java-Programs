package day12;

public class forindividualinitiaddition {

	public static void main(String[] args) {
		int[] nums=new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=sum+nums[i];
		}
		System.out.println(sum);
	}
}
