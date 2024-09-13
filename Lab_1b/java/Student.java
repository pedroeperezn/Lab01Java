/**
 * @author Pedro & Alan
 * @version 1.0
 * Creation of new class called Student
 */
public class Student
{
    String name;
    String studentNumber;
    String dateOfBirth;
    boolean graduated;

    /**
     * The constructor for class Student
     * @param name The name of the Student
     * @param studentNumber The student number of the Student
     * @param dateOfBirth The date of birth of the Student
     * @param graduated The status of the Student if is graduated or not
     */
    Student(String name,String studentNumber,String dateOfBirth,boolean graduated)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.dateOfBirth = dateOfBirth;
        this.graduated = graduated;
    }

    /**
     * Method that is used to get the name of the Student
     * @return Return the name of the Student
     */
    public String getName()
    {
        return name;
    }

    /**
     * Method that is used to get the student number of the Student
     * @return Return the student number of the Student
     */
    public String getStudentNumber()
    {
        return studentNumber;
    }

    /**
     * Method that is used to get the date of birth of the Student
     * @return Return the date of birth of the Student
     */
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void isGraduated()
    {
        if(!this.graduated)
        {
            System.out.println("The student has not graduated.");
        }
        else
        {
           System.out.println("The student has graduated.");
        }
    }

}

