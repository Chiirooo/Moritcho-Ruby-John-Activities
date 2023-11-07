# PEMDAS-calculator
OOP Activity#1 A calculator that solves using the PEMDAS rule, I used stacks to arrange and calculate the values to get the right results
###
Main method is in PemdasDriver.java

##Sample inputs
```
Enter expression: (2+1)-2

    2 + 1 = 3
    3 - 2 = 1

Result: 1 
```

```
Enter expression: (-2 + 3)*4 -1 

    0 - 2 = -2
    -2 + 3 = 1
    1 * 4 = 4 
    4 - 1 = 3 

Result: 3
```

```
Enter expression: ((2 + 1) - 2/2 * (3+1))^2

    2 + 1 = 3 
    2 / 2 = 1 
    3 + 1 = 4 
    1 * 4 = 4 
    3 - 4 = -1
    -1 ^ 2 = 1

Result: 1 
```

```
Enter expression: ( (1020 *12)  /3 )^2   

    1020 * 12 = 12240  
    12240 / 3 = 4080   
    4080 ^ 2 = 16646400

result: 16646400    
```

```
Enter expression: -1 + -3 *-3  
    (-) 1 = -1     has unary operator before the number
    (-) 3 = -3     
    (-) 3 = -3     
        -3 * -3 = 9 
        -1 + 9 = 8 

    result: 8      
```

```
Enter expression: 5(3)+2(40+1) --> input uses parentheses for multiplication
    5 * 3 = 15
    40 + 1 = 41
    2 * 41 = 82
    15 + 82 = 97

result: 97
```