# 🔗 LinkedListDeque Recreation (Java)

## 📌 Table of Contents

- [About the Project](#about-the-project)
- [Motivation](#motivation)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Credits](#credits)
- [License](#license)

---

## 📖 About the Project

This project is a pure Java implementation of a **double-ended queue (deque)** using a **doubly linked list**. It supports constant-time addition and removal from both ends of the deque and includes generic type support for flexible usage.

---

## 💡 Motivation

I built this LinkedListDeque to:
- Reinforce my understanding of linked list structures
- Practice implementing abstract data types from scratch
- Compare performance and structure to Java’s built-in deque
- Improve skills in modular design, edge-case handling, and generics

---

## 🌟 Features

- Add and remove elements from both ends of the deque
- Support for generics (`LinkedListDeque61B<T>`)
- Dummy (sentinel) nodes to simplify logic and avoid null checks
- Interface-driven design (`Deque61B`)
- Recursive and iterative element retrieval

---

## 🧰 Tech Stack

- **Language:** Java
- **Concepts:** Doubly Linked Lists, Generics, Interfaces
- **Tools:** Java Compiler, JDK 8+

---

## ⚙️ Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java IDE (e.g. IntelliJ IDEA, Eclipse)

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/linkedlistdeque-java.git
   ```
2. Open the project in your IDE.
3. Compile `LinkedListDeque61B.java` and use your own tests or add unit tests to validate functionality.

---

## 🕹️ Usage

Example:
```java
LinkedListDeque61B<String> deque = new LinkedListDeque61B<>();
deque.addFirst("CS");
deque.addLast("61B");
System.out.println(deque.removeFirst()); // Outputs: CS
System.out.println(deque.removeLast());  // Outputs: 61B
```

---

## 🖼️ Screenshots

*(Add memory diagrams, printout samples, or performance comparisons if desired)*

---

## 🙌 Credits

Developed as part of a hands-on approach to mastering data structures.  
Thanks to:
- CS 61B-style implementations and assignments
- Java generics and collections documentation

---

## 📜 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.
