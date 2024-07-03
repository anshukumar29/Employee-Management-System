# Employee Management System

## Overview

The Employee Management System is a web application built using Spring Boot and Thymeleaf, designed to manage employees' information. It provides functionalities such as adding new employees, updating existing ones, and deleting employees from the database.

## Project Structure

### Controllers
- **EmployeeController**: Manages HTTP requests related to employee management, such as displaying the employee list, adding new employees, updating employee information, and deleting employees.

### Models
- **Employee**: Represents an employee entity with attributes like first name, last name, and email. It is mapped to the database table "employees".

### Services
- **EmployeeService**: Defines methods for managing employees, including getting all employees, saving new employees, retrieving employees by ID, deleting employees, and paginating employee data.

### Repository
- **EmployeeRepository**: Provides CRUD operations for the Employee entity using Spring Data JPA.

### Views (Thymeleaf Templates)
- **index.html**: Displays the list of employees, allows navigation to add new employees, update existing ones, and delete employees.
- **new_employee.html**: Form for adding a new employee.
- **update_employee.html**: Form for updating an existing employee.

## Running the Application
To run the application:
1. Clone the repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd Employee-Management-System`
3. Run the application: `mvn spring-boot:run`

## Configuration
The application is configured to use MySQL database. You can modify the database configuration in the `application.properties` file.

### Default Configuration
- **Database URL**: jdbc:mysql://localhost:3306/Employee_Management_System
- **Username**: root
- **Password**: root

## Dependencies
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL Connector Java

## Usage
The application provides the following functionalities:
- View the list of employees.
- Add a new employee.
- Update an existing employee.
- Delete an employee.

## Documentation
API documentation is not provided in this project as it primarily serves as a web application with UI interactions. However, code comments have been added for clarity and maintenance purposes.

## Contribution
 - Anish Kumar Sharma
