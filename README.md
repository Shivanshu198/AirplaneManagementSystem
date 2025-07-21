 ✈️ Airplane Management System

A full-stack application built using **Spring Boot** (Java) for the backend and **React.js** for the frontend. It allows users to view available flights, book tickets, and manage flight records. The system uses **MongoDB Atlas** as the database.

 📁 Project Structure

AirplaneManagementSystem/
├── backend/      # Spring Boot backend (Java + MongoDB)
├── frontend/     # React frontend (UI & booking system)
└── README.md

 🚀 Features

* ✅ Flight booking system
* ✅ View available flights
* ✅ Add & manage flight data
* ✅ MongoDB Atlas integration
* ✅ RESTful APIs
* ✅ Responsive UI with smooth UX

---

### 🖥️ Technologies Used

**Frontend (React):**

* React.js
* Axios
* React Router
* Bootstrap / Tailwind CSS (optional)

**Backend (Spring Boot):**

* Java 17+
* Spring Boot
* Spring Web
* Spring Data MongoDB
* MongoDB Atlas

---

### ⚙️ How to Run

#### 📦 Backend (Spring Boot)

1. Go to the backend folder:

   ```bash
   cd backend
   ```

2. Update MongoDB URI in `src/main/resources/application.properties`:

   ```
   spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<cluster>.mongodb.net/<dbname>
   ```

3. Run the app:

   ```bash
   mvn spring-boot:run
   ```

> The backend will run on `http://localhost:8080`

---

#### 💻 Frontend (React)

1. Go to the frontend folder:

   ```bash
   cd frontend
   ```

2. Install dependencies:

   ```bash
   npm install
   ```

3. Start the development server:

   ```bash
   npm start
   ```

> The frontend will run on `http://localhost:3000`

---

### 📡 API Endpoints (Sample)

| Method | Endpoint            | Description     |
| ------ | ------------------- | --------------- |
| GET    | `/api/flights`      | Get all flights |
| POST   | `/api/flights/book` | Book a flight   |

---

### 📷 Screenshots (optional)

<img width="1647" height="427" alt="Screenshot 2025-07-22 000451" src="https://github.com/user-attachments/assets/7d094f0b-65d7-421e-9699-243a46f7aacf" />


---

### 📌 License

This project is open-source and available under the [MIT License](LICENSE).

---

### 🤝 Author

**Shivanshu Sharma**
📧 \[shivanshusharmabhu@gmail.com]
🌐 \[https://www.linkedin.com/in/shivanshu-sharma-21202a242/]

---
