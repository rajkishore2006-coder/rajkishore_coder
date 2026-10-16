class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int [] arr=new int[l];
        int ind=0;
        for(int i=0;i<l;i++){
            if(nums[i]!=0){
                arr[ind++]=nums[i];
            }
            
              
                
            
        }
        for(int i=0;i<l;i++){
            nums[i]=arr[i];
        }
    }
}