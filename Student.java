public class Student {

    private String firstName;
    private String lastName;
    private String studentID;
    private String studentEmail;
    public double[] Grades = new double[4];


    // constructor
    public Student() {

        firstName = null;
        lastName = null;
        studentID = null;
        studentEmail = null;

        Grades[0] = 0;
        Grades[1] = 0;
        Grades[2] = 0;
        Grades[3] = 0;
    }

    // FirstName
    // Getter
    public String getFirstName() {

        return firstName;
    }
    // Setter
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }


    // LastName
    // Getter
    public String getLastName() {

        return lastName;
    }
    // Setter
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    // StudentID
    // Getter
    public String getStudentID() {

        return studentID;
    }
    // Setter
    public void setStudentID(String studentID) {

        this.studentID = studentID;
    }


    // StudentEmail
    // Getter
    public String getStudentEmail() {

        return studentEmail;
    }
    // Setter
    public void setStudentEmail(String studentEmail) {

        this.studentEmail = studentEmail;
    }


    // Lab
    // Getter
    public double getLab() {

        return Grades[0];
    }
    // Setter
    public void setLab(double[] Grades) {

        this.Grades[0] = Grades[0];
    }


    // Midterm
    // Getter
    public double getMidterm() {

        return Grades[1];
    }
    // Setter
    public void setMidterm(double[] Grades) {

        this.Grades[1] = Grades[1];
    }


    // Essay
    // Getter
    public double getEssay() {

        return Grades[2];
    }
    // Setter
    public void setEssay(double[] Grades) {

        this.Grades[2] = Grades[2];
    }


    // Final
    // Getter
    public double getFinal() {

        return Grades[3];
    }
    // Setter
    public void setFinal(double[] Grades) {

        this.Grades[3] = Grades[3];
    }

    @Override
    public String toString() {

        return String.format("%s %s\n %s\n %s\nGrades: %.1f %.1f %.1f %.1f\n",
                firstName, lastName, studentID, studentEmail, Grades[0], Grades[1], Grades[2], Grades[3]);
    }


}
