package Question_4;

// Question 4: Define a class Resort with the following description:
// Members are: RNo to store Room Number, Name store customer name,
// Charges to store per day charges, Days to store number of days of stay.
// Member functions:
// Compute() to calculate and return Amount as Days * Charges and if the
// values of Days*Charges is more than 11000 then as 1.02*Days*Charges
// Getinfo() A function to enter the content Rno, Name, Charges and Days.
// DispInfo() A function to enter the content Rno, Name, Charges, Days and
// Amount by calling function Compute().

import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    double Charges;
    int Days;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number : ");
        RNo = sc.nextInt();
        System.out.print("Enter Customer Name : ");
        Name = sc.next();
        System.out.print("Enter Per Day Charges : ");
        Charges = sc.nextDouble();
        System.out.print("Enter Number of Days : ");
        Days = sc.nextInt();
    }

    double Compute() {
        double Amount = Days * Charges;
        if (Amount > 11000) {
            Amount = 1.02 * Amount;
        }
        return Amount;
    }

    void DispInfo() {
        System.out.println("==============================");
        System.out.println("Room Number      : " + RNo);
        System.out.println("Customer Name    : " + Name);
        System.out.println("Per Day Charges  : " + Charges);
        System.out.println("Number of Days   : " + Days);
        System.out.println("Total Amount     : " + Compute());
        System.out.println("==============================");
    }
}

public class Main {
    public static void main(String[] args) {

        Resort r1 = new Resort();

        // Taking input from user
        r1.Getinfo();

        // Displaying all details along with computed amount
        r1.DispInfo();

    }
}

// ===================== SAMPLE OUTPUT 1 =====================
// (When Days * Charges is NOT more than 11000 → no extra charge)

// Enter Room Number : 101
// Enter Customer Name : Alice
// Enter Per Day Charges : 500.0
// Enter Number of Days : 5

// ==============================
// Room Number : 101
// Customer Name : Alice
// Per Day Charges : 500.0
// Number of Days : 5
// Total Amount : 2500.0 ← (5 * 500 = 2500, no surcharge)
// ==============================

// ===================== SAMPLE OUTPUT 2 =====================
// (When Days * Charges IS more than 11000 → 2% surcharge applied)

// Enter Room Number : 202
// Enter Customer Name : Bob
// Enter Per Day Charges : 2000.0
// Enter Number of Days : 7

// ==============================
// Room Number : 202
// Customer Name : Bob
// Per Day Charges : 2000.0
// Number of Days : 7
// Total Amount : 14280.0 ← (7 * 2000 = 14000 > 11000, so 1.02 * 14000 = 14280)
// ==============================
