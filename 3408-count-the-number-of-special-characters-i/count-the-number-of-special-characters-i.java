class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        int cnt=0;
        for(char i='A';i<='Z';i++){
            char low=Character.toLowerCase(i);
            if(set.contains(i) && set.contains(low)){
                cnt++;
            }
        }

        return cnt;

        
    }
}