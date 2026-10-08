class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int value;
        for(int i=0;i<nums.length;i++){
            value = target-nums[i];
            if(!map.containsKey(nums[i])){
                map.put(value,i);
            } else 
            {
                return new int[]{map.get(nums[i]),i};

            }
         
        }
return new int[]{-1,-1};

    }
}
