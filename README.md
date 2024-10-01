Cinema Management System
Project Overview
The Cinema Management System is a Java application that demonstrates the use of five creational design patterns: Singleton, Factory Method, Abstract Factory, Builder, and Prototype. The system manages various operations such as movie listings, screens, ticket bookings, concessions, and customer interactions.

Design Patterns Used
Singleton Pattern - Manages global system configuration (e.g., cinema name, number of screens).
Factory Method Pattern - Creates different types of movies (e.g., Regular, 3D, IMAX).
Abstract Factory Pattern - Generates user interfaces with different themes (e.g., Dark Theme, Light Theme).
Builder Pattern - Handles complex ticket bookings by allowing step-by-step customization (e.g., seat selection, snack combos).
Prototype Pattern - Manages movie schedules through cloning to easily modify screening times and dates.

Features
System Configuration: Centralized management of the cinema settings using the Singleton pattern.
Movie Creation: Dynamic creation of different movie types using the Factory Method pattern.
UI Generation: Themed user interfaces for the cinema's booking system using the Abstract Factory pattern.
Ticket Booking: Step-by-step ticket customization using the Builder pattern.
Movie Schedule Management: Efficient cloning and modification of movie schedules using the Prototype pattern.

Getting Started
Prerequisites
Java Development Kit (JDK) 8 or above
A Java IDE such as IntelliJ IDEA or Eclipse

How to Run
Clone the repository:
git clone https://github.com/your-username/cinema-management-system.git
cd cinema-management-system
