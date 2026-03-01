class Solution {
    public int reverse(int x) {
        int p = 0;
        while(x!=0){
            int digit = (x%10);
            x = x/10;
            if (p < Integer.MIN_VALUE / 10 || (p == Integer.MIN_VALUE / 10 &&  digit < -8 )){
                return 0;
            }
            if(p > Integer.MAX_VALUE / 10 || (p == Integer.MAX_VALUE / 10 && digit > 7 )){
                return 0;   
            }
            p = p*10 + digit;
        }
        return p;
    }
}