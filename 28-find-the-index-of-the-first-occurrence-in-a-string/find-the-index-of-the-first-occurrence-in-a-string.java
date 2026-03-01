class Solution {
    public int strStr(String haystack, String needle){
        int n = 0;
        int m = 0;
        if((haystack.length() - needle.length()<0)){
                return -1;
            }
        for(int i=0;i<=(haystack.length()-needle.length());i++){

            String s = haystack.substring(n,n+needle.length());
            if(s.compareTo(needle)==0 && m == 0){
                m = 1;
                return n;
            }
            n++;
        }
        return -1; 
    }
}