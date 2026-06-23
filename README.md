# 🛒 Java Billing System

A simple console-based supermarket billing application developed in Java. This program allows users to enter customer details, purchase quantities, generate a formatted bill, apply discounts, calculate cash change, and display the number of notes and coins required for the balance amount.

---

## 📌 Features

* ✅ Enter customer phone number and name
* ✅ Input quantities of grocery items
* ✅ Automatic price calculation
* ✅ 10% discount on total amount
* ✅ Generate formatted bill/receipt
* ✅ Cash payment and balance calculation
* ✅ Display denomination breakdown (notes and coins)
* ✅ Simple console interface

---

## 📦 Available Products

| Product              | Unit Price (Rs.) |
| -------------------- | ---------------- |
| Basmathi Rice        | 250.00           |
| Dhal                 | 180.00           |
| Sugar                | 150.00           |
| Highland Milk Powder | 1200.00          |
| Yoghurt              | 50.00            |
| Flour                | 120.00           |
| Soap                 | 160.00           |

---

## 🛠 Technologies Used

* Java
* Scanner Class
* Console Output Formatting (`printf`)
* Arithmetic Operations
* Conditional Logic

---

## 📂 Project Structure

```
BillPrint.java
README.md
```

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/java-billing-system.git
```

### 2. Navigate to the Project Folder

```bash
cd java-billing-system
```

### 3. Compile the Program

```bash
javac BillPrint.java
```

### 4. Run the Program

```bash
java BillPrint
```

---

## 🖥 Sample Output

```
Enter Customer Phone Number - 0771234567
Enter Customer Name - John

Basmathi Qty(kg)  - 2
Dhal Qty(kg)      - 1
Sugar Qty(kg)     - 3
Highland Qty      - 1
Yoghurt Qty       - 4
Flour Qty(kg)     - 2
Soap Qty          - 1

Total      : Rs. 2850.00
Discount   : Rs. 285.00
Net Amount : Rs. 2565.00
Cash        : Rs. 3000.00
Change      : Rs. 435.00
```

---

## 💰 Currency Denomination Calculation

The program calculates the number of:

* Rs.5000 notes
* Rs.2000 notes
* Rs.1000 notes
* Rs.500 notes
* Rs.100 notes
* Rs.50 notes
* Rs.20 notes
* Rs.10 coins
* Rs.5 coins
* Rs.2 coins
* Rs.1 coins

and displays the total number of notes and coins used for the balance.

---

## 📸 Screenshot

Add screenshots of the program output here.

```
images/output.png
```

---

## 🔮 Future Improvements

* Add item selection menu
* Store records in files or databases
* Generate PDF receipts
* Add GST/VAT calculations
* GUI version using Java Swing or JavaFX
* Save transaction history
* Inventory management system

---

## 👨‍💻 Author

**Sajani Siriwardhana**

* Computing and Information Systems Student
* Java Beginner Developer
* GitHub: `https://github.com/your-username`

---

## 📜 License

This project is open-source and available under the MIT License.
