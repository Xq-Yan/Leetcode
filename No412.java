/*
412.Fizz Buzz

Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        String[] res = new String[n];
        for (int i = 1; i * 3 <= n; i++) {
            res[i * 3 - 1] = "Fizz";
        }
        for (int i = 1; i * 5 <= n; i++) {
            if (res[i * 5 - 1] != null) {
                res[i * 5 - 1] = "FizzBuzz";
            } else {
                res[i * 5 - 1] = "Buzz";
            }
        }
        for (int i = 0; i < n; i++) {
            if (res[i] == null)
                res[i] = String.valueOf(i + 1);
        }
        return Arrays.asList(res);
    }
}
