## Multi-bracket Validation.


## Challenge
- Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. 

## Approach and Efficiency

- I created a hashMap to store the characters and also created a Stack to traverse these characters. Once I find an open character I push it into the stack and also find the prevailing closing character then pop it out, since at this point they match. I have a validator that checks to see for any matches and if there are not any it returns false.

## API

[My Code](https://github.com/jjblues86/data-structures-and-algorithms-/blob/master/datastructures/src/main/java/utilities/MultiBracketValidation.java)


![](../assets/Multi-bracket%20Validation..jpg)