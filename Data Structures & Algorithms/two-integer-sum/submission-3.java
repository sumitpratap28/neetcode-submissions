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
/*
use hashmap with target-nums[i] as key and index as value
check nums[i] exists as key of hashmap, if it does get value
and also the index
using both return the indexes
if not then put target-nums[i] and i in the map, continue

if not found return -1,-1 (outside the loop)

*/

}
