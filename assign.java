
// 1. Build Array from Permutation

// import java.util.*;

// public class assign {
//     public static void main(String[] args) {
//         int[] nums = {0, 2, 1, 5, 3, 4};
//         int n = nums.length;
//         int[] ans = new int[n];
//         for (int i = 0; i < n; i++) {
//             ans[i] = nums[nums[i]];
//         }
//         System.out.println(Arrays.toString(ans));
//     }
// }


// 2. Concatenation of Array

// import java.util.*;

// public class assign {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 1};
//         int n = nums.length;
//         int[] ans = new int[2 * n];
//         for (int i = 0; i < n; i++) {
//             ans[i] = nums[i];
//             ans[i + n] = nums[i];
//         }
//         System.out.println(Arrays.toString(ans));
//     }
// }



// 3. Running Sum of 1d Array

// import java.util.*;

// public class assign {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4};
//         int[] ans = new int[nums.length];
//         ans[0] = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             ans[i] = ans[i - 1] + nums[i];
//         }
//         System.out.println(Arrays.toString(ans));
//     }
// }



// 4. Richest Customer Wealth

// public class assign {
//     public static void main(String[] args) {
//         int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
//         int max = 0;
//         for (int i = 0; i < accounts.length; i++) {
//             int sum = 0;
//             for (int j = 0; j < accounts[i].length; j++) {
//                 sum += accounts[i][j];
//             }
//             if (sum > max) {
//                 max = sum;
//             }
//         }
//         System.out.println(max);
//     }
// }



// 5. Shuffle the Array

// import java.util.*;

// public class assign {
//     public static void main(String[] args) {
//         int[] nums = {2, 5, 1, 3, 4, 7};
//         int n = 3;
//         int[] ans = new int[2 * n];
//         int index = 0;
//         for (int i = 0; i < n; i++) {
//             ans[index++] = nums[i];
//             ans[index++] = nums[i + n];
//         }
//         System.out.println(Arrays.toString(ans));
//     }
// }



// 6. Kids With the Greatest Number of Candies

// public class assign {
//     public static void main(String[] args) {
//         int[] candies = {2, 3, 5, 1, 3};
//         int extraCandies = 3;
//         int max = 0;
//         for (int i = 0; i < candies.length; i++) {
//             if (candies[i] > max) {
//                 max = candies[i];
//             }
//         }
//         for (int i = 0; i < candies.length; i++) {
//             System.out.println(candies[i] + extraCandies >= max);
//         }
//     }
// }



// 7. Find the Highest Altitude

// public class assign {
//     public static void main(String[] args) {
//         int[] gain = {-5, 1, 5, 0, -7};
//         int max = 0;
//         int current = 0;
//         for (int i = 0; i < gain.length; i++) {
//             current += gain[i];
//             if (current > max) {
//                 max = current;
//             }
//         }
//         System.out.println(max);
//     }
// }



// 8. Find Numbers with Even Number of Digits

// public class assign {
//     public static void main(String[] args) {
//         int[] nums = {12, 345, 2, 6, 7896};
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int digits = String.valueOf(nums[i]).length();
//             if (digits % 2 == 0) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }



// 9. Number of Good Pairs

// public class assign {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 1, 1, 3};
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }


/* 
11. Sum Multiples

public class assign {
    public static void main(String[] args) {
        int n = 7;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
*/

/*
12. Convert the Temperature

public class assign {
    public static void main(String[] args) {
        double celsius = 36.50;
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32.00;
        System.out.println(kelvin);
        System.out.println(fahrenheit);
    }
}
*/

/*
13. Add Two Integers

public class assign {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        System.out.println(num1 + num2);
    }
}
*/

/*
14. Maximum Number of Words Found in Sentences

public class assign {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            if (words.length > max) {
                max = words.length;
            }
        }
        System.out.println(max);
    }
}
*/

