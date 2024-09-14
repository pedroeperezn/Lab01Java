/**
 * Creation of new class called Student
 * @author Pedro E. Perez & Alan Riveros
 * @version 1.0
 */
public class Student
{
    String  name;
    String  studentNumber;
    String  dateOfBirth;
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
        this.name =          name;
        this.studentNumber = studentNumber;
        this.dateOfBirth =   dateOfBirth;
        this.graduated =     graduated;
    }

    /**
     * Method that is used to get the name of the Student
     * @return Return the name of the student
     */
    public String getName(){return name;}
    /**
     * Method that is used to get the student number of the Student
     * @return Return the student number
     */
    public String getStudentNumber()
    {
        return "st #" + this.studentNumber;
    }

    /**
     * Method that is used to get the date of birth of the Student
     * @return Return the date of birth of the student
     */
    public String getDateOfBirth()
    {
        return "was born on " + this.dateOfBirth;
    }

    /**
     * Method that is used to verify if the Student is graduated or not
     * @return Return if the student is graduated or not
     */
    public String isGraduated()
    {
        if(!this.graduated)
        {
            return "The student has not graduated";
        }
        else
        {
            return "The student has graduated";
        }
    }

    /**
     * Method to get formatted information
     * @return Return the name, student number, date of birth and if the student is graduated or not
     */
    public String getFormattedText()
    {
        return getName() + " "+ getStudentNumber() + " " + getDateOfBirth()+" " + isGraduated();
    }
}

