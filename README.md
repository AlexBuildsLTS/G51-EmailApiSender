G51 Email API Project

This project is a simple RESTful email management API built using Spring Boot. The main purpose of the API is to allow users to send and manage emails using a MariaDB database. The project follows a layered architecture with the following packages:

domain: Defines the core entities.

dto: Manages the data transfer between layers.

repository: Interfaces with the MariaDB database.

service: Contains business logic.

controller: Handles incoming HTTP requests.

config: Configures the Java Mail setup.
## /*  
                                                                                        
## g51emailapi ##
|— main/ # 
|— java/se/alex/lexicon/g51email/
|— config/
|— MailConfig.java
|— controller/
|— EmailController.java
|— domain/
|— Email.java
|— dto/
|— EmailDTO.java
|— repository/
|— EmailRepository.java
|— service/
|— EmailService.java
|— impl/
|— EmailServiceImpl.java
|— G51EmailApiApplication.java
|— resources/
|— application.properties

# */

#####################
# Project Features #

Email Management:

Create an email.Configure SMTP and Database Settings:

Update the application.properties file with your SMTP and MariaDB credentials.

Run the Application:

Use IntelliJ IDEA or run it from the terminal using:

./mvnw spring-boot:run

Retrieve a list of emails from the database.

Get details for a specific email by ID.

Send an email using a configured SMTP server.

Dependencies:

Spring Boot (Web, Getting Started

Clone the repository and navigate to the project directory:

git clone https://github.com/username/g51-emailapi.git
cd g51-emailapi
Data JPA, Mail)

Lombok (for reducing boilerplate code)

MariaDB

Configuration:

SMTP settings for sending emails.

Test Endpoints with Postman:

POST /api/emails: Create a new email.

GET /api/emails/{id}: Get a specific email by its ID.

POST /api/emails/send: Send an email to the specified recipient.

REST API Endpoints

POST /api/emails
