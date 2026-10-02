class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       
        Map<String, List<String>> m = new HashMap<>();
       for(int i=0;i<strs.length;i++)   {
int[] an = new int[26];
        for(int j=0;j<strs[i].length();j++)  {

            an[strs[i].charAt(j)-'a']++;

        }

        StringBuilder sb = new StringBuilder();

        for(int k=0;k<26;k++){
            sb.append(an[k]).append('#');
        }

        if(!m.containsKey(sb.toString())){

            m.put(sb.toString(),new ArrayList<String>());
        }
        
        m.get(sb.toString()).add(strs[i]);

        

       }
        
return new ArrayList<>(m.values());

    }
}
