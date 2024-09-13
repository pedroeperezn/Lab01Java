/**
 * Stores the name of a person
 * @author Alan Riveros & Pedro E. Perez
 * @version 1.0
 */
public class Name
{
    String first;
    String last;

    /**
     * Constructor of name class
     * @param first: First name of user
     * @param last: Last name of user
     */
    Name(String first, String last)
    {
        this.first = first;
        this.last = last;
    }

    /**
     * Returns the stored first name
     * @return name (string)
     */
    String getFirstName()
    {
        return this.first;
    }

    /**
     * Returns the stored last name
     * @return name (string)
     */
    String getLastName()
    {
        return this.last;
    }

    /**
     * Returns the full name of the object
     * @return Full Name (string)
     */
    String getFullName()
    {
        return this.first + " " + this.last;
    }

    /**
     * Returns the initials of both first and last name
     * @return Initials (string)
     */
    String getInitials()
    {
        return this.first.toUpperCase().charAt(0) + "." + this.last.toUpperCase().charAt(0) + ".";
    }
}
