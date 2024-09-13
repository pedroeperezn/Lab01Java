/**
 * Represents a date with YY-MM-DDDD
 * @author Alan Riveros & Pedro E. Perez
 * @version 1.0
 */
public class Date
{
    private final String year;
    private final String month;
    private final String day;

    /**
     * Constructor of the Date class
     * @param year Year to be stored
     * @param month Month to be stored
     * @param day Day to be stored
     */
    Date(String year, String month, String day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Returns the year stored on the Date object
     * @return Year (string)
     */
    String getYear()
    {
        return this.year;
    }

    /**
     * Returns the month store on the Date object
     * @return Month (string)
     */
    String getMonth()
    {
        return this.month;
    }

    /**
     * Returns the day stored on the Date object
     * @return Day (string)
     */
    String getDay()
    {
        return this.day;
    }

    /**
     * Returns the complete date in YYYY-MM-DD format
     * @return Date (string)
     */
    String getYyMmDd()
    {
        String formatedDate = this.year + "-" + this.month + "-" + this.day;
        return formatedDate;
    }
}
