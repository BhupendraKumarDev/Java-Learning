# Java Operators

## 1. Introduction to Operators

In Java, operators are special symbols that are used to perform operations on variables and values.

In simple words, operators help us perform different types of calculations and comparisons in a Java program.

For example, when we add two numbers, we use the `+` operator.

```java
int a = 10;
int b = 20;

int sum = a + b;

System.out.println(sum);
```

**Output:**

```text
30
```

In this example, the `+` operator adds the values of `a` and `b`.

Similarly, Java provides different operators for subtraction, multiplication, division, comparison, logical operations and many other tasks.

## 2. Types of Operators in Java

Java provides several types of operators.

The main types are:

1. Arithmetic Operators
2. Relational Operators
3. Logical Operators
4. Assignment Operators
5. Unary Operators
6. Bitwise Operators
7. Shift Operators
8. Ternary Operator
9. instanceof Operator

Let's understand each type one by one.

---

# 3. Arithmetic Operators

Arithmetic operators are used to perform basic mathematical calculations such as addition, subtraction, multiplication and division.

Java provides the following arithmetic operators:

| Operator | Name | Description |
|---|---|---|
| `+` | Addition | Adds two values |
| `-` | Subtraction | Subtracts one value from another |
| `*` | Multiplication | Multiplies two values |
| `/` | Division | Divides one value by another |
| `%` | Modulus | Returns the remainder |

### 3.1 Addition (+)

The addition operator is used to add two values.

Example:

```java
int a = 10;
int b = 20;

int result = a + b;

System.out.println(result);
```

**Output:**

```text
30
```

Here, the `+` operator adds `10` and `20`, and stores the result in the `result` variable.

### 3.2 Subtraction (-)

The subtraction operator is used to subtract one value from another.

Example:

```java
int a = 20;
int b = 10;

int result = a - b;

System.out.println(result);
```

**Output:**

```text
10
```

Here, Java subtracts `10` from `20`.

### 3.3 Multiplication (*)

The multiplication operator is used to multiply two values.

Example:

```java
int a = 10;
int b = 5;

int result = a * b;

System.out.println(result);
```

**Output:**

```text
50
```

### 3.4 Division (/)

The division operator is used to divide one value by another.

Example:

```java
int a = 20;
int b = 5;

int result = a / b;

System.out.println(result);
```

**Output:**

```text
4
```

**Important:** When we divide two integers, Java returns an integer result. Any fractional part is discarded.

Example:

```java
int a = 10;
int b = 3;

System.out.println(a / b);
```

**Output:**

```text
3
```

If we want a decimal result, we should use `double` or another floating-point type.

```java
double a = 10;
double b = 3;

System.out.println(a / b);
```

**Output:**

```text
3.3333333333333335
```

### 3.5 Modulus (%)

The modulus operator returns the remainder after division.

Example:

```java
int a = 10;
int b = 3;

int result = a % b;

System.out.println(result);
```

**Output:**

```text
1
```

Explanation:

When `10` is divided by `3`, the quotient is `3` and the remainder is `1`.

Therefore, `10 % 3` returns `1`.

**Where is the modulus operator used?**

It is commonly used to:

- Check whether a number is even or odd.
- Find remainders.
- Check divisibility.
- Work with repeating number patterns.

Example: Checking whether a number is even or odd.

```java
int number = 10;

if (number % 2 == 0) {
    System.out.println("Even Number");
} else {
    System.out.println("Odd Number");
}
```

**Output:**

```text
Even Number
```

---

# 4. Relational Operators

Relational operators are used to compare two values.

They compare the values and return a boolean result, which means either `true` or `false`.

Java provides six main relational operators.

| Operator | Name | Description |
|---|---|---|
| `==` | Equal to | Checks whether two values are equal |
| `!=` | Not equal to | Checks whether two values are different |
| `>` | Greater than | Checks whether the left value is greater |
| `<` | Less than | Checks whether the left value is smaller |
| `>=` | Greater than or equal to | Checks whether the left value is greater or equal |
| `<=` | Less than or equal to | Checks whether the left value is smaller or equal |

