class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
         k=k%l;
        int [] arr=new int[l];
        for(int i=0;i<k;i++){
            arr[i]=nums[l-k+i];
            
        }
        int ind=0;
        for(int i=k;i<l;i++){
            arr[i]=nums[ind];
            ind++;
        }
        for(int i=0;i<l;i++){
            nums[i]=arr[i];
        }
        
    }
}