class Solution {
    public int search(int[] nums, int target) {
        
        //[3,4,5,6,1,2]


        int left =0;
        int right = nums.length-1;

        while(left<=right){

            int mid =left +(right-left)/2;

            int val = nums[mid];

            if(val==target){

                return mid;
            }
          if (nums[left] <= nums[mid]) {
                // Left half [left..mid] is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // Right half [mid..right] is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return -1;
    }
}
