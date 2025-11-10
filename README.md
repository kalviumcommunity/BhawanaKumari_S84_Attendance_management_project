# School Attendance System
This is a 10-part code-along project to build a console-based school attendance system in Java.

## Session 1: Introduction and Orientation
- Verified Java and Git setup.
- Initialized Git repository for the project.
- Created basic project structure with Main.java.
- Compiled and ran the initial "Welcome" program.
- Pushed initial setup to a part-01 branch on GitHub and created a PR.

### How to Run
1. Navigate to the project root directory (AttendanceSystem).
2. Compile: javac src/com/school/Main.java
3. Run: java -cp src com.school.Main

## 📁 Project Structure
AttendanceSystem/
├── src/
│   └── com/
│       └── school/
│           └── Main.java
├── README.md

## Part 3: Constructor Initialization & Auto-ID Generation
- Implemented parameterized constructors in `Student` and `Course` classes for object initialization.
- Utilized `private static` member variables for automatic and unique ID generation.
- Demonstrated the use of the `this` keyword to distinguish instance variables from constructor parameters.
- Changed `Course`'s `courseId` to `int` for simpler auto-generation and updated its display.
- Updated `Main.java` to use constructors and show ID progression.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java` (or `javac src/com/school/*.java`)
3. Run: `java -cp src com.school.Main`

## Part 5: Establishing Students, Teaching & Non-Teaching Staff hierarchy
- Created a base class `Person.java` with common attributes (`id`, `name`), a universal auto-ID generator, and a `displayDetails()` method.
- Modified `Student.java` to inherit from `Person`, using `super()` to call the parent constructor and overriding `displayDetails()` to add student-specific info (e.g., grade level).
- Created `Teacher.java` extending `Person`, adding a `subjectTaught` attribute and its own `displayDetails()`.
- Created `Staff.java` extending `Person`, adding a `role` attribute and its own `displayDetails()`.
- Demonstrated creation and display of `Student`, `Teacher`, and `Staff` objects in `Main.java`.
- Updated `AttendanceRecord` creation to use the inherited `getId()` method.

Mentor: “Update README.md.”
## Part 9: SOLID Service Layer: RegistrationService & AttendanceService Separation
- Applied the Single Responsibility Principle (SRP) by creating dedicated service classes.
- Created `RegistrationService.java` to handle the registration, management (lists, lookups), and saving of `Student`, `Teacher`, `Staff`, and `Course` entities.
- Modified `Teacher.java` and `Staff.java` to implement `Storable` for file persistence.
- Refactored `AttendanceService.java`:
    - It now depends on `RegistrationService` for looking up students/courses by ID.
    - Removed internal lookup helper methods, delegating this to `RegistrationService`.
    - Its primary focus is now solely on managing attendance records.
- Updated `Main.java` to act as an orchestrator, instantiating and using these services. Direct entity list management was removed from `Main`.
- Demonstrated improved code organization and clearer separation of concerns.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/*.java`
3. Run: `java -cp src com.school.Main`
4. Check for `students.txt`, `teachers.txt`, `staff.txt`, `courses.txt`, and `attendance_log.txt`.