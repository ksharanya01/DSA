class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        String res[]=new String[names.length];
        int x=0;
        for(String ch:map.values()){
            res[x++]=ch;
        }
        return res;


        
    }
}