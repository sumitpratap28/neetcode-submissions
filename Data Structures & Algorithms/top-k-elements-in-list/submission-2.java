class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
    int freq = 0;

    HashMap<Integer,Integer> map = new HashMap<>();

   // List<Map.Entry<Integer,Integer> freqMap = new ArrayList<>();

    for(int i=0;i<nums.length;i++) {

       int val = nums[i];
        
        map.merge(val,1,Integer::sum);
            
    }
    List<Map.Entry<Integer,Integer>> freqMap = new ArrayList<>(map.entrySet());

    freqMap.sort(Map.Entry.comparingByValue());

    int length = freqMap.size();
    int[] res = new int[k];
    int id=0;
    for(int i= length-1;i >= length - k;i--){

        res[id++]=freqMap.get(i).getKey(); ;

    }

    return res;

    }
}
