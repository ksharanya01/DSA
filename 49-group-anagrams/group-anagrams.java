class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        List<String>keys=new ArrayList<>();

        for(String word:strs){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

            boolean found=false;
            for(int i=0;i<keys.size();i++){
                if(keys.get(i).equals(key)){
                    list.get(i).add(word);
                    found=true;
                    break;
                }
            }
            if(!found){
                ArrayList<String> newgrp =new ArrayList<>();
                newgrp.add(word);
                list.add(newgrp);
                keys.add(key);
            }
        }
        return list;
    
            
            
            

        


        
    }
}