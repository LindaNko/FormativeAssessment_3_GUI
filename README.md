### README Summary for InterSA Project

**Project Overview:**
InterSA is a bus company providing travel services across southern Africa. Traditionally, passenger details such as Name, Surname, Destination, and Contact No. were recorded manually in a notebook. InterSA seeks to modernize this process by developing a graphical user interface (GUI) application to digitally record these details.

**Database Setup:**
1. **Database Schema:** Create a schema named `fa3_assessment` using MySQL Workbench.
2. **Table Creation:** Within this schema, create a table named `passenger_details` to store passenger information.

**Table Structure:**
- **Table Name:** `passenger_details`
- **Fields:**
  - `FName` (VARCHAR(15)): Passenger’s first name
  - `LName` (VARCHAR(15)): Passenger’s last name
  - `Dest` (VARCHAR(25)): Passenger’s destination
  - `Phone` (VARCHAR(10)): Passenger’s contact number

**Instructions:**
- Ensure the field names match those specified above.
- The table should be created within the `fa3_assessment` schema.

**Submission:**
- Export the `fa3_assessment` database and compress the dump folder for submission on Colcampus as Question 1.

**Java Swing Application:**
- Use NetBeans IDE to create a Java Swing application (GUI) named `FormativeAssessment 3 GUI.java`.
- The application should interact with the `passenger_details` table, allowing users to enter and view passenger information through the GUI.

This setup will enable InterSA to efficiently manage passenger information and improve the overall travel experience.
