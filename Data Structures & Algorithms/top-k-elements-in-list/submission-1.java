class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Build the frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        // 2. Correct Syntax: Convert Map.Entry set to an ArrayList
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // 3. Sort by frequency in DESCENDING order (highest frequency first)
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // 4. Extract the top K keys into a primitive int array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey(); // Get the number, not the count
        }

        return result;
    }
}