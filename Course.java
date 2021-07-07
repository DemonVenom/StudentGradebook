
import java.io.*;
import java.util.Scanner;

public class Course implements Analyzable{

    private String courseName;
    private String courseDescription;
    private String courseInstructor;
    private int numberStudents;
    private Student[] arrayStudents;


    // constructor
    public Course() {

        courseName = null;
        courseDescription = null;
        courseInstructor = null;
        numberStudents = 0;

        arrayStudents = new Student[numberStudents];
    }


    // CourseName
    // Getter
    public String getCourseName() {

        return courseName;
    }
    // Setter
    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }


    // CourseDescription
    // Getter
    public String getCourseDescription() {

        return courseDescription;
    }
    // Setter
    public void setCourseDescription(String courseDescription) {

        this.courseDescription = courseDescription;
    }

    // CourseInstructor
    // Getter
    public String getCourseInstructor() {

        return courseInstructor;
    }
    // Setter
    public void setCourseInstructor(String courseInstructor) {

        this.courseInstructor = courseInstructor;
    }



    // NumberStudents
    // Getter
    public int getNumberStudents() {

        return numberStudents;
    }
    // Setter
    public void setNumberStudents(int numberStudents) {

        this.numberStudents = numberStudents;
    }


    // ArrayStudents
    // Getter
    public Student[] getArrayStudents() {

        return arrayStudents;
    }
    // Setter
    public void setArrayStudents(Student[] arrayStudents) {

        this.arrayStudents = arrayStudents;
    }


    public double getLabAverage(Student[] arrayStudents) {

        double average = 0;
        double lab;

        for (int i = 0; i < arrayStudents.length; i++) {

            lab = arrayStudents[i].getLab();

            average = (average + lab);
        }

        average = (average / arrayStudents.length);

        return average;

    }
    @Override
    public double getLab(double[] Grades) {
        return Grades[0];
    }



    public double getMidtermAverage(Student[] arrayStudents) {

        double average = 0;
        double midterm;

        for (int i = 0; i < arrayStudents.length; i++) {

            midterm = arrayStudents[i].getMidterm();

            average = (average + midterm);
        }

        average = (average / arrayStudents.length);

        return average;

    }
    @Override
    public double getMidterm(double[] Grades) {
        return Grades[1];
    }


    public double getEssayAverage(Student[] arrayStudents) {

        double average = 0;
        double essay;

        for (int i = 0; i < arrayStudents.length; i++) {

            essay = arrayStudents[i].getEssay();

            average = (average + essay);
        }

        average = (average / arrayStudents.length);

        return average;

    }
    @Override
    public double getEssay(double[] Grades) {
        return Grades[2];
    }


    public double getFinalAverage(Student[] arrayStudents) {

        double average = 0;
        double finalExam;

        for (int i = 0; i < arrayStudents.length; i++) {

            finalExam = arrayStudents[i].getFinal();

            average = (average + finalExam);
        }

        average = (average / arrayStudents.length);

        return average;

    }
    @Override
    public double getFinal(double[] Grades) {
        return Grades[3];
    }


    public double getLabHighest(Student[] arrayStudents) {

        double highest = 0;
        double lab;

        for (int i = 0; i < arrayStudents.length; i++) {

            lab = arrayStudents[i].getLab();

            if (lab > highest) {
                highest = lab;
            }

        }

        return highest;

    }


    public double getMidtermHighest(Student[] arrayStudents) {

        double highest = 0;
        double midterm;

        for (int i = 0; i < arrayStudents.length; i++) {

            midterm = arrayStudents[i].getMidterm();

            if (midterm > highest) {
                highest = midterm;
            }

        }

        return highest;

    }


    public double getEssayHighest(Student[] arrayStudents) {

        double highest = 0;
        double midterm;

        for (int i = 0; i < arrayStudents.length; i++) {

            midterm = arrayStudents[i].getEssay();

            if (midterm > highest) {
                highest = midterm;
            }

        }

        return highest;

    }

    public double getFinalHighest(Student[] arrayStudents) {

        double highest = 0;
        double finalExam;

        for (int i = 0; i < arrayStudents.length; i++) {

            finalExam = arrayStudents[i].getFinal();

            if (finalExam > highest) {
                highest = finalExam;
            }

        }

        return highest;

    }


    public double getLabLowest(Student[] arrayStudents) {

        double lowest = 0;
        double lab;

        for (int i = 0; i < arrayStudents.length; i++) {

            lab = arrayStudents[i].getLab();

            if (lab < lowest) {
                lowest = lab;
            }

        }

        return lowest;

    }

    public double getMidtermLowest(Student[] arrayStudents) {

        double lowest = 0;
        double lab;

        for (int i = 0; i < arrayStudents.length; i++) {

            lab = arrayStudents[i].getMidterm();

            if (lab < lowest) {
                lowest = lab;
            }

        }

        return lowest;

    }


    public double getEssayLowest(Student[] arrayStudents) {

        double lowest = 0;
        double essay;

        for (int i = 0; i < arrayStudents.length; i++) {

            essay = arrayStudents[i].getEssay();

            if (essay < lowest) {
                lowest = essay;
            }

        }

        return lowest;

    }

    public double getFinalLowest(Student[] arrayStudents) {

        double lowest = 0;
        double finalExam;

        for (int i = 0; i < arrayStudents.length; i++) {

            finalExam = arrayStudents[i].getFinal();

            if (finalExam < lowest) {
                lowest = finalExam;
            }

        }

        return lowest;

    }


    public double getStudentAverage(int numberStudents) {

        double average = 0;

        average = (average + (0.2 * arrayStudents[numberStudents].getLab()));
        average = (average + (0.3 * arrayStudents[numberStudents].getMidterm()));
        average = (average + (0.2 * arrayStudents[numberStudents].getEssay()));
        average = (average + (0.3 * arrayStudents[numberStudents].getFinal()));

        return average;

    }


    public double getClassAverage() {

        double average = 0;

        for (int i = 0; i < arrayStudents.length; i++) {

            average = (average + (0.2 * arrayStudents[i].getLab()));
            average = (average + (0.3 * arrayStudents[i].getMidterm()));
            average = (average + (0.2 * arrayStudents[i].getEssay()));
            average = (average + (0.3 * arrayStudents[i].getFinal()));

        }

        average = (average / arrayStudents.length);

        return average;

    }










}
