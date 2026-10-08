class Solution {

    public String encode(List<String> strs) {
        
StringBuilder sb = new StringBuilder();

    for(String s: strs) {

        sb.append(s.length()).append('#').append(s);

    } 

   return sb.toString();

    }

    public List<String> decode(String str) {
        int i=0;
        ArrayList<String> res = new ArrayList<>();
 while (i < str.length()) {

            // j se hum '#' dhoondhenge. Shuru mein i par hi rakho.
            int j = i;

            // j ko aage badhao jab tak '#' na mile.
            // Matlab s[i .. j-1] ke beech length (number) likhi hai.
            // Multi-digit length (jaise 12) bhi isse handle ho jaati hai.
            while (str.charAt(j) != '#') {
                j++;
            }

            // i se j tak ka text number mein convert karo -> length.
            int len = Integer.parseInt(str.substring(i, j));

            String word = str.substring(j + 1, j + 1 + len);
            res.add(word);

            // Pointer ko agle record par le jao:
            // j (#) + 1 (# skip) + len (string skip)
            i = j + 1 + len;
        }

    return res;

    }
}
