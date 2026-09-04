class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> output = new HashMap<>();

        for(String s: strs){
            int arr[] = new int[26];
            for(char c: s.toCharArray()){
                arr[c-'a']++;
            }
            StringBuilder a = new StringBuilder();
            for(int i =0;i<26;i++){
                a.append('#');
                a.append(arr[i]);
            }
            String key = a.toString();
            if(!output.containsKey(key)){
                output.put(key,new ArrayList<>());
            }
            output.get(key).add(s);
        }
    return new ArrayList<>(output.values());
    }
}