### 4.1 Equal to (==)

The equal-to operator checks whether two values are equal.

Example:

```java
int a = 10;
int b = 10;

System.out.println(a == b);
```

**Output:**

```text
true
```

Because both values are equal, Java returns `true`.

### 4.2 Not Equal to (!=)

The not-equal operator checks whether two values are different.

Example:

```java
int a = 10;
int b = 20;

System.out.println(a != b);
```

**Output:**

```text
true
```

Because `10` and `20` are different.

### 4.3 Greater than (>)

This operator checks whether the left value is greater than the right value.

Example:

```java
int a = 20;
int b = 10;

System.out.println(a > b);
```

**Output:**

```text
true
```

### 4.4 Less than (<)

This operator checks whether the left value is smaller than the right value.

Example:

```java
int a = 10;
int b = 20;

System.out.println(a < b);
```

**Output:**

```text
true
```

### 4.5 Greater than or Equal to (>=)

This operator checks whether the left value is greater than or equal to the right value.

Example:

```java
int a = 20;
int b = 20;

System.out.println(a >= b);
```

**Output:**

```text
true
```

### 4.6 Less than or Equal to (<=)

This operator checks whether the left value is smaller than or equal to the right value.

Example:

```java
int a = 10;
int b = 20;

System.out.println(a <= b);
```

**Output:**

```text
true
```

**Important:** The `=` operator assigns a value, whereas `==` compares two values. Do not confuse them.

---

# 5. Logical Operators

Logical operators are used to combine or reverse boolean conditions.

They are mostly used with `if`, `else if`, `else` and loop conditions.

Java provides three main logical operators:

| Operator | Name | Description |
|---|---|---|
| `&&` | Logical AND | Returns true when both conditions are true |
| `||` | Logical OR | Returns true when at least one condition is true |
| `!` | Logical NOT | Reverses the boolean result |

### 5.1 Logical AND (&&)

The AND operator returns `true` only when both conditions are true.

Example:

```java
int age = 22;

System.out.println(age >= 18 && age <= 60);
```

**Output:**

```text
true
```

Explanation:

- `age >= 18` is true.
- `age <= 60` is also true.
- Both conditions are true, so the final result is true.

**AND Truth Table:**

| Condition 1 | Condition 2 | Result |
|---|---|---|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

### 5.2 Logical OR (||)

The OR operator returns `true` if at least one condition is true.

Example:

```java
int age = 16;

System.out.println(age < 18 || age > 60);
```

**Output:**

```text
true
```

Explanation:

- `age < 18` is true.
- `age > 60` is false.
- At least one condition is true, so the result is true.

**OR Truth Table:**

| Condition 1 | Condition 2 | Result |
|---|---|---|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

### 5.3 Logical NOT (!)

The NOT operator reverses the boolean result.

If a condition is true, NOT makes it false. If a condition is false, NOT makes it true.

Example:

```java
boolean isJavaEasy = true;

System.out.println(!isJavaEasy);
```

**Output:**

```text
false
```

**NOT Truth Table:**

| Condition | Result |
|---|---|
| true | false |
| false | true |

**Important: Short-Circuit Evaluation**

The `&&` and `||` operators use short-circuit evaluation.

This means Java may skip checking the second condition if the final result is already known from the first condition.

For example:

```java
int a = 10;

System.out.println(a > 5 || a++ > 20);

System.out.println(a);
```

**Output:**

```text
true
10
```

Explanation:

The first condition `a > 5` is true.

Because the OR operator needs only one true condition, Java does not evaluate the second condition.

Therefore, `a++` is not executed, and the value of `a` remains `10`.

---

# 6. Assignment Operators

Assignment operators are used to assign values to variables.

The most basic assignment operator is `=`.

Java also provides compound assignment operators that combine a mathematical operation with assignment.

