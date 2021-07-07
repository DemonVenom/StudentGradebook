
import java.io.*;
import java.util.Scanner;

public class DriverG {

    public static void main(String[] args) {


        double[] gradesStudent1 = {85.0, 97.0, 86.0, 92.0};
        double[] gradesStudent2 = {72.0, 81.0, 86.0, 90.0};
        double[] gradesStudent3 = {60.0, 75.0, 86.0, 90.0};
        double[] gradesStudent4 = {90.0, 87.0, 82.0, 79.0};


        Student student1 = new Student();
        student1.setFirstName("Anne");
        student1.setLastName("Jones");
        student1.setStudentID("12345");
        student1.setStudentEmail("axs345@psu.edu");
        student1.setLab(gradesStudent1);
        student1.setMidterm(gradesStudent1);
        student1.setEssay(gradesStudent1);
        student1.setFinal(gradesStudent1);

        Student student2 = new Student();
        student2.setFirstName("Amy");
        student2.setLastName("Brown");
        student2.setStudentID("23456");
        student2.setStudentEmail("axs345@psu.edu");
        student2.setLab(gradesStudent2);
        student2.setMidterm(gradesStudent2);
        student2.setEssay(gradesStudent2);
        student2.setFinal(gradesStudent2);

        Student student3 = new Student();
        student3.setFirstName("John");
        student3.setLastName("White");
        student3.setStudentID("34567");
        student3.setStudentEmail("axs345@psu.edu");
        student3.setLab(gradesStudent3);
        student3.setMidterm(gradesStudent3);
        student3.setEssay(gradesStudent3);
        student3.setFinal(gradesStudent3);


        Student student4 = new Student();
        student4.setFirstName("Ben");
        student4.setLastName("Cartwright");
        student4.setStudentID("45678");
        student4.setStudentEmail("axs345@psu.edu");
        student4.setLab(gradesStudent4);
        student4.setMidterm(gradesStudent4);
        student4.setEssay(gradesStudent4);
        student4.setFinal(gradesStudent4);

        Student[] arrayStudents1 = {student1, student2, student3, student4};

        Course course1 = new Course();
        course1.setCourseName("IST 242");
        course1.setCourseDescription("Intermediate & Object-Oriented Application Development");
        course1.setCourseInstructor("Richard Martin");
        course1.setNumberStudents(4);
        course1.setArrayStudents(arrayStudents1);


        double labAverage = course1.getLabAverage(arrayStudents1);
        double midtermAverage = course1.getMidtermAverage(arrayStudents1);
        double essayAverage = course1.getEssayAverage(arrayStudents1);
        double finalAverage = course1.getFinalAverage(arrayStudents1);

        double labHighest = course1.getLabHighest(arrayStudents1);
        double midtermHighest = course1.getMidtermHighest(arrayStudents1);
        double essayHighest = course1.getEssayHighest(arrayStudents1);
        double finalHighest = course1.getFinalHighest(arrayStudents1);

        double labLowest = course1.getLabLowest(arrayStudents1);
        double midtermLowest = course1.getMidtermLowest(arrayStudents1);
        double essayLowest = course1.getEssayLowest(arrayStudents1);
        double finalLowest = course1.getFinalLowest(arrayStudents1);

        double studentAverage0 = course1.getStudentAverage(0);
        double studentAverage1 = course1.getStudentAverage(1);
        double studentAverage2 = course1.getStudentAverage(2);
        double studentAverage3 = course1.getStudentAverage(3);

        double classAverage = course1.getClassAverage();


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.printf("Lab Average: %.1f\nMidterm Average: %.1f\nEssay Average: %.1f\nFinal Average: %.1f\n",
                labAverage, midtermAverage, essayAverage, finalAverage);
        System.out.printf("Lab Highest: %.1f\nMidterm Highest: %.1f\nEssay Highest: %.1f\nFinal Highest: %.1f\n",
                labHighest, midtermHighest, essayHighest, finalHighest);
        System.out.printf("Lab Lowest: %.1f\nMidterm Lowest: %.1f\nEssay Lowest: %.1f\nFinal Lowest: %.1f\n",
                labLowest, midtermLowest, essayLowest, finalLowest);

        System.out.printf("Student 1 Cumulative Average: %.1f\n", studentAverage0);
        System.out.printf("Student 2 Cumulative Average: %.1f\n", studentAverage1);
        System.out.printf("Student 3 Cumulative Average: %.1f\n", studentAverage2);
        System.out.printf("Student 4 Cumulative Average: %.1f\n", studentAverage3);

        System.out.printf("Class Average: %.1f\n", classAverage);





    }


}
