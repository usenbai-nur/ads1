# ADS project

##   Project Description
This project implements 10 fundamental algorithms in Java, covering number theory, combinatorics, and array manipulations. 
Each algorithm is optimized for efficiency and analyzed for time complexity.

##  Implemented Algorithms
1. **Find Minimum in an Array**
2. **Calculate Average of an Array**
3. **Check if a Number is Prime**
4. **Compute Factorial**
5. **Find the N-th Fibonacci Number**
6. **Compute `a^n` (Exponentiation by Squaring)**
7. **Print an Array in Reverse Order**
8. **Check if a String Contains Only Digits**
9. **Compute Binomial Coefficient C(n, k)**
10. **Find GCD Using Euclidean Algorithm**

##  Usage
Clone the repository and run the `Algorithms.java` file to test all functions.

### Example Execution
```java
public class Algorithms {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 7, 6};
        System.out.println("Minimum: " + findMin(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Is prime? " + isPrime(21));
    }
}
```

### Expected Output:
```
Minimum: 2
Average: 4.6
Is prime? false
```


##  Time Complexity Analysis
| Algorithm | Time Complexity |
|-----------|----------------|
| Find Minimum | O(n) |
| Calculate Average | O(n) |
| Check Prime | O(√n) |
| Factorial | O(n) (recursive) |
| Fibonacci | O(n) (dynamic programming) |
| Exponentiation | O(log n) |
| Reverse Array | O(n) |
| Check Digits | O(n) |
| Binomial Coefficient | O(n × k) |
| GCD (Euclidean) | O(log n) |

