🍳 CookConnect – Online Cooking Class Platform
A modern, full-stack web application for learning to cook online. CookConnect connects learners with professional chefs and home instructors, making cooking classes accessible, interactive, and fun.

Java Spring Boot   MySQL   HTML5   MIT License

📋 Project Overview
CookConnect is a complete online cooking class platform with:

🍽 Beautiful Landing Page – Featured chefs, trending classes, and categories
🔐 User Authentication – Secure login and registration with role-based access
📚 Class Catalog – Browse available classes with filters and search
🧑‍🍳 Enroll & Attend – Enroll in live or recorded classes
📂 Learning Dashboard – Track enrolled classes, progress, and certificates
👨‍💼 Role-Based Access – Admin, Instructor, and Student roles
🎨 Responsive Design – Works on desktop, tablet, and mobile
✨ Smooth Animations – Food/chef-themed animations and transitions

🚀 Quick Start (5 Minutes)

✅ Prerequisites

Java 17+ installed

Maven 3.9+ installed

MySQL 8.0+ installed and running

Git (optional, for cloning)

1. Clone the Repository
git clone https://github.com/yourusername/online-cooking-class-platform.git
cd online-cooking-class-platform

2. Configure Database

Option A: Using MySQL CLI

-- Login to MySQL
mysql -u root -p

-- Create database and import schema
CREATE DATABASE cooking_class_platform;
USE cooking_class_platform;
SOURCE src/main/resources/database_schema.sql;

-- Verify tables
SHOW TABLES;


Option B: Using MySQL Workbench

Open MySQL Workbench

Click File → Open SQL Script

Select src/main/resources/database_schema.sql

Click Execute (⚡)

Verify 4 tables created: users, classes, enrollments, payments

3. Configure Database Connection

Edit application.properties (create if not exists):

File: src/main/resources/application.properties

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/cooking_class_platform
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA/Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Server Configuration
server.port=8080
spring.application.name=online-cooking-class-platform

4. Build and Run
# Clean build
mvn clean compile

# Package application
mvn package

# Start the server (choose one)
mvn spring-boot:run

# Or run the JAR file
java -jar target/online-cooking-class-platform-0.0.1-SNAPSHOT.jar

5. Access the Application

Home Page: http://localhost:8080/

Login Page: http://localhost:8080/login.html

Register Page: http://localhost:8080/register.html

Class Catalog: http://localhost:8080/classes.html

Dashboard: http://localhost:8080/dashboard.html (after login)

👤 Test Credentials

Admin Account (Full Access)

Email: admin

Password: admin@123

Demo Accounts

Student: student@example.com / Student@123

Instructor: chef@example.com / Chef@123

📁 Project Structure

Online_Cooking_Class_Platform/
├── src/
│   ├── main/
│   │   ├── java/com/cookingclass/
│   │   │   ├── config/
│   │   │   │   ├── DBConnection.java         # Database connection
│   │   │   │   └── SecurityConfig.java       # Spring Security configuration
│   │   │   ├── dao/
│   │   │   │   ├── ClassDAO.java             # Class/course database operations
│   │   │   │   └── UserDAO.java              # User database operations
│   │   │   ├── model/
│   │   │   │   ├── CookingClass.java         # Cooking class entity
│   │   │   │   ├── User.java                 # User entity
│   │   │   │   ├── Enrollment.java           # Enrollment entity
│   │   │   │   └── Payment.java              # Payment entity
│   │   │   ├── servlet/
│   │   │   │   ├── AuthServlet.java          # Authentication (login/register)
│   │   │   │   └── ClassServlet.java         # Class operations
│   │   │   ├── util/
│   │   │   │   ├── PasswordUtils.java        # Password hashing
│   │   │   │   └── SessionUtils.java         # Session management
│   │   │   ├── exception/
│   │   │   │   └── CookingClassException.java # Custom exception
│   │   │   └── CookingClassApplication.java  # Spring Boot entry point
│   │   │
│   │   ├── resources/
│   │   │   ├── application.properties        # Application configuration
│   │   │   └── database_schema.sql           # Database schema
│   │   │
│   │   └── webapp/
│   │       ├── index.html                    # Home/landing page
│   │       ├── login.html                    # Login page
│   │       ├── register.html                 # Registration page
│   │       ├── classes.html                  # Class browsing page
│   │       ├── dashboard.html                # User dashboard
│   │       └── WEB-INF/
│   │           └── web.xml                   # Web application configuration
│   │
│   └── test/
│       └── java/                             # Unit tests (ready to add)
│
├── pom.xml                                   # Maven dependencies
└── README.md                                 # This file


🗄 Database Schema

4 Main Tables

users

user_id, email, username, password_hash, full_name

phone_number, user_type (ADMIN/INSTRUCTOR/STUDENT)

created_at, last_login

classes

class_id, title, description, difficulty_level (Beginner/Intermediate/Advanced)

cuisine_type (Italian, Indian, Chinese, etc.)

instructor_id (foreign key → users)

schedule_time, duration_minutes

mode (LIVE/RECORDED)

price, thumbnail_url, max_seats

enrollments

enrollment_id, user_id, class_id

enrollment_date, status (ENROLLED/COMPLETED/CANCELLED)

completion_certificate_url (nullable)

payments

payment_id, user_id, class_id

amount, payment_method, transaction_id

payment_date, payment_status (SUCCESS/FAILED/PENDING)

🔐 Security Features

Authentication & Authorization

Email-based Login – Secure authentication

Password Hashing – SHA-256 with salt

Session Management – HTTP sessions for user state

Role-Based Access Control – ADMIN, INSTRUCTOR, STUDENT

