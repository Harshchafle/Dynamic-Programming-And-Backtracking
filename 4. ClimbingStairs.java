public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climb(5));
    }

    public static int climb(int n){
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        int one = climb(n-1);
        int two = climb(n-2);
        return one + two;
    }
}
