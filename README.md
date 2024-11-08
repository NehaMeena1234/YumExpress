# YumExpress
**YumExpress** is a Java SE-based food ordering application that allows users to browse food items, place orders, and manage their selections. This project was developed as an individual project using Java, focusing on creating a seamless and interactive user experience.

## Features
- **Browse Menu**: Users can view a variety of food items.
- **Place Orders**: Users can add items to their cart and proceed to place an order.
- **Order Management**: Ability to view, edit, and cancel orders within the application.
- **User-friendly Interface**: Designed for a smooth and intuitive ordering experience.

## Technology Stack
- **Java SE**: Core functionality and backend logic.
- **Oracle**: Database to store and manage order data and menu items.
- **JDBC**: Java Database Connectivity for MySQL integration.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/YumExpress.git
   cd YumExpress

2. **Setup Database:**
   - Ensure Oracle is installed and running.
   - Create a database named yumexpress:
     
3. **Configure Database Connection:**
  - Update the DBConnection class with your Oracle credentials.
  - String url = "jdbc:mysql://localhost:3306/yumexpress";
  - String user = "your-username";
  - String password = "your-password";
   
4. **Compile the Java files:**
   - javac -d bin src/*.java
   - java -cp bin MainClassName
