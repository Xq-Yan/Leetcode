/*
374.Guess Number Higher or Lower

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example :

Input: n = 10, pick = 6
Output: 6
*/

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       if (n == 1) return 1;
        long l = 1, r = n;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (guess((int) mid) == 1) {
                l = mid + 1;
            } else if (guess((int) mid) == -1) {
                r = mid - 1;
            } else {
                return (int) mid;
            }
        }
        return (int) l;
    }
}
