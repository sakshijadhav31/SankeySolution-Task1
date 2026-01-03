# Student Attendance Management System

A simple **console‑based Java application** that manages student attendance using core **data structures** like `Queue`, `Stack`, and `HashSet`. This project demonstrates how to track attendance, check presence, and manage entries efficiently using appropriate Java collections.

## Features

✔ Add student attendance (no duplicates)  
✔ Check if a student is present  
✔ Remove last recorded attendance  
✔ Display current attendance list  
✔ Easy menu‑based interaction  

## Data Structures Used

| Feature | Data Structure |
|---------|----------------|
| Store students in order of attendance | `Queue` (LinkedList) |
| Prevent duplicate attendance | `HashSet` |
| Track last attendance to remove | `Stack` |

## How It Works

1. **Add Attendance**  
   Adds a new student ID only if it hasn’t been added before.

2. **Check Attendance**  
   Verifies if a given student ID is present.

3. **Remove Attendance**  
   Removes the most recent attendance using a stack.

4. **Show Attendance**  
   Prints all present student IDs in order of arrival.



