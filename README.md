# StudentGradebook

⦁	Gradebook Exercise
Part 1. Create a class GradedActivity that has two attributes: score and weight (both doubles). Supply a constructor that allows one to set both the score and weight, AND one that allows one to set just the weight (in which case the score defaults to 0). Provide get and set methods: enforce the restriction that the grade must be between 0 and 100 (inclusive) and the weight must be between 0 and 1 (exclusive); if either is not within range, throw an exception. In addition supply a toString method and a method, getGrade( ) that returns a char: A, B, C, D, F; use the usual meaning of these grades and round up any grades that are nn.5 or higher.

Part 2. Create a class Student that has the following attributes: firstName (String), lastName (String), studentID (String), studentEmail (String), and an array of 4 GradedActivity entries, called grades. Provide a constructor that initializes all the Strings to null, and initializes the array as follows:
	Grades[0] is a lab grade and is weighted at 20%
	Grades[1] is a midterm exam grade and is weighted at 30%
	Grades[2] is an essay test and is weighted at 20%, and
	Grades[3] is a final exam and is weighted at 30%
Provide get and set methods for all attributes and each grades entry: get/setLab( ), get/setMidterm(), get/setEssay, and get/setFinal(), which only allows you to set the score. Provide a toString method as well.

Part 3. Create a class Course that has the attributes: courseName (String), courseDescription (String), courseInstructor (String), numberStudents (int), and an array of Students. The constructor should initialize all the attributes and allocate an empty array of Students (size depending on the numberStudents). Provide the usual get/set methods, including one that allows one to get/set a particular student (numbered 1 to however many students – throw an exception if the student number is out of bounds).

Part 4. Modify the Course class to implement the interface Analyzable, which must have the following methods:
	double getLab/Midterm/Essay/FinalAverage( ), returns the average grade for each exercise (weights do not matter);
	double getLab/Midterm/Essay/FinalHighest( ), returns the highest grade for each exercise;
	double getLab/Midterm/Essay/FinalLowest( ), returns the lowest grade for each exercise;
	double getStudentAverage(int studentNumber), returns each student’s final grade:0-100; weights DO matter; studentNumber: 1 – number of students in class
	double getClassAverage( ), returns the class average (0-100) – this is just the average of the student averages; weights do not matter; they are already included in each student’s average.

Part 5. Create a test program that creates a course and assign exactly 4 students to the course; do not prompt the user for this input (use the main routine instead). Test all of the constructors, all of the get/set methods, and all of the toString methods. Give them final scores for all their graded activities (letter grades optional).

Sample output:

Anne Jones
 12345
 axs345@psu.edu
 Grades: 85.0 97.0 86.0 92.0

Amy Brown
 23456
 axs345@psu.edu
 Grades: 72.0 81.0 86.0 90.0

John White
 34567
 axs345@psu.edu
 Grades: 60.0 75.0 86.0 90.0

Ben Cartwright
 45678
 axs345@psu.edu
 Grades: 90.0 87.0 82.0 79.0


Lab Average: 76.8
Midterm Average: 85.0
Essay Average: 85.0
Final Average: 87.8
Lab Highest: 90.0
Midterm Highest: 97.0
Essay Highest: 86.0
Final Highest: 92.0
Lab Lowest: 60.0
Midterm Lowest: 75.0
Essay Lowest: 82.0
Final Lowest: 79.0
Student 1 Cumulative Average: 90.9
Student 2 Cumulative Average: 82.9
Student 3 Cumulative Average: 78.7
Student 4 Cumulative Average: 84.2
Class Average: 84.2
