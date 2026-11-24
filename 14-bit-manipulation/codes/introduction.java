public class introduction {
    public static void main(String[] args){
        /* 
            Binary Number System
             0 & 1



            Introduction to Bit Manipulation in Java
Let's understand Bit Manipulation from zero to intermediate level using simple Hinglish explanations and Java examples.
1. What is Bit Manipulation?
Bit Manipulation is a technique in Java in which we directly perform operations on the individual bits (0 and 1) of a number.

Computers internally store data in binary format (0 and 1).

For example:
int a = 5;
int b = 3;


Binary representation:
- 5 = 0101
- 3 = 0011
Using Bit Manipulation, we can perform operations directly on these binary numbers.

Real-world uses:
- Fast mathematical calculations.
- Memory optimization.
- Cryptography and security.
- Competitive programming.
- Data compression.
2. Introduction to Binary Number System
A Binary Number System is a number system that uses only two digits:
0
OFF


1
ON



There are different number systems:
Number System	Base	Digits
Decimal	10	0–9
Binary	2	0, 1
Octal	8	0–7
Hexadecimal	16	0–9, A–F

Decimal to Binary Conversion
Let's convert 10 into binary.

Divide the number by 2 repeatedly and write the remainder.
Division	Quotient	Remainder
10 / 2	5	0
5 / 2	2	1
2 / 2	1	0
1 / 2	0	1

Now read remainders from bottom to top.
Answer
\[
(10)_{10} = (1010)_2
\]

Some important conversions:
Decimal	Binary
1	0001
2	0010
3	0011
4	0100
5	0101
6	0110
7	0111
8	1000
9	1001
10	1010

3. How to convert Decimal to Binary in Java?
Java provides a built-in method:
public class BinaryDemo {
    public static void main(String[] args) {

        int n = 10;

        System.out.println(Integer.toBinaryString(n));
    }
}


Output:
1010


Binary to Decimal in Java
Java also provides:
public class BinaryDemo {
    public static void main(String[] args) {

        String binary = "1010";

        int decimal = Integer.parseInt(binary, 2);

        System.out.println(decimal);
    }
}


Output:
10


4. Types of Bitwise Operators in Java
Java provides 6 important bitwise operators.

| Operator | Name | Work |
|---|---|---|
| & | AND | Both bits 1 → 1 |
| | | OR | Any bit 1 → 1 |
| ^ | XOR | Different bits → 1 |
| ~ | NOT | Reverses all bits |
| << | Left Shift | Shifts bits left |
| >> | Right Shift | Shifts bits right |
A. AND (&)
Both bits must be 1 to get 1.
A	B	A & B
0	0	0
0	1	0
1	0	0
1	1	1

Example:
public class BitDemo {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println(a & b);
    }
}


Binary calculation:
5 = 0101
3 = 0011
------------
    0001 = 1


Output: 1
B. OR (|)
If any one bit is 1, the result is 1.
5 = 0101
3 = 0011
------------
    0111 = 7


C. XOR (^)
If both bits are different, result is 1.
5 = 0101
3 = 0011
------------
    0110 = 6


D. NOT (~)
It reverses all bits.
int a = 5;
System.out.println(~a);


Output:
-6


Why negative? Java uses signed two's complement representation for int. Therefore, ~5 = -6.
E. Left Shift (>)
It shifts bits towards the right.
int a = 5;

System.out.println(a >> 1);


Calculation:
5       = 0101
5 >> 1  = 0010


Output: 2

5. Important Bit Manipulation Concepts
After understanding operators, learn these topics in this order:
1. Get ith Bit
2. Set ith Bit
3. Clear ith Bit
4. Update ith Bit
5. Clear Last i Bits
6. Clear Range of Bits
7. Check if Number is Power of 2
8. Count Set Bits
9. Fast Exponentiation
These are frequently used in Java DSA problems.
        */
    }
}
