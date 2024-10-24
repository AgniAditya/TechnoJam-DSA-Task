//Q6 Number Spiral Problem.

public class Q6{
    public static long number_spiral(long y, long x) {
       if(y>x){
            long res1=(y-1)*(y-1);
            long res2;
            if(y%2!=0){
                res2=x;
            }else{
                res2=2*y-x;
            }
            return res1+res2;
       }
       else{
            long res1=(x-1)*(x-1);
            long res2;
            if(x%2==0){
                res2=y;
            }else{
                res2=2*x-y;
            }
            return res1+res2;
       }
    }

    public static void main(String[] args) {
        // Default Test Cases
        long[][] test_cases = {
            {2, 3},  // Output: 8
            {1, 1},  // Output: 1
            {4, 2}   // Output: 15
        };

        // Run Test Cases
        for (long[] test_case : test_cases) {
            System.out.println(number_spiral(test_case[0], test_case[1]));
        } 
    }
}

// Sample Output:
// 8
// 1
// 15