class Solution {
    public int longestConsecutive(int[] nums) {
        
        

        HashSet<Integer> set = new HashSet<>();
        
       
       
        
        for(int i=0;i<nums.length;i++){

            set.add(nums[i]);

        }
        
        int maxLength=0;

        //2,20,4,10,3,4,5
        for(int i=0;i<nums.length;i++){
            
            if(!set.contains(nums[i]-1)){
                int length= 0;
                while(set.contains(nums[i]++))
                {

                    length++;

                }

                maxLength= Math.max(length,maxLength);

            }       

        }

        return maxLength;
    }
}
