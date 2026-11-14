# Java Variables

## 1. Introduction to Variables

In Java, a variable is a name given to a memory location where we can store data.

Think of a variable as a container. Just like a water bottle stores water, a variable stores data such as numbers, text, decimal values, etc.

For example:

```java
int age = 22;
```

Here, `age` is a variable that stores the value `22`.

We use variables because programs often need to store information and use that information later.

For example, if we are creating a student management system, we may need to store a student's name, age, marks and roll number. We can store all this information using variables.

```java
String name = "Prince";
int age = 22;
int marks = 85;
```

In this example, we have created three variables to store three different values.

## 2. How to Create a Variable in Java

To create a variable in Java, we need three important things:

1. Data Type
2. Variable Name
3. Value

The basic syntax is:

```java
dataType variableName = value;
```

Let's understand this with an example:

```java
int age = 22;
```

Here:

- `int` tells Java that we want to store an integer value.
- `age` is the name of the variable.
- `=` is the assignment operator. It assigns a value to the variable.
- `22` is the actual value stored in the variable.

Whenever Java executes this statement, it creates a variable named `age` and stores the value `22` in it.

## 3. Declaration, Initialization and Assignment

These three terms are very important when working with variables in Java.

### Variable Declaration

Declaration means creating a variable by specifying its data type and name.

Example:

```java
int age;
```

Here, we have declared a variable named `age` of type `int`.

However, we have not assigned any value to it yet.

### Variable Initialization

Initialization means assigning a value to a variable for the first time.

Example:

```java
int age = 22;
```

Here, the variable `age` is initialized with the value `22`.

### Variable Assignment

Assignment means giving a value to an already declared variable. We can also change its existing value.

Example:

```java
int age = 22;

age = 25;
```

Initially, `age` contains `22`. After executing `age = 25`, its value becomes `25`.

Complete example:

```java
public class Variables {
    public static void main(String[] args) {

        int age;       // Declaration

        age = 22;      // Initialization

        age = 25;      // Assignment

        System.out.println(age);
    }
}
```

Output:

```text
25
```

Remember: Declaration tells Java what kind of variable we want to create, initialization gives it its first value, and assignment can give it a new value.

## 4. Types of Variables in Java

Java has three main types of variables:

1. Local Variable
2. Instance Variable
3. Static Variable

Let's understand each one with simple examples.

### 4.1 Local Variable

A variable declared inside a method, constructor or block is called a local variable.

A local variable can only be accessed within the method or block where it is declared.

Example:

```java
public class LocalExample {

    public static void main(String[] args) {

        int age = 22;

        System.out.println(age);
    }
}
```

Output:

```text
22
```

In this example, `age` is a local variable because it is declared inside the `main()` method.

We cannot directly access this variable outside the `main()` method.

One important thing to remember is that local variables do not get default values automatically. We must initialize them before using them.

### 4.2 Instance Variable

A variable declared inside a class but outside methods, constructors and blocks, without using the `static` keyword, is called an instance variable.

An instance variable belongs to an object.

This means that whenever we create an object of a class, that object gets its own separate copy of the instance variables.

Example:

```java
public class Student {

    String name;
    int age;

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Prince";
        s1.age = 22;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
```

Output:

```text
Prince
22
```

Let's understand what happens here.

First, we created two instance variables: `name` and `age`.

Then we created an object named `s1` using the `new` keyword.

After creating the object, we assigned values to its variables using the dot (`.`) operator.

For example, `s1.name` means we are accessing the `name` variable of the object `s1`.

Instance variables receive default values if we do not initialize them ourselves.

### 4.3 Static Variable

A variable declared inside a class using the `static` keyword is called a static variable.

A static variable belongs to the class rather than individual objects.

This means that all objects of that class share the same static variable.

Example:

```java
public class Student {

    static String college = "ABC College";

    public static void main(String[] args) {

        System.out.println(Student.college);
    }
}
```

Output:

```text
ABC College
```

In this example, `college` is a static variable because we declared it using the `static` keyword.

We can access a static variable directly using the class name.

For example:

```java
Student.college;
```

We do not need to create an object just to access this static variable.

### Difference Between Local, Instance and Static Variables

The main difference between these variables is where they are declared and what they belong to.

A local variable belongs to a method or block. An instance variable belongs to an object. A static variable belongs to the class and is shared among its objects.

## 5. Rules for Naming Variables in Java

Java has some rules that we must follow when creating variable names.

First, a variable name can contain letters, digits, underscores and dollar signs.

Second, a variable name cannot start with a digit.

Third, spaces are not allowed in variable names.

Fourth, we cannot use Java reserved keywords as variable names.

Fifth, Java variable names are case-sensitive. This means `age`, `Age` and `AGE` are treated as three different variable names.

