class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer>seen=new HashSet<>();
        int c[]=new int[A.length];
        int cnt=0;

        for(int i=0;i<c.length;i++){
            if(!seen.add(A[i])){
                cnt++;
            }
            if(!seen.add(B[i])){
                cnt++;
            }
            c[i]=cnt;
        }
        return c;
        
    }
}