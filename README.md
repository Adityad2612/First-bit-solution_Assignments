# 📚 Book Management System – C Programming (Console Application)

This project is a **menu-driven console based Book Management System** written in **C language using Structure and Arrays**.  
It allows users to manage books with operations like adding, removing, searching, updating, and sorting.

---

## ✨ Features

| Feature | Description |
|--------|-------------|
| Display Books | Shows database in table format |
| Add Book | Add one or multiple new books |
| Remove Book | Remove book by ID or Name |
| Search Book | Search by ID, Name or Author |
| Show Books | Filter by Author or Category |
| Update Book | Update price, rating or discount |
| Sort Books | Sort by Price, Rating or Discount |
| Exit | Quit the program safely |

---

## 🧾 Book Attributes

Each book contains the following information:

| Field | Type |
|------|------|
| Book ID | int |
| Name | char[40] |
| Author Name | char[30] |
| Category | char[20] |
| Price | int |
| Rating | double |
| Discount | double |

---

## 📌 Project Architecture

Main()
└── store() → Loads initial 6 books
└── display() → Show all books
└── addbook() → Add new books
└── removebooks() → Remove book by ID or Name
└── searchbook() → Search by ID / Name / Author
└── showbook() → Filter by Author / Category
└── updatebook() → Update price / rating / discount
└── sortbook() → Sort (price / rating / discount)
└── swapping() → swap helper function
---

## ▶️ How to Run

1. Open in **VS Code / Turbo C / Dev-C++ / CodeBlocks**
2. Compile using:
gcc project.c -o project
3. Run the program:

---

## 📂 Functional Overview

| Function | Purpose |
|----------|---------|
| store() | Loads pre-defined books |
| display() | Prints books in table format |
| addbook() | Add new record(s) |
| removebooks() | Delete book by ID or Name |
| searchbook() | Find book by ID, Name or Author |
| showbook() | Display based on Author or Category |
| updatebook() | Modify price / rating / discount |
| sortbook() | Sort in ascending / descending |
| swapping() | Helper function to swap elements |

---

## 🧪 Sample Menu

===== Book Management System =====

1.Display books

2.Add a new book

3.Remove a book

4.Search for a book

5.Show books by author or category

6.Update book price, rating, or discount

7.Sort books by price, rating or discount

8.Exit
Enter your choice:

---

## 🛠 Tech Stack Used

| Technology | Purpose |
|-----------|---------|
| C Language | Main program |
| Structures | Book details object model |
| Arrays | Storage of book records |
| File Handling | ❌ Not used in this version |
| Dynamic Memory | malloc / realloc used |

---

## 🚀 Scope for Future Enhancements

🔸 File handling to store book data permanently  
🔸 Export report to CSV / PDF  
🔸 GUI using GTK or C++ Qt  
🔸 Web + database integration (PHP + MySQL)

---

## 📌 About the Project

This program is designed to give hands-on experience in:
- Structure & Array concepts
- Searching & Sorting algorithms
- Dynamic memory allocation
- Real-world CRUD application logic
- Modular programming in C

---

🔹 *Feel free to improve and extend this project.*