Examples of valid variable names:

```java
int age;
int studentAge;
int number1;
int _count;
int $price;
```

Examples of invalid variable names:

```java
int 1number;       // Cannot start with a digit

int student age;   // Spaces are not allowed

int class;         // class is a Java keyword

int total@amount;  // @ is not allowed
```

Always try to use meaningful variable names so that other programmers can easily understand your code.

For example, `studentAge` is better than simply using `x`.

## 6. Default Values of Variables

In Java, instance and static variables receive default values automatically when we do not assign values to them.

For example, if we declare an integer instance variable but do not initialize it, Java automatically gives it the value `0`.

Similarly, a boolean variable gets `false`, and a reference variable gets `null`.

Example:

```java
public class DefaultExample {

    int age;
    boolean isStudent;
    String name;

    public static void main(String[] args) {

        DefaultExample obj = new DefaultExample();

        System.out.println(obj.age);
        System.out.println(obj.isStudent);
        System.out.println(obj.name);
    }
}
```

Output:

```text
0
false
null
```

This happens because `age`, `isStudent` and `name` are instance variables.

Important: Local variables do not receive default values. If we try to use a local variable without initializing it, Java gives a compilation error.

## 7. Multiple Variables in Java

Java allows us to declare multiple variables of the same data type in a single statement.

Example:

```java
int a = 10, b = 20, c = 30;
```

Here, we have declared three integer variables in one line.

We can also write them separately:

```java
int a = 10;
int b = 20;
int c = 30;
```

Both approaches are valid in Java.

## 8. Changing the Value of a Variable

One of the important features of variables is that their values can be changed during program execution.

Example:

```java
public class ChangeValue {

    public static void main(String[] args) {

        int number = 10;

        System.out.println(number);

        number = 50;

        System.out.println(number);
    }
}
```

Output:

```text
10
50
```

Initially, the variable `number` contains `10`.

After executing `number = 50`, its value changes to `50`.

This is why we call it a variable: its value can vary or change.

## 9. Constants in Java

Sometimes we want to store a value that should never change during program execution.

For this purpose, Java provides the `final` keyword.

A variable declared using the `final` keyword is called a constant or final variable. Once initialized, its value cannot be reassigned.

Example:

```java
public class ConstantExample {

    public static void main(String[] args) {

        final double PI = 3.14159;

        System.out.println(PI);
    }
}
```

Output:

```text
3.14159
```

If we try to change the value of `PI`, Java will generate a compilation error.

For example:

```java
final int age = 22;

age = 25; // Compilation error
```

Constants are generally written using uppercase letters by convention.

Examples:

```java
final int MAX_AGE = 100;
final double PI = 3.14159;
```

## 10. Complete Example of Variables

Let's combine local, instance and static variables in one program.

```java
public class Student {

    // Instance variables
    String name;
    int age;

    // Static variable
    static String college = "ABC College";

    public static void main(String[] args) {

        // Local variables
        int marks = 85;
        int bonusMarks = 5;

        // Creating an object
        Student s1 = new Student();

        s1.name = "Prince";
        s1.age = 22;

        int totalMarks = marks + bonusMarks;

        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
        System.out.println("College: " + Student.college);
        System.out.println("Total Marks: " + totalMarks);
    }
}
```

Output:

```text
Student Name: Prince
Student Age: 22
College: ABC College
Total Marks: 90
```

In this program:

- `name` and `age` are instance variables because they are declared inside the class but outside methods, without `static`.
- `college` is a static variable because it is declared using the `static` keyword.
- `marks`, `bonusMarks` and `totalMarks` are local variables because they are declared inside the `main()` method.

This single program demonstrates all three main types of variables in Java.

## 11. Important Points to Remember

- A variable is a named memory location used to store data.
- Every variable in Java has a data type.
- Java is a statically typed language.
- A variable must be declared before it is used.
- Local variables must be initialized before use.
- Instance and static variables receive default values.
- Instance variables belong to objects.
- Static variables belong to classes.
- The `final` keyword is used to prevent reassignment.
- Java variable names are case-sensitive.

## 12. Practice Questions

After studying these notes, try to answer the following questions yourself.

1. What is a variable in Java?
2. Why do we use variables?
3. What is the syntax of declaring a variable?
4. What is the difference between declaration and initialization?
5. What is variable assignment?
6. What are the three main types of variables in Java?
7. What is a local variable?
8. What is an instance variable?
9. What is a static variable?
10. What is the difference between instance and static variables?
11. Why must local variables be initialized before use?
12. What are the rules for naming variables?
13. What are default values in Java?
14. What is the purpose of the `final` keyword?
15. Can we declare multiple variables in one statement?

---

**End of Java Variables Notes**