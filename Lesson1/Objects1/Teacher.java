
public class Teacher
{
    // instance variables - replace the example below with your own
    private int yearsOfService;
    private String name;
    private String initials;
    private String subject;

    /**
     * Constructor for objects of class Teacher
     */
    public Teacher(String name, String initials, String subject)
    {
        this.name=name;
        this.initials=initials;
        this.subject=subject;
    }

    
    public String getName()
    {
       return name;
    }
    
    public String getInitials ()
    {
        return initials;
    }
    
    public String getSubject ()
    {
       return subject;    
    }    
    
    public int getYearsService()
    {
        return yearsOfService;
    }
    
    public void setYearsService(int yearsOfService)
    {
        this.yearsOfService=yearsOfService;
    }
    
    public void displaysDetails ()
    {
        System.out.println("Teacher's name:" + name);
        System.out.println ("Number of years of service is:" + yearsOfService);
        System.out.println ("Subject taught:" + subject);
        System.out.println ("Teachers Initials:" + initials);
    }
}
