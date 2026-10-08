class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    HashMap<String,List<String>> map = new HashMap<>();
 
    
   /* act 
    cat*/
    for(String str: strs){
        int [] an = new int[26];
        char[] c = str.toCharArray();
        
        for(int i=0;i<c.length;i++) {

            an[c[i]-'a']++;

        }
StringBuilder sb = new StringBuilder();
            for (int n : an) {
                sb.append(n).append('#');
            }
            String key = sb.toString();
       if (!map.containsKey(key)) {
    map.put(key, new ArrayList<>());
}
map.get(key).add(str);

    }
return new ArrayList<>(map.values());
    }
}
