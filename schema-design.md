# MySQL Database Design
1. **admin**: id (PK), username, password.
2. **doctor**: id (PK), name, specialty, email, password, phone.
3. **patient**: id (PK), name, email, password, phone, address.
4. **appointment**: id (PK), doctor_id (FK), patient_id (FK), appointment_time, status.
# MongoDB Collection Design
1. **prescriptions**: _id (ObjectId), patientName, appointmentId, medication, dosage, doctorNotes.
