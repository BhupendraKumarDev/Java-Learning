# Java Learning Journey

Daily Java practice, organized by topic. The current structure covers Basics, Variables, and Operators. Numbered topic folders keep the learning order clear; lowercase package folders keep Java package names valid and aligned with their paths.

## Structure

```text
Java-Learning/
├── 01-Basics/
│   └── basics/
│       └── HelloWorld.java
├── 02-Variables/
│   └── variables/
│       └── Variables.java
└── 03-Operators/
    ├── arithmetic/
    │   ├── Operators.java
    │   └── ArithmeticOperators.java
    ├── relational/
    ├── logical/
    ├── assignment/
    └── unary/
```

VS Code workspace settings mark these three numbered folders as Java source paths. Open the repository root in VS Code and install the **Extension Pack for Java** when prompted.

## Run a program

Use the **Run** link above a class's `main` method in VS Code. For example, from the repository root in PowerShell:

```powershell
javac -d bin 01-Basics/basics/HelloWorld.java
java -cp bin basics.HelloWorld
```

## Daily GitHub workflow

```bash
git status
git add .
git commit -m "Day N: practice <topic>"
git push origin main
```

Use a short topic in the commit message, such as `Day 3: practice arithmetic operators`.
