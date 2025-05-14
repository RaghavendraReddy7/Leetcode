class Solution {
    public boolean isHappy(int n) {
        while(n!=1&& n!=4){
            int num=0;
            for(int i=n;i>0;i=i/10){
                int r=i%10;
                num+=Math.pow(r,2);
            }
            n=num;
        }
        return n==1;
    }
}