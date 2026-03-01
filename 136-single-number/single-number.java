class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            result = result ^ nums[i];
        }//4,1,2,1

        return result;
    }
}