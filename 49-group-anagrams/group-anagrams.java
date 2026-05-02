class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();

        for(String word:strs){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(word);
        }
        for(List<String> adding : map.values()){
            list.add(adding);
        }
        return list;

            
            
            

        


        
    }
}