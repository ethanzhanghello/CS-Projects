# 🧠 WordNet Explorer (Java)

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

This project is a Java application that loads and interacts with a **WordNet-style lexical database**. It supports querying relationships such as synonyms and hyponyms, and explores word meanings using a directed graph structure.

This WordNet implementation is integrated with a backend server to support web-based queries and visualizations.

---

## 💡 Motivation

I built this project to:
- Understand how semantic relationships between words are structured in databases like WordNet
- Practice working with graphs and traversal algorithms
- Implement server-side handlers for dynamic word analysis
- Combine graph theory with real-world applications like NLP

---

## 🌟 Features

- Parses large WordNet synsets and hypernym files
- Constructs a directed graph of word relationships
- Query support for hyponyms and related words
- Dynamic server for web-based interaction
- Scalable handler and module design

---

## 🧰 Tech Stack

- **Language:** Java
- **Libraries:** Java Collections, Java AWT/Swing
- **Data Structures:** Directed Graphs, Sets, Maps
- **Tools:** Java Compiler, JDK 8+, Custom HTTP Server

---

## ⚙️ Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java IDE (e.g. IntelliJ IDEA, Eclipse)
- WordNet synset and hypernym files

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/wordnet-explorer.git
   ```
2. Import the project into your IDE.
3. Place your `synsets.txt` and `hypernyms.txt` files in the data directory.
4. Compile and run `NgordnetServer.java`.

---

## 🕹️ Usage

- Start the server by running `NgordnetServer.java`.
- Access the local server in your browser (e.g., `http://localhost:4567`).
- Use endpoints such as `/hyponyms?word=change` to explore relationships.
- Output will include all hyponyms or related words in the lexical graph.

---

## 🖼️ Screenshots

*(Add UI or graph structure screenshots here if available)*

---

## 🙌 Credits

Created independently as a project focused on graph-based word networks.  
Special thanks to:
- The original [WordNet database](https://wordnet.princeton.edu/)
- Stanford CS course materials that inspired aspects of the structure
- Java documentation and community forums

---

## 📜 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.