| Operator | Example | Meaning |
|---|---|---|
| `=` | `a = 10` | Assigns 10 to a |
| `+=` | `a += 5` | Adds 5 to a |
| `-=` | `a -= 5` | Subtracts 5 from a |
| `*=` | `a *= 5` | Multiplies a by 5 |
| `/=` | `a /= 5` | Divides a by 5 |
| `%=` | `a %= 5` | Stores the remainder in a |

### 6.1 Simple Assignment (=)

The assignment operator assigns a value to a variable.

```java
int a = 10;

System.out.println(a);
```

**Output:**

```text
10
```

### 6.2 Addition Assignment (+=)

This operator adds a value to the existing variable value.

```java
int a = 10;

a += 5;

System.out.println(a);
```

**Output:**

```text
15
```

This is equivalent to:

```java
a = a + 5;
```

### 6.3 Subtraction Assignment (-=)

This operator subtracts a value from the existing variable value.

```java
int a = 10;

a -= 5;

System.out.println(a);
```

**Output:**

```text
5
```

### 6.4 Multiplication Assignment (*=)

```java
int a = 10;

a *= 5;

System.out.println(a);
```

**Output:**

```text
50
```

### 6.5 Division Assignment (/=)

```java
int a = 20;

a /= 5;

System.out.println(a);
```

**Output:**

```text
4
```

### 6.6 Modulus Assignment (%=)

```java
int a = 10;

a %= 3;

System.out.println(a);
```

**Output:**

```text
1
```

---

# 7. Unary Operators

Unary operators are operators that work with only one operand.

An operand is simply a value or variable on which an operator performs an operation.

Java provides several unary operators, including:

- Unary plus (`+`)
- Unary minus (`-`)
- Increment (`++`)
- Decrement (`--`)
- Logical complement (`!`)

### 7.1 Unary Plus (+)

Unary plus indicates that a numeric value is positive.

Example:

```java
int a = +10;

System.out.println(a);
```

**Output:**

```text
10
```

### 7.2 Unary Minus (-)

Unary minus changes the sign of a numeric value.

Example:

```java
int a = 10;

System.out.println(-a);
```

**Output:**

```text
-10
```

### 7.3 Increment Operator (++)

The increment operator increases a variable's value by 1.

Example:

```java
int a = 10;

a++;

System.out.println(a);
```

**Output:**

```text
11
```

There are two types of increment operators:

**Pre-Increment (++a)**

In pre-increment, the value is increased first and then used in the expression.

```java
int a = 10;

int result = ++a;

System.out.println(a);
System.out.println(result);
```

**Output:**

```text
11
11
```

Explanation:

First, `a` becomes `11`. Then the updated value is assigned to `result`.

**Post-Increment (a++)**

In post-increment, the current value is used first, and then the variable is increased by 1.

```java
int a = 10;

int result = a++;

System.out.println(a);
System.out.println(result);
```

**Output:**

```text
11
10
```

Explanation:

First, the original value `10` is assigned to `result`. After that, `a` is increased to `11`.

### Difference Between Pre-Increment and Post-Increment

Pre-increment increases the value before using it in an expression.

Post-increment uses the current value first and increases it afterwards.

### 7.4 Decrement Operator (--)

The decrement operator decreases a variable's value by 1.

It also has two forms.

**Pre-Decrement (--a)**

```java
int a = 10;

int result = --a;

System.out.println(a);
System.out.println(result);
```

**Output:**

```text
9
9
```

**Post-Decrement (a--)**

```java
int a = 10;

int result = a--;

System.out.println(a);
System.out.println(result);
```

**Output:**

```text
9
10
```

### 7.5 Logical Complement (!)

The logical complement operator reverses a boolean value.

```java
boolean isActive = true;

System.out.println(!isActive);
```

**Output:**

```text
false
```

---

# 8. Ternary Operator

The ternary operator is a short way of writing a simple `if-else` expression.

It is called a ternary operator because it uses three operands.

Its syntax is:

```java
condition ? valueIfTrue : valueIfFalse;
```

First, Java checks the condition.

If the condition is true, the value before `:` is selected.

If the condition is false, the value after `:` is selected.

Example:

```java
public class TernaryExample {

    public static void main(String[] args) {

        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);
    }
}
```

