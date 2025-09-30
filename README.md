# SmartLib - Library Management System

[![Java](https://img.shields.io/badge/Java-19+-orange.svg)](https://www.oracle.com/java/)
[![MySQL](https://img.shields.io/badge/MySQL-8.0+-blue.svg)](https://www.mysql.com/)
[![NetBeans](https://img.shields.io/badge/NetBeans-GUI-green.svg)](https://netbeans.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A comprehensive desktop library management system built with Java Swing, designed to efficiently manage books, members, and library operations with an intuitive graphical user interface.

## 📚 Overview

SmartLib is a feature-rich library management system that streamlines library operations through a user-friendly desktop application. It supports role-based access control with separate interfaces for administrators and members, comprehensive book and member management, and real-time search capabilities.

## ✨ Features

### 🔐 Authentication System
- **Role-based Login**: Separate access levels for Admin and Member users
- **Secure Database Authentication**: Password-protected user accounts
- **Session Management**: Secure login/logout functionality

### 👨‍💼 Admin Features
- **Book Management**
  - Add new books with title, author, and publication year
  - Update existing book information
  - Delete books from the library catalog
  - Search books by various criteria
- **Member Management**
  - Register new library members
  - Update member information (name, contact details, membership type)
  - Delete member accounts
  - View member details and membership status
- **Library Operations**
  - Complete catalog overview
  - Advanced search and filtering options
  - Member activity monitoring

### 👤 Member Features
- **Book Search**: Search and browse available books
- **Catalog Browsing**: View complete library catalog
- **Personal Dashboard**: Access personal library information
- **User-Friendly Interface**: Intuitive navigation and search tools

### 🛠️ Technical Features
- **Database Integration**: MySQL database for persistent data storage
- **GUI Interface**: Professional Java Swing interface with NetBeans AbsoluteLayout
- **Error Handling**: Comprehensive error management and user feedback
- **Data Validation**: Input validation and data integrity checks

## 🚀 Quick Start

### Prerequisites

Before running SmartLib, ensure you have the following installed:

- **Java Development Kit (JDK) 19 or higher**
- **MySQL Server 8.0 or higher**
- **MySQL Connector/J (included in project)**

### Installation

1. **Clone or Download the Project**
   ```bash
   git clone <repository-url>
   cd Library-Management-System-main
   ```

2. **Set Up MySQL Database**
   ```sql
   CREATE DATABASE library;
   USE library;
   
   -- Create member table
   CREATE TABLE member (
       MemberID INT AUTO_INCREMENT PRIMARY KEY,
       MemberName VARCHAR(100) NOT NULL,
       ContactNum VARCHAR(20),
       MemberType ENUM('Admin', 'Member') NOT NULL,
       Password VARCHAR(100) NOT NULL,
       ExpireDate DATE,
       CardNum INT
   );
   
   -- Create book table
   CREATE TABLE book (
       BookID INT AUTO_INCREMENT PRIMARY KEY,
       Title VARCHAR(200) NOT NULL,
       Author VARCHAR(100) NOT NULL,
       YearPublished YEAR
   );
   
   -- Insert default admin user
   INSERT INTO member (MemberName, MemberType, Password) 
   VALUES ('admin', 'Admin', 'admin123');
   ```

3. **Configure Database Connection**
   
   The application connects to MySQL with these default settings:
   - **Host**: localhost
   - **Port**: 3306
   - **Database**: library
   - **Username**: root
   - **Password**: (empty)
   
   To modify these settings, edit `src/Control/DBConnection.java`:
   ```java
   Connection conn = DriverManager.getConnection(
       "jdbc:mysql://localhost:3306/library", 
       "your_username", 
       "your_password"
   );
   ```

4. **Compile and Run**
   ```bash
   # Compile the project
   javac -d compiled -cp "lib/*" src/View/*.java src/Control/*.java src/Model/*.java
   
   # Copy image resources
   mkdir compiled/View
   copy src/View/*.jpg compiled/View/
   
   # Run the application
   java -cp "compiled;lib/*" View.Login
   ```

## 🏗️ Project Structure

```
SmartLib/
├── src/
│   ├── Control/           # Business logic controllers
│   │   ├── BookControl.java
│   │   ├── DBConnection.java
│   │   ├── LoginControl.java
│   │   └── MemberControl.java
│   ├── Model/             # Data models
│   │   ├── Book.java
│   │   ├── Manage.java
│   │   ├── Member.java
│   │   └── MembershipCard.java
│   └── View/              # GUI components
│       ├── Admin.java     # Admin interface
│       ├── Login.java     # Login screen
│       ├── Member.java    # Member interface
│       └── *.jpg          # UI images
├── lib/                   # External libraries
│   ├── AbsoluteLayout.jar
│   └── mysql-connector-j.jar
├── build/                 # Compiled classes
├── nbproject/             # NetBeans project files
├── build.xml              # Ant build script
└── README.md
```

## 🎯 Usage Guide

### Login Process
1. **Launch the Application**: Run the compiled JAR or execute the main class
2. **Enter Credentials**: Use the login form with your username and password
3. **Select User Type**: The system automatically redirects based on user role

### Default Login Credentials
- **Admin Access**:
  - Username: `admin`
  - Password: `admin123`

### Admin Operations

#### Book Management
1. **Adding Books**:
   - Navigate to Book Management section
   - Fill in book details (Title, Author, Year)
   - Click "Add Book" to save

2. **Updating Books**:
   - Search for the book using the search field
   - Select the book from the table
   - Modify details in the form
   - Click "Update Book"

3. **Deleting Books**:
   - Select the book from the table
   - Click "Delete Book"
   - Confirm the deletion

#### Member Management
1. **Adding Members**:
   - Navigate to Member Management
   - Enter member details (Name, Contact, Type)
   - System auto-generates membership card and expiry date
   - Click "Add Member"

2. **Managing Members**:
   - Search for members using the search functionality
   - Update member information as needed
   - Remove members when necessary

### Member Operations
- **Search Books**: Use the search bar to find books by title, author, or year
- **Browse Catalog**: View all available books in the library
- **View Details**: Access detailed information about books

## 🔧 Configuration

### Database Configuration
Modify `src/Control/DBConnection.java` to change database settings:

```java
public static Connection connect() {
    try {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://your-host:port/database_name", 
            "username", 
            "password"
        );
        Class.forName("com.mysql.cj.jdbc.Driver");
        return conn;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), 
            "Database Connection Error", JOptionPane.ERROR_MESSAGE);
    }
    return null;
}
```

### UI Customization
- **Images**: Replace images in `src/View/` directory
- **Colors/Fonts**: Modify in respective Java files
- **Layout**: Adjust using NetBeans IDE or manually edit layout constraints

## 🛠️ Development

### Building from Source
1. **NetBeans IDE** (Recommended):
   - Open the project in NetBeans
   - Clean and Build (F11)
   - Run (F6)

2. **Command Line**:
   ```bash
   # Using included Ant build script
   ant clean compile jar
   
   # Manual compilation
   javac -d build/classes -cp "lib/*" src/**/*.java
   ```

### Adding Features
The project follows MVC architecture:
- **Models** (`src/Model/`): Add new data structures
- **Views** (`src/View/`): Create new GUI components
- **Controllers** (`src/Control/`): Implement business logic

### Database Schema Extensions
To add new tables or modify existing ones:
1. Update the database schema
2. Create corresponding model classes
3. Implement controller methods
4. Update the GUI components

## 🐛 Troubleshooting

### Common Issues

1. **Database Connection Failed**
   - Verify MySQL server is running
   - Check database credentials in `DBConnection.java`
   - Ensure database `library` exists

2. **ClassNotFoundException: AbsoluteLayout**
   - Ensure `AbsoluteLayout.jar` is in the `lib/` directory
   - Check classpath includes `lib/*`

3. **Images Not Loading**
   - Verify image files are in `compiled/View/` or `src/View/`
   - Check file names match exactly (case-sensitive)

4. **Login Issues**
   - Verify member table has appropriate user records
   - Check password matching (case-sensitive)
   - Ensure MemberType field contains 'Admin' or 'Member'

### Error Messages
- **"Database Connection Error"**: Check MySQL service and credentials
- **"Login Failed"**: Verify username/password combination
- **"Null Pointer Exception"**: Usually indicates missing resources or database records

## 📊 Database Schema

### Member Table
| Column | Type | Description |
|--------|------|-------------|
| MemberID | INT (PK) | Auto-increment primary key |
| MemberName | VARCHAR(100) | Member's full name |
| ContactNum | VARCHAR(20) | Contact number |
| MemberType | ENUM | 'Admin' or 'Member' |
| Password | VARCHAR(100) | Login password |
| ExpireDate | DATE | Membership expiry |
| CardNum | INT | Library card number |

### Book Table
| Column | Type | Description |
|--------|------|-------------|
| BookID | INT (PK) | Auto-increment primary key |
| Title | VARCHAR(200) | Book title |
| Author | VARCHAR(100) | Author name |
| YearPublished | YEAR | Publication year |

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Coding Standards
- Follow Java naming conventions
- Add comments for complex logic
- Update documentation for new features
- Test database operations thoroughly

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Sandu Herath**
- Original Developer and Designer

## 🙏 Acknowledgments

- NetBeans IDE for the GUI builder
- MySQL for database management
- Java Swing for the desktop framework
- AbsoluteLayout library for flexible UI positioning

## 📞 Support

For support, please create an issue in the project repository or contact the development team.

---

**SmartLib** - Making library management smarter, one book at a time! 📚✨