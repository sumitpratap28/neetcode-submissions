class Solution {
    public int maxArea(int[] heights) {
        
        int maxArea=0;
        int area=0;

        int left=0;
        int right= heights.length-1;

        while(left<right){

            
            area = Math.min(heights[left],heights[right])*(right-left);
            maxArea = Math.max(area,maxArea);
            if(heights[left]>heights[right]){

                right--;

            } else {

                left++;
            }

        }

        return maxArea;

    }
}