**Output:**

```text
Adult
```

Explanation:

The condition `age >= 18` is true because the age is 20.

Therefore, Java selects `"Adult"`.

---

# 9. Bitwise Operators

Bitwise operators perform operations directly on the individual bits of integer values.

Computers store integer values internally in binary form, using 0s and 1s.

For example:

```text
5 = 0101
3 = 0011
```

Java provides these bitwise operators:

| Operator | Name |
|---|---|
| `&` | Bitwise AND |
| `|` | Bitwise OR |
| `^` | Bitwise XOR |
| `~` | Bitwise Complement |

### 9.1 Bitwise AND (&)

The bitwise AND operator compares each bit of two numbers.

It returns 1 only when both corresponding bits are 1.

Example:

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

Binary calculation:

```text
  0101
& 0011
------
  0001
```

**Output:**

```text
1
```

### 9.2 Bitwise OR (|)

The bitwise OR operator returns 1 when at least one corresponding bit is 1.

Example:

```java
int a = 5;
int b = 3;

System.out.println(a | b);
```

Binary calculation:

```text
  0101
| 0011
------
  0111
```

**Output:**

```text
7
```

### 9.3 Bitwise XOR (^)

The XOR operator returns 1 when the corresponding bits are different.

If both bits are the same, it returns 0.

Example:

```java
int a = 5;
int b = 3;

System.out.println(a ^ b);
```

Binary calculation:

```text
  0101
^ 0011
------
  0110
```

**Output:**

```text
6
```

### 9.4 Bitwise Complement (~)

The complement operator reverses every bit.

It changes 0 to 1 and 1 to 0.

Example:

```java
int a = 5;

System.out.println(~a);
```

**Output:**

```text
-6
```

In Java, integers use two's complement representation. For an integer `x`, `~x` is equal to `-x - 1`.

---

# 10. Shift Operators

Shift operators are used to move the bits of a number to the left or right.

Java provides three main shift operators:

- `<<` Left Shift
- `>>` Signed Right Shift
- `>>>` Unsigned Right Shift

### 10.1 Left Shift (<<)

The left shift operator moves all bits to the left by the specified number of positions.

Example:

```java
int a = 5;

System.out.println(a << 1);
```

Binary calculation:

```text
5  = 00000101
     00001010 = 10
```

**Output:**

```text
10
```

For positive integers, shifting left by one position generally multiplies the value by 2, provided there is no overflow.

### 10.2 Signed Right Shift (>>)

The signed right shift operator moves bits to the right while preserving the sign bit.

Example:

```java
int a = 8;

System.out.println(a >> 1);
```

**Output:**

```text
4
```

For positive integers, shifting right by one position generally divides the value by 2, discarding any remainder.

### 10.3 Unsigned Right Shift (>>>)

The unsigned right shift operator moves bits to the right and fills the leftmost positions with zeros.

Unlike `>>`, it does not preserve the sign bit.

Example:

```java
int a = 8;

System.out.println(a >>> 1);
```

**Output:**

```text
4
```

For positive numbers, `>>` and `>>>` generally give the same result. Their difference becomes important with negative numbers.

---

# 11. instanceof Operator

The `instanceof` operator is used to check whether an object belongs to a particular class or implements a particular interface.

It returns either `true` or `false`.

Example:

```java
public class InstanceExample {

    public static void main(String[] args) {

        String name = "Java";

        System.out.println(name instanceof String);
    }
}
```

**Output:**

```text
true
```

Explanation:

The variable `name` refers to a String object.

Therefore, the expression `name instanceof String` returns `true`.

This operator is commonly used when working with objects, inheritance and interfaces.

---

# 12. Operator Precedence

When an expression contains multiple operators, Java follows a specific order to decide which operation should be performed first.

This order is called operator precedence.

For example:

```java
int result = 10 + 5 * 2;

System.out.println(result);
```

**Output:**

```text
20
```

Why is the output 20 instead of 30?

Because multiplication has higher precedence than addition.

Java performs multiplication first:

