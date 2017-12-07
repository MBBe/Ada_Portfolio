
public class YearGroup
{
    // instance variables - replace the example below with your own
    private int year;
    private String head_of_year;

    /**
     * Constructor for objects of class YearGroup
     */
    public YearGroup(int year, String head_of_year)
    {
     this.year=year;
     this.head_of_year=head_of_year;
    }

    public int getYear ()
    {
        return year;
    }
    
    public String gethead_of_year ()
    {
        return head_of_year;
    }
    
    public void displayDetails ()
    {
        System.out.println("Year:" + year);
        System.out.println("Head of Year:" + head_of_year);
    }
}
