# Online-Pharmacy-Management-System-with-Medicine-Details-Using-Collections
Overview
This project is an Online Pharmacy Management System built using Spring Boot. The system allows users to manage medicine details such as ID, name, price, quantity, and description. The application utilizes Java Collections (e.g., List, Map) to store and manage the medicine information.

Functional Requirements
Folder Structure
controller: Contains the REST controller to handle API requests.
MedicineController.java: Handles the REST endpoints for managing medicine data.
model: Contains the entity class for Medicine.
Medicine.java: Defines the Medicine entity with relevant fields.
Medicine Entity
The Medicine class has the following fields:

medicineId (int): Unique identifier for the medicine.
medicineName (String): Name of the medicine.
price (float): Price of the medicine.
quantity (int): Quantity of the medicine in stock.
description (String): Description of the medicine.
The Medicine class includes appropriate constructors, getters, and setters.

API Endpoints
POST /medicines: Adds a new medicine to the pharmacy system.

Request Body: Medicine object.
Response: Returns true if the medicine is successfully added, otherwise false.
PUT /medicines/{medicineId}: Updates the details of an existing medicine with the given medicine ID.

Request Body: Medicine object with updated details.
Response: Returns the updated Medicine object.
Platform Guidelines
JDK Version: OpenJDK 11
Server Port: 8080
Note: Do not modify the application.properties and pom.xml files as it may lead to build and test case failures.

Running the Application
To run the application, navigate to the springapp directory and use the following command:
mvn spring-boot:run
