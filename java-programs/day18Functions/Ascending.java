package day18Functions;

public class Ascending {
	public void getAscending(int[] a){
	        int[] nums=a;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]>nums[j]){
	                    int temp=nums[i];
	                    nums[i]=nums[j];
	                    nums[j]=temp;
	                }
	            }
	        }
	        for(int i=0;i<nums.length;i++){
	            System.out.println(nums[i]);
	        }
	    }
	public static void main(String[] args){
	    Ascending n=new Ascending();
	    int[] b={1,12,13,14,15,67,8,18};
	    n.getAscending(b);
	}
}


