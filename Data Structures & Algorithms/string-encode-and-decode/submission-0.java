class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(int i =0;i<strs.size();i++){
            String a = strs.get(i);
            
            for(int j=0;j<a.length();j++){
                char c = a.charAt(j);
                int ascii = c;
                encoded.append(ascii).append('_');
            }
            encoded.append('#');
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        StringBuilder currword = new StringBuilder();
        StringBuilder currascii = new StringBuilder();

        for(int i= 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='_'){
                if(currascii.length()>0){
                    int asciiValue = Integer.parseInt(currascii.toString());
                    currword.append((char) asciiValue);
                    currascii.setLength(0);
                }
            }else if(c=='#'){
                decoded_strs.add(currword.toString());
                currword.setLength(0);
            }else{
                currascii.append(c);
            }
        }
        return decoded_strs;
    }
    
}
