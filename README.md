Student-Subject Management System

Prerequisites
Before you can run the project, ensure you have the following installed:

- JDK Version: 19 or higher
- Maven (for building the project)
- Postman (for API testing)

1. Clone the Repository:
   
git clone https://github.com/sagar0808/Bootcamp-Assignment.git

2. Navigate to the Project Folder:

cd Bootcamp-Assignment.git

3. Build the Project:

mvn clean install

4. Run the Application:

mvn spring-boot:run

(The application will be accessible at http://localhost:8080)

5. API Endpoints

POST Endpoints
POST /test/students: Create a new student.

Request body example:
JSON
-
{
    "name": "John Doe",
    "address": "123 Main St"
}

POST /test/subjects: Create a new subject.

Request body example: 
JSON
-
{
    "name": "Mathematics"
}


GET Endpoints
GET /test/students: Get a list of all students.

GET /test/subjects: Get a list of all subjects.


**Database**: -
The project uses H2 Database (in-memory) for simple configuration and testing. It is pre-configured in the application.properties file.
