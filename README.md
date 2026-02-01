# Servlet Assignments - Student ID: 27657

## Overview
Two servlet assignments demonstrating form handling, validation, and HTTP redirects using Jakarta Servlets on Apache Tomcat 10.

---

## Assignment 1: Login Validation Servlet

### Features
- Professional gradient UI design
- Username and password input form
- Password strength validation (minimum 8 characters)
- Styled error messages for weak passwords
- Automatic redirect to search page on successful login
- Personalized welcome message

### Technical Implementation
- POST method handling
- Request parameter extraction
- Conditional response rendering
- URL parameter passing for user context

---

## Assignment 2: Google Search Redirect

### Features
- Clean search interface
- Dynamic welcome message showing logged-in username
- Instant redirect to Google search with user query
- Responsive design matching login page

### Technical Implementation
- GET method handling
- sendRedirect() for external URL navigation
- Query parameter encoding

---

## Project Structure

Servlet Assignments/
├── login.html              # Login form with styled UI
├── search.html             # Search interface with JavaScript
├── WEB-INF/
│   ├── web.xml             # Servlet mappings configuration
│   └── classes/
│       ├── LoginServlet.class
│       └── RedirectServlet.class
└── servlets/
    ├── LoginServlet.java   # Login validation logic
    └── RedirectServlet.java # Google redirect handler


---

## Prerequisites

- *JDK 21* or higher
- *Apache Tomcat 10.1* or higher
- Web browser (Chrome, Firefox, Edge)

---

## Installation & Deployment

### Step 1: Install Apache Tomcat

1. Download Tomcat 10.1 from https://tomcat.apache.org/download-10.cgi
2. Extract to your preferred location (e.g., D:\tomcat\apache-tomcat-10.1.52\)
3. Remember the installation path for later use

### Step 2: Clone Repository
bash
git clone [your-repository-url]
cd [repository-name]
git checkout servlet_27657


### Step 3: Deploy to Tomcat

*Windows:*
bash
xcopy "." "D:\tomcat\apache-tomcat-10.1.52\webapps\ServletAssignments\" /E /I /Y


*Linux/Mac:*
bash
cp -r . /path/to/tomcat/webapps/ServletAssignments/


### Step 4: Start Tomcat

*Windows:*
bash
cd D:\tomcat\apache-tomcat-10.1.52\bin
catalina.bat run


*Linux/Mac:*
bash
cd /path/to/tomcat/bin
./catalina.sh run


Wait for the message: *"Server startup in [X] milliseconds"*

### Step 5: Access Application

Open browser and navigate to:

http://localhost:8080/ServletAssignments/login.html


---

## Testing Instructions

### Test Case 1: Weak Password
1. Navigate to http://localhost:8080/ServletAssignments/login.html
2. Enter username: Moise
3. Enter password: test123 (7 characters)
4. Click *Login*
5. *Expected:* Error message - "Hello Moise, your password is weak. Try a strong one." with "Login Again" button

### Test Case 2: Strong Password
1. Navigate to login page
2. Enter username: Moise
3. Enter password: test12345 (9 characters)
4. Click *Login*
5. *Expected:* Redirect to search page with message "Welcome Moise, type something to fetch"

### Test Case 3: Google Redirect
1. After successful login (you're on search page)
2. Enter search term: java programming
3. Click *Fetch*
4. *Expected:* Redirect to Google search results for "java programming"

---

## Compilation (For Development)

If you modify the servlet source code:
bash
cd servlets

# Compile servlets
javac -cp "D:\tomcat\apache-tomcat-10.1.52\lib\servlet-api.jar" LoginServlet.java RedirectServlet.java

# Copy to WEB-INF/classes
copy *.class ..\WEB-INF\classes\

# Redeploy
xcopy ".." "D:\tomcat\apache-tomcat-10.1.52\webapps\ServletAssignments\" /E /I /Y


*Important:* Restart Tomcat after recompiling servlets (Press Ctrl+C then run catalina.bat run again).

---

## Technologies Used

- *Jakarta Servlet API 6.0* - Server-side request handling
- *HTML5 & CSS3* - Modern responsive UI
- *JavaScript ES6* - Client-side URL parameter handling
- *Apache Tomcat 10.1* - Servlet container
- *Java 21* - Programming language

---

## Design Features

- *Color Scheme:* Purple gradient (#667eea to #764ba2)
- *Layout:* Centered card-based design
- *Typography:* Segoe UI font family
- *Effects:* Smooth transitions, hover animations, focus states
- *Responsive:* Adapts to different screen sizes

---

## Troubleshooting

### Port 8080 Already in Use
bash
# Find process using port 8080
netstat -ano | findstr :8080

# Kill the process (replace PID with actual number)
taskkill /PID [PID_NUMBER] /F


### 404 Error - Page Not Found
- Verify files are deployed to webapps/ServletAssignments/
- Check Tomcat is running (http://localhost:8080 shows Tomcat page)
- Restart Tomcat after deployment
- Hard refresh browser (Ctrl+F5)

### Compilation Errors
- Ensure using jakarta.servlet imports (NOT javax.servlet)
- Verify servlet-api.jar path is correct
- Check you're in the correct directory when compiling

### Servlet Not Found (404 on /login)
- Check web.xml has correct servlet mappings
- Ensure .class files are in WEB-INF/classes/
- Verify servlet class names match exactly
- Restart Tomcat

---

## Learning Outcomes

✅ Understanding servlet lifecycle and HTTP methods  
✅ Form data processing with request parameters  
✅ Input validation and conditional logic  
✅ HTTP redirects using sendRedirect()  
✅ Dynamic response generation with PrintWriter  
✅ Servlet configuration via web.xml  
✅ Modern web UI design principles  

---

## Author

*Name:* Moise Ishimwe  
*Student ID:* 27657  
*Course:* Web Technologies  
*Assignment:* Servlet Programming  

---

## Notes

- This is a learning project demonstrating servlet fundamentals
- Passwords are validated for length only (minimum 8 characters)
- No database or persistent storage implemented
- User data is passed via URL parameters (not production-ready for sensitive data)
- For production use, implement proper authentication, session management, and security measures

---

## License

This project is submitted for academic purposes.
