This is my first repository
Name  : Datu Ayu Fitria Caesa
NIM   : 264107020087
Class : 1I-TI

# JOBSHEET 6  - SELECTION STRUCTURES WITH GIT AND GITHUB

**Student Identity:**
* **Name:** Datu Ayu Fitria Caesa
* **Student ID (NIM):** 2641070720087
* **Class / Attendance No.:** 1I / 06

---

## 1: PRACTICUM OBJECTIVES

The objectives of conducting this practicum are:

1. Students are able to solve case studies using basic and nested selection structures 
2. Students are able to save and submit their work using Git and GitHub through Visual Studio Code 
3. Students are able to collaborate with classmates using GitHub

---

## 2: EXPERIMENT RESULTS & ANALYSIS

### 2.1 Experiment 1: Basic Selection

#### 2.1.1 Java Source Code
```java
import java.util.Scanner;

public class StudiKasus106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pricePerCup = 20000;
        int totalCup, moneyPaid;
        int totalPrice, discount, totalPayment;
        int change, shortage;

        System.out.print("Enter the number of cups: ");
        totalCup = sc.nextInt();
        System.out.print("Enter money paid: ");
        moneyPaid = sc.nextInt();

        totalPrice = totalCup * pricePerCup;
        discount = 0;

        if (totalPrice >= 100000) {
            discount = totalPrice * 10 / 100;
        }

        totalPayment = totalPrice - discount;

        System.out.println("Total price         : Rp " + totalPrice);
        System.out.println("Discount            : Rp " + discount);
        System.out.println("Total payment       : Rp " + totalPayment);

        if (moneyPaid >= totalPayment) {
            change = moneyPaid - totalPayment;
            System.out.println("Change              : Rp " + change);
        } else {
            shortage = totalPayment - moneyPaid;
            System.out.println("Money is not enough, shortage Rp " + shortage);
        }
    }
}
```

#### 2.1.2 Execution Results / Output Screenshot
The following is the program output after execution:

![Experiment 1 Output](coffeShop.png)


---

### 2.2 Experiment 2: Nested Selection

#### 2.2.1 Java Source Code
```java
import java.util.Scanner;

public class LogicalOperatorWifi06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isStudent;
        boolean isLecturer;
        boolean isBlocked;

        System.out.print("Is the user a student? (true/false): ");
        isStudent = sc.nextBoolean();
        System.out.print("Is the user a lecturer? (true/false): ");
        isLecturer = sc.nextBoolean();
        System.out.print("Is the account currently blocked? (true/false): ");
        isBlocked = sc.nextBoolean();

        if ((isStudent || isLecturer) && !isBlocked) {
            System.out.println("WiFi access granted");
        } else {
            System.out.println("WiFi access denied");
        }
    }
}
```

#### 2.2.2 Execution Results / Output Screenshot
The following is the program output after execution:

![Experiment 2 Output](coffeShop.png)

---

---
