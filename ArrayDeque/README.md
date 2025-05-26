# 📦 ArrayDeque & LinkedListDeque Recreation (Java)

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

This project is a custom implementation of **double-ended queues (deques)** in Java using both an **array-based** and **linked list-based** approach. The goal was to understand the internal mechanics of deque data structures, including dynamic resizing, element access, and performance optimizations.

---

## 💡 Motivation

I recreated the `ArrayDeque` and `LinkedListDeque` to:
- Gain a deeper understanding of how data structures are implemented from scratch
- Compare the tradeoffs between array-backed and linked-list-backed designs
- Prepare for technical interviews and CS coursework
- Practice modular Java development with interfaces and generics

---

## 🌟 Features

- Full deque functionality: add/remove from both ends
- ArrayDeque with dynamic resizing (circular buffer approach)
- LinkedListDeque with dummy nodes for simplified edge cases
- Generic type support
- `Deque61B` interface for abstraction and testing

---

## 🧰 Tech Stack

- **Language:** Java
- **Concepts:** Data Structures, Generics, Interfaces
- **Tools:** Java Compiler, JDK 8+

---

## ⚙️ Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java IDE (e.g. IntelliJ IDEA, Eclipse)

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/deque-recreation.git
   ```
2. Open the project in your IDE.
3. Make sure all `.java` files are in the correct package (or update the package declarations).
4. Compile and test `LinkedListDeque61B.java` and `ArrayDeque61B.java` using your own or provided test cases.

---

## 🕹️ Usage

- Create a deque object with your desired implementation:
   ```java
   Deque61B<String> deque = new LinkedListDeque61B<>();
   deque.addFirst("Hello");
   deque.addLast("World");
   ```
- Call various deque methods like `removeFirst()`, `removeLast()`, `get(index)`, and `isEmpty()`.

---

## 🖼️ Screenshots

*(Optional: Add any debugging diagrams, performance comparison charts, or sample outputs here)*

---

## 🙌 Credits

This project was created as part of a data structures deep-dive and learning practice.  
Inspired by coursework from UC Berkeley CS 61B.

---

## 📜 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.
