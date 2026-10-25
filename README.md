# Java Studies
Java exercises form my path to becoming a backend developer: logic and OPP problems plus HackerRank solutions.
Every code is documented with Javadoc and written in English.

---

## Structure

- `logic-exercises/` — logic exercises (loops, conditionals, OOP, enums, etc.)
- `hackerrank/` — HackerRank challenge solutions. One folder per solution

---

## Contents

### Logic exercises
| Exercise                                                                                                                                  | Concept                                         |
|-------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------|
| [triangle-classification](https://github.com/LucasLaino/java-exercises/tree/main/logic-exercises/triangle-classification)                 | conditionals, triangle inequality               |
| [second-highest-value](https://github.com/LucasLaino/java-exercises/tree/main/logic-exercises/second-highest-value)                       | arrays, tracking two variables in a single pass |
| [shapes-inheritance-polymorphism](https://github.com/LucasLaino/java-exercises/tree/main/logic-exercises/shapes-inheritance-polymorphism) | abstract class, inheritance, polymorphism       |
| [modified-fizzbuzz](https://github.com/LucasLaino/java-exercises/tree/main/logic-exercises/modified-fizzbuzz)                             | loops, conditionals, String accumulator         |

### HackerRank

| Challenge                                                                                                          | Concept                                            |
|--------------------------------------------------------------------------------------------------------------------|----------------------------------------------------|
| [java-if-else](https://www.hackerrank.com/challenges/java-if-else/problem)                                         | conditionals                                       |
| [fizzbuzz](https://www.hackerrank.com/challenges/fizzbuzz/problem)                                                 | loop,conditionals                                  |
| [java-loops-1](https://www.hackerrank.com/challenges/java-loops-i/problem)                                         | loop                                               |
| [java-loops-2](https://www.hackerrank.com/challenges/java-loops-ii/problem)                                        | nested loops, running accumulationm                |
| [java-output-formatting](https://www.hackerrank.com/challenges/java-output-formatting/problem)                     | printf, format specifiers, zero padding            |
| [java-datatypes](https://www.hackerrank.com/challenges/java-datatypes/problem)                                     | primitive types, try catch, InputMismatchException |
| [java-end-of-file](https://www.hackerrank.com/challenges/java-end-of-file/problem)                                 | reading input until EOF, Scanner.hasNext()         |
| [java-initializer-block](https://github.com/LucasLaino/java-exercises/tree/main/hackerrank/java-initializer-block) | static initialization block, static fields         |

---

## Requirements

- JDK 11 or later (developed with JDK 27). Check your version with `java -version` on terminal.

---

## How to run

Run the commands from the exercise folder.

**Exercises with several files** (compile everything, then run the class that has `main`):

```bash
cd ./logic-exercises/shapes-inheritance-polymorphism/
java Main.java
```

**Single-file solutions** (compile and run in one step):

```bash
cd ./hackerrank/end-of-file/
java ./EndOfFileSolution.java
```

**Solutions that read input** Wait for keyboard input. Each of them includes a sample `input.txt` to feed instead:
```bash
java EndOfFileSolution.java < input.txt
```

On PowerShell: `Get-Content input.txt | Java EndOfFileSolution.java`

---

## Conventions

- Names, comments and documentation in English
- Javadoc on non-trivial methods; HackerRank solutions link to the original challenge (statements are not reproduced)
- Commits follow Conventional Commits
