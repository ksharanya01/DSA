class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(!map.containsKey(word.charAt(i)) || (word.charAt(i)>=97 && word.charAt(i)<=122)){
                map.put(word.charAt(i),i);
            }
        }
        int cnt=0;
        for(char i='A';i<='Z';i++){
            char ch=Character.toLowerCase(i);
            if(map.containsKey(i) && map.containsKey(ch)){
                if(map.get(i)>map.get(ch)){
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
}