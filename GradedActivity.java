
import java.io.*;
import java.util.Scanner;

public class GradedActivity {

    private double weight;
    private double score;
    private char grade;

    // constructor
    public GradedActivity() {

        double score = 0.0;

        double weight = 0.0;
    }

    public GradedActivity(double weight){

        weight = 0.0;

    }

    // Getter
    public double getWeight(double weight) {

        if ((weight < 0) || (weight > 1)) {
            System.out.println("Error: weight must be between 0 and 1");
        }

        return this.weight;
    }

    // Setter
    public void setWeight(double weight) {

        this.weight = weight;
    }


    // Getter
    public double getGrade(char grade) {

        return grade;
    }

    public char setGrade(double score) {

        char grade;

        // Calculate the grade
        if (score > 100) {
            grade = '?';
        }
        else if (score >= 89.5)
        {
            grade = 'A';
        }
        else if (score >= 79.5)
        {
            grade = 'B';
        }
        else if (score >= 69.5)
        {
            grade = 'C';
        }
        else if (score >= 49.5)
        {
            grade = 'D';
        }
        else if (score >= 0)
        {
            grade = 'F';
        }
        else {
            grade = '?';
        }

        if (grade == '?') {
            System.out.println("Error: grades must be between 0 and 100");
        }

        return grade;
    }



    @Override
    public String toString() {

        getGrade(grade);
        getWeight(weight);

        return String.format("%f + %fi + %s", weight, score, grade);
    }


}
