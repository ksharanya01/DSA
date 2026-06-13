class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int count[]=new int[26];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int sum=0;
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                sum+=weights[ch-'a'];
            }
            sum=sum%26;
            sb.append((char)('z'-sum));

        }
        String res=sb.toString();
        return res;

        
    }
}