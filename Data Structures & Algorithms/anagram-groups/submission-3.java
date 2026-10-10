class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();

    
        for(int i=0;i<strs.length;i++){

            String val = strs[i];

            int [] an = new int[26];

            for (int j=0;j<val.length();j++){

                an[val.charAt(j)-'a']++;


            }

        String key = Arrays.toString(an);

        List<String> list = map.getOrDefault(key,new ArrayList<>());
        list.add(val);
        map.put(key,list);

        }

        return new ArrayList<>(map.values());
    }
}
