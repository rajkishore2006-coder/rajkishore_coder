class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        
        Arrays.sort(nums);
        for(int i=0;i<l;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return l;
        
    }
}