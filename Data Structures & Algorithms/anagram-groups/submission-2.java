class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
   Map<String, List<String>> map = new HashMap<>();
for (String word : strs) {
    int[] count = new int[26];
    for (char c : word.toCharArray()) count[c - 'a']++;
    map.computeIfAbsent(Arrays.toString(count), k -> new ArrayList<>()).add(word);
}
return new ArrayList<>(map.values());
    }




    /*
    create an integer list inside loop add the values of the character inside the 
    convert the value into a substring
    use this substring as a key 
    if first time then create a list if not then get the list and add it to the list and reinsert that list inside the string key that was created

    == tricky : return new arraylist with map values
    


    */
}
