# 04 - Conditional Statements in Java

## 1. Introduction to Conditional Statements

Conditional Statements are used to make decisions in a Java program.

They allow a program to execute different blocks of code depending on whether a given condition is `true` or `false`.

In simple words, conditional statements help a program decide what to do in different situations.

### Real-Life Example

Suppose a student gets marks in an examination.

- If marks are 40 or above, the student passes.
- If marks are below 40, the student fails.

Java uses conditional statements to make these types of decisions.

### Java Example

```java
public class Main {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 40) {
            System.out.println("Student Passed");
        }
    }
}
```

**Output:**
```text
Student Passed
```

## 2. Why Do We Use Conditional Statements?

Conditional statements are used to:

1. Make decisions in a program.
2. Execute code based on conditions.
3. Control the flow of a program.
4. Handle different situations.
5. Build logical programs.

## 3. Types of Conditional Statements in Java

Java provides the following conditional statements:

### 1. if Statement

The `if` statement executes a block of code only when the given condition is true.

### 2. if-else Statement

The `if-else` statement executes one block when the condition is true and another block when the condition is false.

### 3. if-else-if Ladder

The `if-else-if` ladder is used when we need to check multiple conditions.

### 4. Nested if Statement

A nested `if` statement means writing one `if` statement inside another `if` statement.

### 5. switch Statement

The `switch` statement is used to select and execute one block of code from multiple available options.

## 4. Conditional Statements – Learning Roadmap

In this chapter, we will learn:

1. Introduction to Conditional Statements
2. if Statement
3. if-else Statement
4. if-else-if Ladder
5. Nested if Statement
6. switch Statement
7. Difference between if-else and switch
8. Practical Programs using Conditional Statements

## 5. Important Points

- Conditional statements control the flow of a Java program.
- Conditions generally use relational and logical operators.
- A condition must produce a boolean result (`true` or `false`).
- Curly braces `{ }` define the block of code.
- Conditional statements are useful in real-world applications.

## 6. Practice Goals

After completing this chapter, I should be able to:

- Check whether a number is positive, negative