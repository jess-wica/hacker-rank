#Java If-Else

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

[Diagram](https://en.wikipedia.org/wiki/Conditional_%28computer_programming%29)

##Task
Given an integer, , perform the following conditional actions:

- If _n_ is odd, print Weird
- If _n_ is even and in the inclusive range of 2 to 5, print Not Weird
- If _n_ is even and in the inclusive range of 6 to 20, print Weird
- If _n_ is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not  is weird.

###Input Format

A single line containing a positive integer, .

###Constraints

###Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

#####Sample Input 0

    3

#####Sample Output 0

    Weird
    
#####Sample Input 1

    24

#####Sample Output 1

    Not Weird

#####Explanation

_Sample Case 0: n = 3_

3 is odd and odd numbers are weird, so we print Weird.

_Sample Case 1: n = 24_
 
 n > 20 and 24 is even, so it isn't weird. Thus, we print Not Weird.