public class Student
{
    String name;
    String studentNumber;
    String dateOfBirth;
    boolean graduated;


    Student(String name,String studentNumber,String dateOfBirth,boolean graduated)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.dateOfBirth = dateOfBirth;
        this.graduated = graduated;
    }

    public String getName()
    {
        return name;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public boolean isGraduated()
    {
        return graduated;
    }
}

