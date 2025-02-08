# Velvet Orchid - Fullstack Room Booking System

Velvet Orchid is a **full-featured room booking system** built with **React.js** and **Spring Boot**, incorporating **JWT authentication**, **AWS S3 for media storage**, and **role-based access control**. It provides a seamless experience for users to search and book rooms while allowing administrators to manage rooms and bookings efficiently.

## 🌟 Key Features

### 🏡 **User Functionality**
- **Room Search & Results**:
  - User-friendly interface to search for available rooms.
  - Filtered results with pagination for optimized browsing.
- **Room Details**:
  - Comprehensive information including images, descriptions, and pricing.
  - Real-time availability status.
- **Booking Management**:
  - Secure and smooth booking process.
  - View, manage, and cancel bookings from the user dashboard.
- **User Authentication & Profile**:
  - Secure login and registration using **JWT authentication**.
  - Manage and update personal profile information.
- **Guarded Routes**:
  - Ensures only authorized users can access protected pages.

### 🔐 **Admin Functionality**
- **Admin Dashboard**:
  - Centralized panel to manage rooms, bookings, and users.
  - Insights and metrics for platform performance.
- **Room Management**:
  - Add, update, or delete room listings.
  - Secure image storage and management via **AWS S3**.
- **Booking Oversight**:
  - View, approve, or cancel bookings.
  
## 🛠️ **Technology Stack**

### 🌍 **Frontend**
- **React.js** - Interactive and responsive UI
- **Axios** - API communication

### 🚀 **Backend**
- **Spring Boot** - Robust backend framework
- **Spring Security** - Implements authentication and authorization
- **Spring Data JPA** - Database interaction with ORM support
- **AWS S3** - Secure media file storage

### 🗄️ **Database**
- **MySQL** - Relational database for structured data storage

### 🔐 **Authentication**
- **JWT (JSON Web Tokens)** - Stateless and secure authentication mechanism

## 📚 **System Architecture**

### 🏗️ **Entities & Models**
- Well-defined entities for **Users, Rooms, and Bookings**.
- Relationships ensure **data consistency and integrity**.

### 🔄 **DTOs & Mappers**
- **Data Transfer Objects (DTOs)** optimize data exchange.
- Mappers convert entity data between frontend and backend.

### 🛢️ **Repositories**
- Custom repository classes ensure optimized database queries.

### ⚙️ **Service Layer**
- Business logic for users, rooms, and bookings.

### 🔒 **Security Layer**
- Configurations for **CORS, JWT Authentication Filters, and Security Filter Chains**.
- Granular **role-based access control** for users and admins.

### 🔧 **Utility Features**
- Tools for **exception handling, entity-to-DTO mapping, and file storage operations**.

## 🎨 **Frontend Features**

### 📌 **Homepage**
- Engaging landing page showcasing the platform.

### 📍 **Dynamic Components**
- **Navbar & Footer** for seamless navigation.
- **Search & Results Components** for optimized room discovery.

### 📑 **User Pages**
- **Room Search & Results**: Browse available rooms.
- **Find Booking**: Search and manage bookings.
- **Room Details**: View full room information.
- **User Profile**: Edit personal details.
- **Login & Registration**: Secure authentication.

### 🛠 **Admin Pages**
- **Manage Rooms**: Add, update, or delete rooms.
- **Manage Bookings**: Oversee user reservations.

## 🔒 **Security Features**
- **JWT authentication** secures API access.
- **Authentication guards** protect frontend routes.
- **CORS configuration** prevents unauthorized API requests.

## 🚀 **Installation & Setup**

### 🖥 **Backend Setup (Spring Boot)**
```sh
cd VelvetOrchid
mvn clean install
mvn spring-boot:run
```

### 🌍 **Frontend Setup (React.js)**
```sh
cd velvet-orchid-client
npm install
npm start
```

## 📜 **Project Structure**
```sh
recker77-velvet-orchid/
├── VelvetOrchid/   # Backend (Spring Boot)
│   ├── src/main/java/com/hotel/VelvetOrchid
│   │   ├── controller/        # REST Controllers
│   │   ├── entity/            # Database Entities
│   │   ├── repository/        # JPA Repositories
│   │   ├── service/           # Business Logic Layer
│   │   ├── security/          # Security Configuration (JWT, CORS)
│   │   ├── dto/               # Data Transfer Objects
│   │   ├── utils/             # Utility Functions
│   │   ├── exception/         # Exception Handling
│   │   ├── VelvetOrchidApplication.java  # Main Application
│   │   ├── resources/
│   │       └── application.properties  # Configuration
├── velvet-orchid-client/   # Frontend (React.js)
│   ├── src/
│   │   ├── components/       # UI Components
│   │   ├── pages/            # Page Components
│   │   ├── service/          # API Calls & Guards
│   │   ├── App.js            # Main App Component
│   │   ├── index.js          # React Entry Point
│   ├── public/              # Static Assets
│   ├── package.json         # Dependencies
│   ├── .gitignore           # Ignored Files
│   ├── README.md            # Project Documentation
```

## 📌 **Contributing**
Feel free to fork this repository and contribute! Submit a pull request with your changes.



