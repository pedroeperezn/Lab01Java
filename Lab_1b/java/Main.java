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
        Student s1 = new Student(new Name("Tiger", "Woods"),"A00123456",new Date("1975","12","30"),true);
        Student s2 = new Student(new Name("Bill", "Gates"), "A00987654", new Date("1955","10","28"),false);

        //======================================================
        System.out.print(s1.getName().getFullName() + " ");
        System.out.print("(" + s1.getName().getInitials() + ")" + " ");
        // TODO: Print student number and was born on
        System.out.print(s1.getDateOfBirth().getYyMmDd() + " ");
        System.out.println(s1.isGraduated());

        System.out.print(s2.getName().getFullName() + " ");




    }
}
