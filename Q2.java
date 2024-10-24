//Q2. Climbing Stairs
public class Q2 {
    public static int climbStairs(int n) {
       //write your code here
       int[] waystoclimb= new int[n+1];
       waystoclimb[0]=1;
       waystoclimb[1]=1;
       for(int i=2;i<=n;i++){
            waystoclimb[i]=waystoclimb[i-1]+waystoclimb[i-2];
       }
       return waystoclimb[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
} 