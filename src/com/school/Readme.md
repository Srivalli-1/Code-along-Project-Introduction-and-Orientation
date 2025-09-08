Here’s a **complete README.md** covering **Part 1 to Part 4**:

---

# Attendance Management Project

A simple Java-based project to manage students, courses, and attendance records.
This project is developed in multiple parts to demonstrate core Java concepts step by step.

---

## **Project Structure**

```
src/
└── com/school/
    ├── Main.java
    ├── Student.java
    ├── Course.java
    └── AttendanceRecord.java
```

---

## **Parts Overview**

### ✅ **Part 1 - Project Setup**

* Initialized the project with `Main.java`.
* Displayed a welcome message.

**How to Run:**

```bash
javac src/com/school/Main.java
java -cp src com.school.Main
```

---

### ✅ **Part 2 - Core Domain Modelling**

* Created **Student** and **Course** classes.
* Used arrays to store multiple students and courses.
* Displayed details of students and courses.

**Key Features:**

* `Student.java` → Holds studentId and name.
* `Course.java` → Holds courseId and courseName.

**How to Run:**

```bash
javac src/com/school/*.java
java -cp src com.school.Main
```

---

### ✅ **Part 3 - Constructor Initialization & Auto-ID Generation**

* Implemented constructors for **Student** and **Course**.
* Added **auto ID generation** using static counters.

  * Students: IDs start from `1`.
  * Courses: IDs start from `101` (displayed as `C101`).
* Removed `setDetails` and initialized objects using constructors.

**Example Output:**

```
--- Student Details ---
Student ID: 1, Name: Alice
Student ID: 2, Name: Bob
Student ID: 3, Name: Charlie

--- Course Details ---
Course ID: C101, Course Name: Mathematics
Course ID: C102, Course Name: Science
```

**How to Run:**

```bash
javac src/com/school/*.java
java -cp src com.school.Main
```

---

### ✅ **Part 4 - Encapsulation & Attendance Recording Validation**

* Applied **encapsulation**:

  * Made fields `private`.
  * Added `getters` for Student and Course.
* Created **AttendanceRecord.java**:

  * Fields: `studentId`, `courseId`, `status`.
  * Constructor with **status validation**:

    * Accepts only `"Present"` or `"Absent"` (case-insensitive).
    * Otherwise sets status as `"Invalid"` and shows a warning.
* Used **ArrayList** to store attendance records.

**Example Output:**

```
Warning: Invalid status provided. Set to 'Invalid'.

--- Attendance Records ---
Student ID: 1, Course ID: C101, Status: Present
Student ID: 2, Course ID: C102, Status: Absent
Student ID: 3, Course ID: C101, Status: Invalid
```

**How to Run:**

```bash
javac src/com/school/*.java
java -cp src com.school.Main
```

---

## **How to Compile and Run (General)**

From the project root:

```bash
javac src/com/school/*.java
java -cp src com.school.Main
```

---

## **Git Workflow**

For each part:

```bash
# Ensure you're on main and up to date
git checkout main
git pull origin main

# Create a new branch for the part
git checkout -b part-XX

# After making changes
git add .
git commit -m "feat: Implement Part XX features"
git push -u origin part-XX

# Create PR from part-XX → main
```

---

## **Completed Parts**

* ✅ Part 1: Project Setup
* ✅ Part 2: Core Domain Modelling
* ✅ Part 3: Constructor Initialization & Auto-ID Generation
* ✅ Part 4: Encapsulation & Attendance Validation

---

### **Next Steps**

Part 5 will include advanced attendance management and possibly persistence.

---

👉 Do you want me to **give you this as a ready-to-copy README.md file with formatting** so you can directly paste into your project?
Or should I **create the full text and also add a "Features" section and screenshots placeholders** for submission?
