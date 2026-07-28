class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            int currentWater = currentHeight * currentWidth;

            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer pointing to the shorter wall
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
    
    
            
        
   
