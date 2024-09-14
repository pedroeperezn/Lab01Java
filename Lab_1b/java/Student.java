/**
 * Creation of new class called Student
 * @author Pedro E. Perez & Alan Riveros
 * @version 1.0
 */
public class Student
{
    private final Name  name;
    private final String  studentNumber;
    private final Date  dateOfBirth;
    private boolean graduated;

    /**
     * The constructor for class Student
     * @param name The name of the Student
     * @param studentNumber The student number of the Student
     * @param dateOfBirth The date of birth of the Student
     * @param graduated The status of the Student if is graduated or not
     */
    Student(Name name,String studentNumber,Date dateOfBirth,boolean graduated)
    {
        this.name =          name;
        this.studentNumber = studentNumber;
        this.dateOfBirth =   dateOfBirth;
        this.graduated =     graduated;
    }

    /**
     * Method that is used to get the name of the Student
     * @return Return the name of the student
     */
    public Name getName()
    {
        return this.name;
    }

    /**
     * Method that is used to get the student number of the Student
     * @return Return the student number
     */
    public String getStudentNumber()
    {
        return this.studentNumber;
    }


    /**
     * Method that is used to get the date of birth of the Student
     * @return Return the date of birth of the student
     */
    public Date getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    /**
     * Method that is used to verify if the Student is graduated or not
     * @return Return if the student is graduated or not
     */
    public String isGraduated()
    {
        if(!this.graduated)
        {
            return "The student has not graduated.";
        }
        else
        {
            return "The student has graduated.";
        }
    }

    /**
     * Method to get formatted information
     * @return Return the name, student number, date of birth and if the student is graduated or not
     */
    public String getFormattedText()
    {
        return getName() + "("+ getStudentNumber() + ")"+" " + getDateOfBirth()+" " + isGraduated();
    }
}

