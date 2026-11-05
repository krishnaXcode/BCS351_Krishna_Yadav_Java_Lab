# BCS351 Java Programming Lab

**Student:** Krishna Yadav  
**Roll Number / Student ID:** BCS2025400  
**Course:** B.Tech CSE - 3rd Semester  
**Subject:** Java Programming Lab (BCS351)

This project contains all **15 assignments and 49 questions** transcribed from the supplied 73-page BCS351 lab PDF. Each question has its own folder with a separate `Main.java`, captured program output, and execution screenshot.

## Project structure

```text
BCS351_Krishna_Yadav_Java_Lab/
├── Assignment-01/
│   ├── Question-01/
│   │   ├── Main.java
│   │   ├── OUTPUT.txt
│   │   └── screenshot.png
│   └── ...
├── Assignment-15/
├── README.md
├── PROJECT-REPORT.md
├── OUTPUT.md
├── run.bat
└── run.sh
```

## Run in VS Code

1. Install a JDK (Java 17 or newer recommended).
2. Open this project folder in VS Code.
3. Open the terminal (`Terminal` → `New Terminal`).
4. Run a question using the helper script:

   **Windows PowerShell / Command Prompt**
   ```bat
   .\run.bat 1 1
   ```

   **macOS / Linux**
   ```bash
   chmod +x run.sh
   ./run.sh 1 1
   ```

   The example runs Assignment 1, Question 1. Replace the first number with the assignment number (1–15) and the second with its question number.

5. Or open any `Main.java` and use the Java extension's **Run** button. You can also run directly from that question folder:
   ```bash
   javac Main.java
   java Main
   ```

## Where to find the results

- `OUTPUT.txt` contains the captured console output for that question.
- `screenshot.png` shows the corresponding terminal-style execution capture.
- `OUTPUT.md` consolidates all question outputs.
- `PROJECT-REPORT.md` lists every problem statement, output and screenshot path.

## Notes

- All Java files use the exact requested student identity: **Krishna Yadav — BCS2025400**.
- Every question is kept separate to avoid conflicts between multiple `public class Main` files.
- Screenshots are terminal-style captures rendered from the actual output of successfully executed Java source files (using Java source-file mode). They are not fabricated output examples.
- The problem statements and assignment order follow the supplied PDF. The PDF's original sample student's identity has not been copied into this project.
