class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int mid = 0;
        int right = nums.length-1;

        while (left<=right){

            mid = left + (right-left)/2;

            if(nums[mid]==target){
                
                return mid;
            }
            if(nums[mid]>target){

                right--;

            }
             if(nums[mid]<target){

               left++;

            }
            

        }
return -1;

    }

}
