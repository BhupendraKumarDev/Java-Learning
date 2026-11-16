# Java Loops

## 1. Introduction to Loops

A **Loop** in Java is used to execute a block of code repeatedly as long as a given condition is true.

Loops help us avoid writing the same code multiple times.

### Why do we use Loops?

Suppose we want to print numbers from 1 to 5.

Without a loop:

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

Using a loop:

```java
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Output:**
```text
1
2
3
4
5
```

Using loops makes our code shorter, cleaner and easier to manage.

---

## 2. Types of Loops in Java

Java provides three main types of loops:

1. for Loop
2. while Loop
3. do-while Loop

Other important loop concepts include:

- Nested Loops
- break Statement
- continue Statement
- Infinite Loop

---

## 3. for Loop

### Definition

A **for loop** is used when we know how many times we want to execute a block of code.

It contains three main parts:

1. Initialization
2. Condition
3. Update

### Syntax

```java
for(initialization; condition; update) {
    // Code to execute
}
```

### Example

```java
public class ForLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }
}
```

**Output:**
```text
1
2
3
4
5
```

### Explanation

- `int i = 1` – Initializes the variable.
- `i <= 5` – Checks whether the condition is true.
- `i++` – Increases the value of i by 1.
- `System.out.println(i)` – Prints the current value.

### How does a for loop work?

| Step | Value of i | Condition | Action |
|---|---:|---|---|
| 1 | 1 | True | Print 1 |
| 2 | 2 | True | Print 2 |
| 3 | 3 | True | Print 3 |
| 4 | 4 | True | Print 4 |
| 5 | 5 | True | Print 5 |
| 6 | 6 | False | Stop loop |

---

## 4. while Loop

### Definition

A **while loop** executes a block of code repeatedly as long as the given condition is true.

It is useful when we do not know exactly how many times the loop will execute.

### Syntax

```java
initialization;

while(condition) {
    // Code to execute

    update;
}
```

### Example

```java
public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;

        while(i <= 5) {
            System.out.println(i);

            i++;
        }

    }
}
```

**Output:**
```text
1
2
3
4
5
```

### Explanation

- `int i = 1` – Initializes the variable.
- `i <= 5` – Checks the condition.
- `System.out.println(i)` – Prints the current value.
- `i++` – Increases the value by 1.

**Important:** If we forget to update the variable, the loop may run infinitely.

---

## 5. do-while Loop

### Definition

A **do-while loop** executes the code block at least once, even if the condition is false.

In this loop, the condition is checked after executing the code.

### Syntax

```java
initialization;

do {
    // Code to execute

    update;

} while(condition);
```

### Example

```java
public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);

            i++;

        } while(i <= 5);

    }
}
```

**Output:**
```text
1
2
3
4
5
```

### Important Example

```java
public class DoWhileExample {
    public static void main(String[] args) {

        int i = 10;

        do {
            System.out.println(i);

        } while(i < 5);

    }
}
```

**Output:**
```text
10
```

### Explanation

The condition `i < 5` is false, but the code executes once because the condition is checked after execution.

---

## 6. Difference Between for, while and do-while

| for Loop | while Loop | do-while Loop |
|---|---|---|
| Entry-controlled loop | Entry-controlled loop | Exit-controlled loop |
| Condition checked before execution | Condition checked before execution | Condition checked after execution |
| Best when repetitions are known | Useful when repetitions are not known in advance | Executes at least once |
| Initialization, condition and update are together | Initialization and update are usually separate | Initialization and update are usually separate |

**Note:**

- Entry-controlled means the condition is checked before executing the loop body.
- Exit-controlled means the condition is checked after executing the loop body.

---

## 7. Nested Loops

### Definition

A **Nested Loop** means placing one loop inside another loop.

The inner loop executes completely for every iteration of the outer loop.

### Syntax

```java
for(initialization; condition; update) {

    for(initialization; condition; update) {

        // Inner loop code

    }

}
```

### Example

```java
public class NestedLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++) {

            for(int j = 1; j <= 2; j++) {

                System.out.println("i = " + i + ", j = " + j);

            }

        }

    }
}
```

**Output:**
```text
i = 1, j = 1
i = 1, j = 2
i = 2, j = 1
i = 2, j = 2
i = 3, j = 1
i = 3, j = 2
```

### Uses of Nested Loops

- Printing patterns
- Working with rows and columns
- Multiplication tables
- Working with two-dimensional arrays

---

## 8. break Statement

### Definition

The **break statement** is used to immediately terminate a loop.

When Java encounters `break`, it exits the nearest enclosing loop.

### Example

```java
public class BreakExample {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {

            if(i == 5) {
                break;
            }

            System.out.println(i);
        }

    }
}
```

**Output:**
```text
1
2
3
4
```

### Explanation

When `i` becomes 5, the condition becomes true and the break statement terminates the loop.

---

## 9. continue Statement

### Definition

The **continue statement** skips the current iteration and moves to the next iteration of the loop.

It does not terminate the entire loop.

### Example

```java
public class ContinueExample {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            if(i == 3) {
                continue;
            }

            System.out.println(i);
        }

    }
}
```

**Output:**
```text
1
2
4
5
```

### Explanation

When `i` becomes 3, the continue statement skips that iteration.

The loop continues with the next value.

---

## 10. Infinite Loop

### Definition

An **Infinite Loop** is a loop that continues executing forever because its condition never becomes false.

### Example 1: Infinite for Loop

```java
public class InfiniteForLoop {
    public static void main(String[] args) {

        for(;;) {
            System.out.println("Hello Java");
        }

    }
}
```

### Example 2: Infinite while Loop

```java
public class InfiniteWhileLoop {
    public static void main(String[] args) {

        while(true) {
            System.out.println("Hello Java");
        }

    }
}
```

**Note:** These examples keep printing until the program is stopped.

### How to avoid an Infinite Loop?

- Use the correct condition.
- Update the loop variable properly.
- Make sure the condition can eventually become false.

---

## 11. Important Points to Remember

1. Loops are used to execute code repeatedly.
2. Java has three main types of loops: for, while and do-while.
3. The for loop is commonly used when the number of repetitions is known.
4. The while loop checks its condition before execution.
5. The do-while loop executes at least once.
6. Nested loops contain one loop inside another.
7. The break statement terminates the nearest enclosing loop.
8. The continue statement skips the current iteration.
9. An infinite loop never terminates on its own.
10. Always check the loop condition and update carefully.

---

## 12. Practice Goals

After completing this chapter, you should be able to:

- Print numbers from 1 to 100.
- Print numbers in reverse order.
- Find the sum of natural numbers.
- Print even and odd numbers.
- Generate multiplication tables.
- Calculate factorial of a number.
- Count the digits of a number.
- Reverse a number.
- Check whether a number is prime.
- Print different patterns using nested loops.
- Use break and continue statements correctly.

---

## 13. Chapter Completion Checklist

- [ ] Introduction to Loops
- [ ] for Loop
- [ ] while Loop
- [ ] do-while Loop
- [ ] Nested Loops
- [ ] break Statement
- [ ] continue Statement
- [ ] Infinite Loop
- [ ] Practice Programs

---

**Next Chapter: Patterns in Java**

In the next chapter, we will use loops and nested loops to create different patterns using stars, numbers and other characters.