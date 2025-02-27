# Use Case Descriptions
## Use Case: Create a Science Plan
*Use Case Name:* Create a Science Plan  
*ID:* 1 
*Important Level:* High  
*Primary Actor:* Astronomer  
*Stakeholder and Interest:*
- *Astronomer* wants to create a detailed observation plan.
- *Research Institutions* require structured plans for scheduling telescope time.
- *System Administrator* ensures data integrity and security.

*Brief Description:*
The astronomer creates a science plan that outlines the observations they wish to perform.

*Trigger, Types:*
- *Trigger:* The astronomer initiates the creation of a new science plan.
- *Type:* User-initiated

*Relationships:*  
- *Association:* Astronomer  
- *Include:* -  
- *Extend:* -  
- *Generalization:* -  

### Normal Flow of Events
1. The astronomer selects the option to create a new science plan.
2. The system provides a template for entering observation parameters.
3. The astronomer fills in the required details.
4. The astronomer saves the plan.
5. The system confirms that the plan
6. The astronomer modify a science plan

### Subflows
- *5.1* if the science plan is complete, has been created successfully.
- *5.2* if the science plan is incomplete, the system prompts for missing details and returns to step 3.
- *6.1* if modify, the astronomer modify the science plan
- *6.2* if not modify, the science plan has been created successfully.

### Alternate/Exceptional Flow
- *If the system encounters an error while saving,* it notifies the astronomer and requests a retry.
- *If required parameters are missing,* the system highlights the missing fields and returns to step 3.

---

## Use Case: Test a Science Plan
*Use Case Name:* Test a Science Plan  
*ID:* 2
*Important Level:* High  
*Primary Actor:* Astronomer  
*Stakeholder and Interest:*
- *Astronomer* ensures the feasibility of the plan before submission.
- *System Administrator* monitors simulation performance.

*Brief Description:*
The astronomer tests a science plan before submission to ensure feasibility and accuracy.

*Trigger, Types:*
- *Trigger:* The astronomer selects a plan for testing.
- *Type:* User-initiated

*Relationships:*  
- *Association:* Astronomer  
- *Include:* Operate the Interactive Observing (Virtual Telescope)  
- *Extend:* -  
- *Generalization:* -  

### Normal Flow of Events
1. The astronomer selects an existing science plan for testing.
2. The system simulates the observation.
3. The system checks for inconsistencies or errors in the plan.
4. Operate the Interactive Observing (Virtual Telescope)
5. The system provides feedback on the feasibility of the science plan.

### Subflows
- *5.1* If errors are found, the astronomer revises the plan
- *5.2*  If errors are not found, the plan has been test successfully.

---

## Use Case: Operate the Interactive Observing (Virtual Telescope)
*Use Case Name:* Operate the Interactive Observing (Virtual Telescope)  
*ID:* 3
*Important Level:* Medium  
*Primary Actor:* Astronomer  
*Stakeholder and Interest:*
- *Astronomer* requires a simulated observation experience.
- *System Administrator* ensures virtual telescope performance.

*Brief Description:*
The astronomer interacts with a virtual telescope to simulate observations.

*Trigger, Types:*
- *Trigger:* The astronomer initiates interactive observation.
- *Type:* User-initiated

*Relationships:*  
- *Association:* Astronomer  
- *Include:* -  
- *Extend:* - 
- *Generalization:* -  

### Normal Flow of Events
1. The astronomer starts the interactive observing mode.
2. The astronomer adjusts settings such as focus, zoom, and positioning.
3. The astronomer initiates a test observation.
4. The system displays the simulated observation results.
5. If the astronomer closes the interactive observing mode, the system stops the operation and exits the session.

### Subflows
4.1 If fine-tuning is needed, the astronomer returns to step 2.
### Alternate/Exceptional Flow
- *If the system loses connection to virtual telescope data,* the session is paused, and the user is notified.

---

## Use Case: Submit a Science Plan
*Use Case Name:* Submit a Science Plan  
*ID:* 4
*Important Level:* High  
*Primary Actor:* Astronomer  
*Stakeholder and Interest:*
- *Astronomer* ensures that the plan is successfully submitted for execution.
- *Research Institutions* rely on submitted plans for scheduling observations.

*Brief Description:*
The astronomer submits a validated science plan for execution.

*Trigger, Types:*
- *Trigger:* The astronomer submits the plan.
- *Type:* User-initiated

*Relationships:*  
- *Association:* Astronomer  
- *Include:* -  
- *Extend:* -  
- *Generalization:* -  

### Normal Flow of Events
1. The astronomer selects a validated science plan.
2. The system checks for required approvals.
3. The astronomer submits the plan.
4. The system confirms submission and schedules the observation.

### Subflows
2.1 If approvals are missing, the system requests them before proceeding.

### Alternate/Exceptional Flow
- *If approvals are incomplete,* the submission is delayed until all approvals are obtained.

---

## Use Case: Access Astronomical Data  

