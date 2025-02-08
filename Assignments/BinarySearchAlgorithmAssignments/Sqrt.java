package Assignments.BinarySearchAlgorithmAssignments;

// https://leetcode.com/problems/sqrtx/description/
public class Sqrt {
    // calculating the square root of any non-negative integer
    public static void main(String[] args) {
        int x = 49;
        int result = findSqrt(x);
        System.out.println("square root of " + x + " is " + result);
    }

    static int findSqrt(int x) {
            if (x == 0 || x == 1) return x; // Edge cases
    
            int low = 1, high = x; 
            while (low <= high) {
                int mid = low + (high - low) / 2; // Avoid overflow
                if (mid == x / mid) return mid; // Same as mid * mid == x but avoids overflow
                else if (mid < x / mid) low = mid + 1; // Move right
                else high = mid - 1; // Move left
            }
            return high; // Floor value of sqrt(x)
    }
}    
