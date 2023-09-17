class Solution {

  public static int solve(String s) {
    int max = 0, n = 0;
    for (char c : s.toCharArray())
      if ('0' <= c  && c <= '9') { n = n * 10 + c - '0'; max = Math.max(max, n); } else n = 0;
    return max;
  }
  
}

/*
In this Kata, you will be given a string that has lowercase letters and numbers. Your task is to compare the number groupings and return the largest number. Numbers will not have leading zeros.

For example, solve("gh12cdy695m1") = 695, because this is the largest of all number groupings.

Good luck!

Please also try Simple remove duplicates
*/