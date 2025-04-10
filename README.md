# 🚢 Port Management Project in Java

This is a small project developed in **Java** that simulates the management of a seaport. The system allows users to manage **moorings** and **boats**, assign them based on their characteristics, release them, and display the current status of the port.

## 📌 Project Features

This project includes:

- ✅ **Basic methods** for common operations  
- ✅ **Different classes** representing entities like `Boat`, `Mooring`, etc.  
- ✅ **Class inheritance** to handle different types of boats or moorings (`Commercial` and `Recreational`)  
- ✅ A `main` method with an **interactive console menu** for user input  

---

## 📋 Main Menu

When running the program, the following menu is displayed:

```java
System.out.println("\n MAIN MENU OF THE PORT ");
System.out.println("1. Add mooring");
System.out.println("2. Add boat");
System.out.println("3. Assign moorings");
System.out.println("4. Release mooring");
System.out.println("5. Show mooring status");
System.out.println("6. Exit");


Menu Options
Add Mooring
The user inputs the length, draft, and type (Commercial or Recreational) of the new mooring.
Add Boat
The system asks for the boat’s registration number, length, draft, and type.
Assign Moorings
The system tries to assign an available mooring to each boat according to its characteristics.
Release Mooring
The user enters the registration number of a departing boat, and its mooring is freed.
Show Mooring Status
Displays the current status of all moorings: available, occupied, and related information.
Exit
Ends the program.
🧱 Code Structure

The project is composed of several classes:

Boat (superclass)
CommercialBoat and RecreationalBoat (subclasses)
Mooring (superclass)
CommercialMooring and RecreationalMooring (subclasses)
Port
Main (contains the main menu and user input logic)
💡 Educational Purpose

This project is a hands-on introduction to:

Object-Oriented Programming (OOP) in Java
Creating interactive console menus
Managing basic data structures
Using Scanner for user input
Applying inheritance and polymorphism principles
🛠 Requirements

Java 8 or higher
Java-compatible IDE or compiler (e.g., Eclipse, IntelliJ IDEA, VSCode, or terminal)

✅ How to Run

Clone or download this repository.
Open the project in your preferred IDE or terminal.
Compile and run Main.java.
Use the console menu to interact with the system.
