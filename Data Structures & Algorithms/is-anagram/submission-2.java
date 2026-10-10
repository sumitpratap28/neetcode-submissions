class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){

            return false;
        }
        char[] a = new char[26];

        int l = s.length();

        for(int i=0;i<l;i++) {
            
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;

        }

        for(int i=0;i<26;i++){

            if(a[i]>0){

                return false;
            }
        }

        return true;

    }
}
