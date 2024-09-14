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
        // Displaying information for s1 object
        System.out.print(s1.getName().getFullName() + " ");
        System.out.print("(" + s1.getName().getInitials() + ")" + " ");
        System.out.print("(st # "+ s1.getStudentNumber()+")");
        System.out.print(" was born on "+ s1.getDateOfBirth().getYyMmDd() + ". ");
        System.out.println(s1.isGraduated());

        //=======================================================
        // Displaying information for s2 object
        System.out.print(s2.getName().getFullName() + " ");
        System.out.print("(" + s2.getName().getInitials() + ")" + " ");
        System.out.print("(st # "+ s2.getStudentNumber()+")"+" ");
        System.out.print("was born on " + s2.getDateOfBirth().getYyMmDd() + ". ");
        System.out.println(s2.isGraduated());

    }
}