```text
5 * 2 = 10
10 + 10 = 20
```

Parentheses can be used to change the order of evaluation.

Example:

```java
int result = (10 + 5) * 2;

System.out.println(result);
```

**Output:**

```text
30
```

Here, Java performs the operation inside parentheses first.

Some important precedence groups, from higher to lower, are:

1. Postfix operators: `expr++`, `expr--`
2. Unary operators: `++`, `--`, `!`, `~`
3. Multiplication, division and modulus: `*`, `/`, `%`
4. Addition and subtraction: `+`, `-`
5. Shift operators: `<<`, `>>`, `>>>`
6. Relational operators: `<`, `>`, `<=`, `>=`, `instanceof`
7. Equality operators: `==`, `!=`
8. Bitwise AND: `&`
9. Bitwise XOR: `^`
10. Bitwise OR: `|`
11. Logical AND: `&&`
12. Logical OR: `||`
13. Ternary operator: `?:`
14. Assignment operators: `=`, `+=`, `-=`, etc.

**Tip:** When an expression looks confusing, use parentheses to make the order clear.

---

# 13. Difference Between Logical and Bitwise Operators

Logical and bitwise operators may look similar, but they perform different tasks.

Logical operators work with boolean conditions.

Bitwise operators work on individual bits of integer values.

For example:

```java
int a = 5;
int b = 3;

System.out.println(a & b);
System.out.println(a | b);
```

Here, `&` and `|` perform bitwise operations.

Now consider:

```java
boolean x = true;
boolean y = false;

System.out.println(x && y);
System.out.println(x || y);
```

Here, `&&` and `||` perform logical operations.

Remember:

- `&&` means logical AND.
- `&` can mean bitwise AND for integer operands, or non-short-circuit boolean AND.
- `||` means logical OR.
- `|` can mean bitwise OR for integer operands, or non-short-circuit boolean OR.

---

# 14. Important Points to Remember

1. Operators are symbols used to perform operations on values and variables.
2. Arithmetic operators are used for mathematical calculations.
3. Relational operators compare two values and return a boolean result.
4. Logical operators combine or reverse boolean conditions.
5. Assignment operators assign values to variables.
6. Unary operators work with one operand.
7. Increment (`++`) increases a value by 1.
8. Decrement (`--`) decreases a value by 1.
9. The ternary operator is a short form of a simple if-else expression.
10. Bitwise operators work on individual bits.
11. Shift operators move bits left or right.
12. The `instanceof` operator checks an object's type.
13. Operator precedence determines the order in which operations are performed.
14. Parentheses can be used to control the order of evaluation.

---

# 15. Practice Questions

Try to solve these questions by writing Java programs yourself.

### Basic Arithmetic

1. Write a program to add two numbers.
2. Write a program to subtract two numbers.
3. Write a program to multiply two numbers.
4. Write a program to divide two numbers.
5. Write a program to find the remainder of two numbers.
6. Write a program to check whether a number is even or odd.

### Relational Operators

7. Write a program to compare two numbers using `==`.
8. Write a program to find the greater number using `>`.
9. Write a program to check whether a number is less than another number.
10. Write a program to check whether a person is eligible to vote using a relational operator.

### Logical Operators

11. Write a program to check whether a number is between 10 and 50 using `&&`.
12. Write a program to check whether a number is less than 10 or greater than 50 using `||`.
13. Write a program to reverse a boolean value using `!`.

### Assignment and Unary Operators

14. Write a program using the `+=` operator.
15. Write a program using the `-=` operator.
16. Write a program to demonstrate pre-increment.
17. Write a program to demonstrate post-increment.
18. Write a program to demonstrate pre-decrement and post-decrement.

### Advanced Practice

19. Write a program to find the largest of two numbers using the ternary operator.
20. Write a program to demonstrate bitwise AND, OR and XOR.
21. Write a program to demonstrate left shift and right shift.
22. Write a program to check an object's type using `instanceof`.
23. Write a program to demonstrate operator precedence.

---

**End of Java Operators Notes**