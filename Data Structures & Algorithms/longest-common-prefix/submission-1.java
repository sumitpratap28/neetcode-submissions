class Solution {
    public String longestCommonPrefix(String[] strs) {
        // prefix = pehli string
        String prefix = strs[0];

        // har agli string ke liye
        for (int i = 1; i < strs.length; i++) {
            // j = 0
            int j = 0;

            // jab tak chars match karein, j++
            while (j < prefix.length() && j < strs[i].length()
                    && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // prefix = prefix ke pehle j chars
            prefix = prefix.substring(0, j);
        }

        // return prefix
        return prefix;
    }
}