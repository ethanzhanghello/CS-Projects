# 📊 N-Grams Time Series Analyzer (Java)

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

This project is a Java-based analyzer for **n-gram frequency trends** over time, similar to Google's Ngram Viewer. It processes large datasets of historical word usage and provides interactive visualizations for users to explore linguistic trends.

The application includes both a backend server and frontend interface to query and plot word frequencies using time series data.

---

## 💡 Motivation

This project was designed to:
- Deepen my understanding of time series analysis and data structures in Java
- Learn how to handle large text-based datasets
- Build a simple but functional server to handle queries and serve visual plots
- Explore natural language trends over time

---

## 🌟 Features

- Query word usage frequency from large historical datasets
- Visualize data in time series plots
- Interactive server with dynamic query responses
- Modular handler classes for scalability
- Object-oriented and testable code structure

---

## 🧰 Tech Stack

- **Language:** Java
- **Libraries:** Java AWT, Java Swing, standard collections
- **Tools:** Java Compiler, JDK 8+, Custom HTTP Server

---

## ⚙️ Getting Started

### Prerequisites

- Java JDK 8 or higher
- Any Java IDE (e.g. IntelliJ IDEA, Eclipse)
- Input files: word frequency CSV files

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/ngrams-analyzer.git
   ```
2. Open the project in your IDE.
3. Ensure all `.java` files are in the correct package.
4. Add or link your historical word frequency data files.
5. Compile and run `NgordnetServer.java`.

---

## 🕹️ Usage

- Launch the server via `NgordnetServer.java`.
- Visit the local server in your browser (usually `http://localhost:XXXX`).
- Enter a query (e.g., `word=hello&startYear=1900&endYear=2000`).
- View the time series graph that displays word frequency trends.

---

## 🖼️ Screenshots

*(Add screenshots of the plotting interface and query UI here)*

---

## 🙌 Credits

Project built independently as part of a course project and personal learning. Special thanks to:
- Java standard documentation and tutorials
- N-gram datasets for providing historical word data
- Visualization support from Java AWT/Swing tools

---

## 📜 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.
