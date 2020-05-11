### **Explanation**

Since I am not allowed to use parsing, I have to thought of mapping character into number.
Furthermore, the output has to be number and not String. I have to make a mathematical solution to work with each digit.

I used `Hashmap` to map each digit character to its digit number. Then cycle through the String to get the number.

Each time a new number is detected, the previously detected number is being padded by times it to the base (which is 10) and add
the newly detected number.
 `sum = sum * 10 + num;`
 
To escape the unrelated characters, I put a condition to escape calculation of the escape number.
`if(num != DEFAULT_ESCAPE) sum = sum * 10 + num;`

##### **Remark**

I am not sure how large the test would be, so I used Long instead of Integer.