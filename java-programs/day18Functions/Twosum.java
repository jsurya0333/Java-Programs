package day18Functions;

public class Twosum {

	public static void main(String[] args) {
		int[] nums= {3,5,7,6,9};
		int target=16;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target){
					System.out.println(nums[i]+" "+nums[j]);
					
				}
			}
		}

	}

}
