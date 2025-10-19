package preparation;
public class Ascendingorder {
	public void getAscending(int[] a) {
		int[] nums=a;
		for(int i=0;i<nums.length;i++) 
		{
			for(int j=i+1;j<nums.length;j++) {
			if(nums[i]>nums[j]) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		}
	}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
public static void main(String[] args) {
		Ascendingorder s=new Ascendingorder();
		int[] b= {12,56,1,2,67,34,89};
		s.getAscending(b);
	}
}
		
