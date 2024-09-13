/**
 * This is the Main class
 * @author Pedro E. Perez & Alan Riveros
 * @version 1.0
 */
public class Main {
    /**
     * The constructor for the Main class
     * @param args
     */
    public static void main(String[] args)
    {
        // Initialize 2 objects into class Student
        Student s1 = new Student("Tiger Woods","A00123456","December 30, 1975",true);
        Student s2 = new Student("Bill Gates", "A00987654", "October 28, 1955",false);

        // Displaying s1 information
        s1.getName();
        s1.getStudentNumber();
        s1.getDateOfBirth();
        s1.isGraduated();

        System.out.println(" ");

        // Displaying s2 information
        s2.getName();
        s2.getStudentNumber();
        s2.getDateOfBirth();
        s2.isGraduated();






    }
}
