# 📂 Basic maths - Problem Summary
---
This is just a sample file. questions will be added as i keep on practicing...

| # | Problem                                               | Approach               | Time & Space   | Takeaway                 |
|---|-------------------------------------------------------|------------------------|----------------|--------------------------|
| 1 | [Count Digits](CountDigits.java)                      | /10                    | O(logn), O(1)  | /10 to remove last digit |
| 2 | [Reverse a Number](ReverseANumber.java)               | rev *10+ld             | O(logn), O(1)  | find last digit repeatedly|
| 3 | [Check Palindrome](CheckPalindrome.java)              | x> reverseHalf         | O(logn), O(1)  | reverse only 2nd half    |
| 4 | [GCD or HCF](GCDOrHCF.java)                           | Euclidean Algo         | O(log(min(n1,n2))), O(1) | Long Division Method |
| 5 | [ArmstrongNumbers](ArmstrongNumbers.java)             | sum += ld^count        | O(logn), O(1)  | Math.pow returns double  |
| 6 | [Print All Divisors](PrintAllDivisors.java)           | If i is a divisor, so is n / i | O(√n * log n),O(√n) | run loop till √n |
| 7 | [Check for Prime](CheckForPrime.java)                 | break once first divisor is found | O(√n),O(1) |if a no. has any divisor it will be found before √n|