class Solution {
    public int numberOfSpecialChars(String word) {
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            list.add(word.charAt(i));
        }
        int cnt=0;
        for(char i='A';i<='Z';i++){
            char low=Character.toLowerCase(i);
            if(list.contains(i) && list.contains(low)){
                cnt++;
            }
        }

        return cnt;

        
    }
}