*Use Case Name:* Access Astronomical Data  
*ID:* 5  
*Important Level:* High  
*Primary Actor:* Astronomer  

### Stakeholder and Interest:  
- *Astronomer* wants to access and analyze collected astronomical data.  
- *Research Institutions* require access to structured and validated astronomical data.  
- *System Administrator* ensures data security and efficient retrieval.  

### Brief Description:  
The astronomer retrieves previously collected astronomical data for analysis.  

### Trigger, Types:  
- *Trigger:* The astronomer requests access to stored astronomical data.  
- *Type:* User-initiated  

### Relationships:  
- *Association:* Astronomer  
- *Include:* -  
- *Extend:* -  
- *Generalization:* -  

### Normal Flow of Events  
1. The astronomer selects the option to access astronomical data.  
2. The astronomer enters the search criteria.  
3. The system retrieves relevant data based on the provided criteria.   
4. The system processes the request and provides a download link.  
5. The astronomer downloads the data. 

### Subflows  
- *3.1* If adjustments to the search criteria are needed, the astronomer returns to step 2. 
- *5.1* If the astronomer wants to download data, they select the desired files.  




---

## Use Case: Access Live View of Telescope
*Use Case Name:* Access Live View of Telescope  
*ID:* 6
*Important Level:* Medium  
*Primary Actor:* Astronomer  
*Stakeholder and Interest:*
- *Astronomer* monitors real-time observations.

*Brief Description:*
The astronomer accesses the live feed from the telescope to monitor real-time observations.

*Trigger, Types:*
- *Trigger:* The astronomer selects the live view option.
- *Type:* User-initiated

*Relationships:*  
- *Association:* Astronomer  
- *Include:* -  
- *Extend:* -  
- *Generalization:* -

### Normal Flow of Events
1. The astronomer selects the "Live View" option.
2. The system attempts to establish a connection with the telescope’s live feed.
3. The system displays the live feed to the astronomer.
4. The astronomer observes the data and, if necessary, adjusts settings or changes the viewpoint.
5. If the connection is interrupted, the system automatically attempts to reconnect.
6. The astronomer can exit the "Live View" mode when no longer needed.

### Alternate/Exceptional Flow
- *If the connection fails repeatedly,* the system notifies the astronomer and logs the issue.

# Activity Diagrams
## Activity Diagram 1 Create a Science Plan
![activity diagram 1 Create a Science Plan](https://github.com/user-attachments/assets/546e3139-1ad5-4a5a-bc2d-b784f459aefa)
## Activity Diagram 2 Test a Science Plan
![activity diagram 2 Test a Science Plan](https://github.com/user-attachments/assets/da6199d5-cfcf-4c8a-b3c8-491a6b625aff)
## Activity Diagram 3 Operate the Interactive Observing
![activity diagram 3 Operate the Interactive Observing](https://github.com/user-attachments/assets/c8ace34a-2b78-4fd9-9f5a-419956ae9a0d)
## Activity Diagram 4 Submit a Science Plan
![activity diagram 4 Submit a Science Plan](https://github.com/user-attachments/assets/cee6dfef-bc4a-494d-bb30-f37937d7d135)
## Activity Diagram 5 Access Astronomical Data
![activity diagram 5 Access Astronomical Data](https://github.com/user-attachments/assets/566bfc92-ea16-485e-812e-e529f46a5f46)
## Activity Diagram 6 Access Live View of Telescope
![activity diagram 6 Access Live View of Telescope](https://github.com/user-attachments/assets/e989b3b0-e23f-4a6b-ba46-62fe43acdb69)

# Class Diagram
![Image](https://github.com/user-attachments/assets/03e68ab9-804f-4e31-97df-090fddbd1ba5)

# Sequence Diagram
## Sequence Diagram 1 Create a Science Plan
![image](https://github.com/user-attachments/assets/31aca340-900f-4c6d-9731-ee57fc5c0ae3)
## Sequence Diagram 2 Test a Science Plan
![image](https://github.com/user-attachments/assets/7c022ac6-77e0-4b42-bfda-2f6cb2fd48ab)
## Sequence Diagram 3 Operate the Interactive Observing
![image](https://github.com/user-attachments/assets/f8e3f284-255f-4012-a940-d394383e194d)
## Sequence Diagram 4 Sequence_Submit a Science Plan
![4_Sequence_Submit a Science Plan  (1)](https://github.com/user-attachments/assets/6c60c821-5bc2-4df0-96ee-d51c124319d7)
## Sequence Diagram 5 Sequence_Access Astronomical Data
![5_Sequence_Access Astronomical Data (2)](https://github.com/user-attachments/assets/530742e2-f005-49fc-a3fc-e3e012e2a283)
## Sequence Diagram 6 Access Live View of Telescope
![6_Sequence_Access Live View of Telescope (5)](https://github.com/user-attachments/assets/b440e01c-b5de-4d00-aca9-7415a4959ecc)