CSRF Protection – Cross-site request forgery prevention

Data Security

Parameterized Queries – Protection against SQL injection

Input Validation – Frontend & backend validation

CORS Configuration – Secure cross-origin requests (for APIs)

🎨 Frontend Features

Pages

index.html – Landing page with hero banner, featured classes, and chefs

login.html – Modern login form with demo login buttons

register.html – Registration with role selection (Student/Instructor)

classes.html – Browse & filter cooking classes (cuisine, difficulty, price, mode)

dashboard.html – User profile, enrolled classes, upcoming sessions, certificates

Technologies

HTML5 – Semantic markup

Tailwind CSS – Modern utility-first styling

JavaScript ES6+ – Dynamic UI interactions

Font Awesome 6.4 – Icons for utensils, chef hats, timers, etc.

Fetch API – AJAX calls to backend REST APIs

Animations

🍝 Floating Food Icons – Animated spoons, forks, steam effects

🧑‍🍳 Chef Avatars – Subtle scaling/hover effects

✨ Smooth Transitions – Hover, focus, and page load transitions

📍 Bounce Effects – Buttons and call-to-action sections

⚙ Backend Architecture

Framework & Technologies

Spring Boot 3.2.0 – Application framework

Spring Security – Authentication & authorization

Hibernate/JPA – ORM for database interaction

MySQL Driver – Database connectivity

JSON – Standard API data format

REST API Endpoints
Authentication

POST /auth/login – User login

POST /auth/register – User registration

GET /auth/logout – User logout

Classes

GET /classes – Get all available classes

GET /classes/{id} – Get class details

POST /classes – Create a new class (Instructor/Admin only)

PUT /classes/{id} – Update class details (Instructor/Admin)

DELETE /classes/{id} – Delete class (Admin)

Enrollments

POST /enrollments – Enroll in a class

GET /enrollments/user/{userId} – Get all enrollments for a user

GET /enrollments/{id} – Get enrollment details

Payments (optional integration-ready)

POST /payments – Record a payment

GET /payments/user/{userId} – View user payment history

🛠 Development Setup

IntelliJ IDEA

File → Open → Select project folder

File → Project Structure → SDK → Set Java 17

File → Settings → Build, Execution, Deployment → Maven → Configure Maven home

Right-click pom.xml → Maven → Reload project

Click Run → Run 'CookingClassApplication'

Eclipse

File → Import → Existing Maven Projects

Select project folder

Right-click project → Maven → Update Project

Right-click src/main/java → Run As → Java Application

Select CookingClassApplication

VS Code

Install extensions:

Extension Pack for Java

Spring Boot Extension Pack

In terminal:

mvn spring-boot:run


Open http://localhost:8080/

📊 API Examples

Login Request
curl -X POST http://localhost:8080/auth/login \
  -H "Content-Type: application/json" \
  -d '{
    "email": "admin",
    "password": "admin@123"
  }'


Response

{
  "success": true,
  "userId": 1,
  "email": "admin",
  "userName": "Administrator",
  "role": "ADMIN",
  "message": "Login successful"
}

Get Classes
curl http://localhost:8080/classes


🐛 Troubleshooting

Issue: Database Connection Failed
Solution:

# Check MySQL is running
mysql -u root -p


Verify credentials in application.properties

spring.datasource.username=root
spring.datasource.password=root


Issue: Port 8080 Already in Use
Solution:

# Find process using port 8080
netstat -ano | findstr :8080

# Kill the process (Windows)
taskkill /PID <PID> /F


Or change port in application.properties:

server.port=8081


Issue: Maven Build Fails
Solution:

mvn clean
mvn -X clean compile
java -version


Issue: "Registration error: Unexpected token '<'"
Solution:

Set correct header: Content-Type: application/json

Check endpoint URL matches your backend API

Clear browser cache (Ctrl + Shift + Delete)

📚 Additional Resources

Documentation Files (suggested):

BACKEND_ARCHITECTURE.md – Detailed backend explanation

FRONTEND_DOCUMENTATION.md – Frontend structure & components

SQL_CONFIGURATION_GUIDE.md – Database setup guide

QUICK_START_DEPLOYMENT.md – Quick deployment steps (local/VPS/Cloud)

Learning Resources

Spring Boot Documentation

Tailwind CSS Documentation

MySQL Documentation

JavaScript MDN

🤝 Contributing

Contributions are welcome!

Fork the repository

Create a feature branch

git checkout -b feature/amazing-feature


Commit changes

git commit -m "Add amazing feature"


Push to branch

git push origin feature/amazing-feature


Open a Pull Request

📝 License

This project is licensed under the MIT License – see the LICENSE file for details.

👨‍💻 Author

Created by Abhi – Online Cooking Class Platform Developer

🌟 Features Roadmap

v1.0 (Current)
✅ User authentication and authorization
✅ Class listing & filters
✅ Class enrollment
✅ Learning dashboard
✅ Responsive UI

v2.0 (Future)
📧 Email notifications for upcoming classes
🧾 Downloadable recipes & PDFs
📱 Mobile app integration
⭐ Class ratings & reviews
💬 Live chat/Q&A during sessions
📊 Admin analytics & revenue dashboard

📞 Support

For issues or questions:

Check the Troubleshooting section

Review existing GitHub issues

Create a new GitHub issue with full error details

❤ Acknowledgments

Spring Boot – Backend framework

Tailwind CSS – UI styling

Font Awesome – Icons

MySQL – Database

Happy Cooking & Learning! 🍳🍕🍜

Made with ❤ for food lovers and future chefs everywhere.
