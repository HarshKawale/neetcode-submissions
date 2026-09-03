class Solution {
    public boolean isAnagram(String s, String t) {
        char split_s[] = s.toCharArray();
        char split_t[] = t.toCharArray();
        Arrays.sort(split_s);Arrays.sort(split_t);
        if(split_s.length!=split_t.length){
            return false;
        }
        boolean anagram= false;
        for(int i=0;i<split_s.length;i++){
            if(split_s[i] != split_t[i]){
                return false;
            }
        }
        return true;
    }
}
