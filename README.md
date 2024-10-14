## G51 Email API Project #
# ----------------------------- 

#  This project is a simple RESTful email management API built using Spring Boot. The main purpose of the API is to allow users to send and manage emails using a MariaDB database. The project follows a layered architecture with the following packages:

domain: Defines the core entities.

dto: Manages the data transfer between layers.

repository: Interfaces with the MariaDB database.

service: Contains business logic.

controller: Handles incoming HTTP requests.

config: Configures the Java Mail setup.
## /*  
                                                                                        
## g51emailapi ## 
|— main/ # 
-----|— java/se/alex/lexicon/g51email/
      |— config/
       |— MailConfig.java
        |— controller/
        |— EmailController.java
        |— domain/
        |— Email.java

        |— dto/
        |— EmailDTO.java
        |— repository/
        — EmailRepository.java
        |— service/
        |— EmailService.java
        |— impl/
         |— EmailServiceImpl.java
           |— G51EmailApiApplication.java
         |— resources/
         |— application.properties



