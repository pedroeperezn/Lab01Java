/**
 * Creation of new class called Student
 * @author Pedro E. Perez & Alan Riveros
 * @version 1.0
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
     */
    public void getName()
    {
        System.out.println(this.name);
    }

    /**
     * Method that is used to get the student number of the Student
     */
    public void getStudentNumber()
    {
        System.out.println("st #" + this.studentNumber);
    }

    /**
     * Method that is used to get the date of birth of the Student
     */
    public void getDateOfBirth() {
        System.out.println("was born on " + this.dateOfBirth);
    }

    /**
     * Method that is used to verify if the Student is graduated or not
     */
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

