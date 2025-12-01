# ✈ Airline Reservation Database Management System – MySQL

This project implements a **complete relational database model for an Airline Reservation / Flight Booking System**.  
It covers passenger management, itinerary planning, seat allocation, booking transactions, payments, aircraft, flights, fares, and crew assignments.

The database is normalized and designed using **ER Modeling, Many-to-Many bridge tables, and strict relational constraints**.

---

## 📌 Objectives
- Manage passenger details and flight bookings
- Support multiple itineraries, multiple flights per itinerary
- Store seat allocation and fare details per flight
- Maintain aircraft fleet & flight schedule
- Record payment transactions for bookings
- Allocate crew to flights

---

## 🏛 Database Tables & Attributes

### 🔹 Passenger
passenger_id (PK)
first_name
last_name
email
phone_number
gender
date_of_birth
### 🔹 Itinerary
itinerary_id (PK)
passenger_id (FK)
start_date
end_date
### 🔹 ItineraryFlight  (Mapping: Itinerary ↔ Flight)
itinerary_id (FK)
flight_id (FK)
### 🔹 Seat
seat_id (PK)
seat_number
class_type
is_available
aircraft_id (FK)
### 🔹 Booking
booking_id (PK)
booking_date
status
total_amount
flight_id (FK)
payment_id (FK)
### 🔹 PassengerBooking  (Mapping: Passenger ↔ Booking)
passenger_id (FK)
booking_id (FK)
### 🔹 Payment
payment_id (PK)
payment_method
payment_date
amount
status

### 🔹 Aircraft
aircraft_id (PK)
registration_no
model
manufacturer
total_capacity
### 🔹 Flight
flight_id (PK)
flight_number
origin
destination
departure_time
arrival_time
aircraft_id (FK)
### 🔹 Fare
fare_id (PK)
class_type
base_price
tax
total_fare
flight_id (FK)
### 🔹 Crew
crew_id (PK)
crew_name
role
contact_number
experience_years
### 🔹 FlightCrew (Mapping: Flight ↔ Crew)
flight_id (FK)
crew_id (FK)
---

## 🔗 Relationship Summary
| Relationship | Type |
|-------------|------|
| Passenger ↔ Itinerary | 1 to Many |
| Itinerary ↔ Flight | Many to Many (via ItineraryFlight) |
| Passenger ↔ Booking | Many to Many (via PassengerBooking) |
| Booking ↔ Payment | Many to 1 |
| Booking ↔ Flight | Many to 1 |
| Flight ↔ Seat | 1 to Many |
| Flight ↔ Fare | 1 to Many |
| Flight ↔ Aircraft | Many to 1 |
| Flight ↔ Crew | Many to Many (via FlightCrew) |

---

## ▶ How to Run the Project
1. Install MySQL / XAMPP / Workbench
2. Create a database:
CREATE DATABASE airline_db;
USE airline_db;3. Execute the SQL schema file (table creation queries)
4. Insert sample data
5. Run SELECT queries or build application on top of the database

---

## 🧪 Example SQL to View Bookings
SELECT P.first_name, P.last_name, F.flight_number, B.booking_date, B.total_amount
FROM Passenger P
JOIN PassengerBooking PB ON P.passenger_id = PB.passenger_id
JOIN Booking B ON PB.booking_id = B.booking_id
JOIN Flight F ON B.flight_id = F.flight_id;
---

## 🚀 Scope for Future Enhancements
- Trigger for blocking double booking of same seat
- Stored procedure for auto-fare calculation
- Admin dashboard using PHP / JSP / Spring Boot
- Report generation (Monthly revenue / Flight occupancy)

---

## 📌 Project Status
✔ Database fully designed  
✔ Scalable and extendable  
🔜 Web / App integration can be added later

---

📌 *Feel free to explore, modify, and expand this MySQL project.*
