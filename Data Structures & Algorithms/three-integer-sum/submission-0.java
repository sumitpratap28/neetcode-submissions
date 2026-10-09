class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;                          // early exit
            if (i > 0 && nums[i] == nums[i - 1]) continue;   // anchor skip

            int lo = i + 1;
            int hi = nums.length - 1;

            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];

                if (sum < 0) {
                    lo++;
                } else if (sum > 0) {
                    hi--;
                } else {
                    list.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while (lo < hi && nums[lo] == nums[lo - 1]) lo++;  // current skip
                }
            }
        }
        return list;
    }
}