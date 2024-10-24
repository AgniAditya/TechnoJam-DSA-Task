//Q3 BITWAR.
public class Q3 {
    public static int BitwiseAND(int left , int right){
        int count = 0;
        while (left != right) {
            left = left >> 1;
            right = right >> 1;
            count++;
        }
        return left << count;
    }

    public static void main(String[] args) {
        System.out.println(BitwiseAND(2111, 2134));
    }
} 