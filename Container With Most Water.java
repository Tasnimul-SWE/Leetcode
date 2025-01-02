class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_area = 0;
        
        while (left < right) {
            // Calculate the current area
            int current_area = Math.min(height[left], height[right]) * (right - left);
            // Update max_area if current_area is greater
            max_area = Math.max(max_area, current_area);
            
            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return max_area;
    }
    
    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};
        
        Solution solution = new Solution();
        System.out.println("The maximum area for the first case is: " + solution.maxArea(height1));  // Output should be 49
        System.out.println("The maximum area for the second case is: " + solution.maxArea(height2));  // Output should be 1
    }
}