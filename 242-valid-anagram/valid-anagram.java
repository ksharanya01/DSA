class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
        for(char ch:map.keySet()){
            if(map.get(ch)>0){
                return false;
            }
        }
        return true;
    }
        
}