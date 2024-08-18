# CodeAlpha Student Grade Tracker (vishalkashyap01)
The Student Grade Tracker is a Java console application designed for teachers to track student grades. 

# Student Grade Tracker

## Description
The *Student Grade Tracker* is a Java console application designed for teachers to track student grades. The program allows users to enter grades, view all entered grades, compute the average, highest, and lowest scores, and display the distribution of grades in various ranges (A, B, C, D, F). It also includes features to edit existing grades.

## Features
- *Enter Grades*: Input grades for students, with validation for the range (0-100).
- *Edit Grades*: Modify a specific grade after it has been entered.
- *View All Grades*: Display the list of all entered grades.
- *Grade Statistics*:
  - Calculate the *average, **highest, and **lowest* grades.
  - Display a *grade distribution* (A, B, C, D, F).
- *User-Friendly Menu*: Navigate through different options such as entering, editing, viewing grades, and exiting the program.

## How to Run

1. Clone or download the repository to your local machine.
2. Compile the Java program using any Java IDE or the command line:
   bash
   javac StudentGradeTracker.java
   
3. Run the program:
   bash
   java StudentGradeTracker
   
4. Follow the menu instructions in the console to interact with the program.

## Program Flow
Upon running the program, the user is presented with a main menu with the following options:
1. *Enter Grades*: Enter one or more grades. Type done to stop input.
2. *Edit Grades*: Edit an existing grade by specifying its index and providing a new value.
3. *View All Grades*: View all grades entered so far.
4. *Show Statistics*: Displays the average, highest, and lowest grade, as well as the grades
   distribution.
5. *Exit*: Close the program.

## Example Usage

--- Student Grade Tracker ---
1. Enter Grades
2. Edit Grades
3. View All Grades
4. Show Statistics
5. Exit
Choose an option: 1

Enter student grades (type 'done' when finished):
85
93
78
done

--- Grade Statistics ---
Average grade: 85.33
Highest grade: 93
Lowest grade: 78

--- Grade Distribution ---
A (90-100): 1
B (80-89): 2
C (70-79): 1
D (60-69): 0
F (below 60): 0


## Features in Detail

### 1. Enter Grades
- Allows the teacher to input grades one by one.
- Input validation ensures grades must be between 0 and 100.
- Type done to stop entering grades.

### 2. Edit Grades
- Shows all entered grades and allows the user to modify any grade by its index.
- Ensures the new grade is valid (between 0 and 100).
### 3. View All Grades
- Displays a list of all grades entered so far.

### 4. Show Statistics
- *Average Grade*: The mean value of all grades.
- *Highest Grade*: The maximum value among all grades.
- *Lowest Grade*: The minimum value among all grades.
- *Grade Distribution*:
  - A (90-100)
  - B (80-89)
  - C (70-79)
  - D (60-69)
  - F (below 60)

### 5. Exit
- Exits the program cleanly.

## Technologies Used
- *Java*: The entire project is written in Java, utilizing its core libraries like ArrayList and Scanner for input and data storage.


### Future Improvements
- Add file handling to save and load grades between sessions.
- Add a GUI for a more user-friendly interface.
- Implement more advanced statistics like median and mode.
