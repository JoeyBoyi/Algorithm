package com.wayne.algo.code.dp;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wayne
 * @ClassName Fibonacci
 * @Description
 * @Date : 2021/5/29 下午5:40
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(violenceRecursive(n));
        System.out.println(memoRecursive(n));
        System.out.println(arrayIteratorDp(n));
        System.out.println(arrayIteratorDp2(n));
    }

    /**
     * 暴力递归，自顶向下
     *
     * @param n
     * @return
     */
    private static int violenceRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return violenceRecursive(n - 1) + violenceRecursive(n - 2);
    }

    /**
     * 带备忘录递归，自顶向下
     *
     * @param n
     * @return
     */
    private static int memoRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        int[] memo = new int[n + 1];
        return memoHelper(memo, n);
    }

    /**
     * dp table，自底向上，动态规划
     *
     * @param n
     * @return
     */
    private static int arrayIteratorDp(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * dp table，自底向上，动态规划，降低空间复杂度，状态压缩
     *
     * @param n
     * @return
     */
    private static int arrayIteratorDp2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int prev = 1;
        int curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }


    private static int memoHelper(int[] memo, int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = memoHelper(memo, n - 1) + memoHelper(memo, n - 2);
        return memo[n];
    }

}
