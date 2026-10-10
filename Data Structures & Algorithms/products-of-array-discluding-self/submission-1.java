class Solution {
    public int[] productExceptSelf(int[] nums) {
      /*  
        [1,2,4,6]
        [1,1,2,8]
        [48,24,6,1]
        [48,24,12,1]
    */
        int[] asc = new int[nums.length];
        int[] desc = new int[nums.length];
        asc[0]=1;
        desc[nums.length-1]=1;
        for(int i=1;i<nums.length;i++) {
           
            asc[i]=nums[i-1]*asc[i-1];
        }

        for(int i=nums.length-2;i>=0;i--) {
           
            desc[i]=nums[i+1]*desc[i+1];
        }

        for(int i=0;i<nums.length;i++) {
           
            nums[i]=desc[i]*asc[i];
        }

return nums;
    }
}  
