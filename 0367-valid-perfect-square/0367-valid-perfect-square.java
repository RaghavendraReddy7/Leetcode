class Solution {
    public boolean isPerfectSquare(int num) {

      int sqrt =(int)(Math.pow(num,0.5));
      System.out.print(sqrt);
      if(sqrt*sqrt == num) {
        return true;
      }
      return false;
    }
}