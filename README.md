 Java Learning Journey

Daily Java practice, organized by topic. The numbered folders follow the learning order:

1. `01-Basics`
2. `02-Variables`
3. `03-Operators`
4. `04-Conditional-Statements`
5. `05Loops`
6. `06-Pattern(part-1)`
7. `07-functionAndMethod`

Each folder contains examples and practice programs. Topic notes are saved as `notes.md` files where available.

## Run programs in VS Code

Open this repository's root folder in VS Code and install the **Extension Pack for Java** if prompted. Open a `.java` file and select **Run** above its `main` method. The workspace settings include the current lesson folders as Java source paths, and generated `.class` files go into `bin/`, which Git ignores.

Java requires a JDK. If VS Code asks to add Java to `PATH`, install a JDK and make sure its `bin` folder is on your Windows `PATH`, then restart VS Code. Check the setup in the VS Code terminal with:

```powershell
java -version
javac -version
```

## Daily GitHub workflow

After adding or changing code, run these commands in the VS Code terminal:

```powershell
git add .
git commit -m "Day N: practice <topic>"
git push origin main
```

For example: `git commit -m "Day 12: practice methods"`. Check `git status` first if you want to review which files will be included.
