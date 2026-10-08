class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
    Map<Integer,Integer> freq = new HashMap<>();

   
    for(int count: nums){

        freq.merge(count,1,Integer::sum);

    }

    List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

    int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }
   return result;
    }
 

    }

