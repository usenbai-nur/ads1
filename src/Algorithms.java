import java.util.Arrays;

public class Algorithms {

    // 1  task
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 2  task
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // 3  task
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 4  task
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 5  task
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    // 6  task
    public static long power(int a, int n) {
        if (n == 0) return 1;
        long half = power(a, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * a;
    }

    // 7  task
    public static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 8  task
    public static boolean isNumeric(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    // 9  task
    public static int binomialCoefficient(int n, int k) {
        int[][] C = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i)
                    C[i][j] = 1;
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }
        return C[n][k];
    }

    // 10  task
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


    //result
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 6};

        System.out.println("1) Min: " + findMin(arr));
        System.out.println("2) Average: " + calculateAverage(arr));
        System.out.println("3) Is 21 Prime? " + isPrime(21));
        System.out.println("4) Factorial of 6: " + factorial(6));
        System.out.println("5) 8th Fibonacci Number: " + fibonacci(8));
        System.out.println("6) 3^5: " + power(3, 5));
        System.out.print("7) Array in reverse: "); printReverse(arr);
        System.out.println("8) Is '123987' Numeric? " + isNumeric("123987"));
        System.out.println("9) Binomial Coefficient C(7,3): " + binomialCoefficient(7, 3));
        System.out.println("10) GCD of 52 and 10: " + gcd(52, 10));
    }
}
