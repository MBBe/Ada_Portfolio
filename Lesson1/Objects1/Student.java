
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private int year_group;
    private char form;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, String form)
    {
        this.name=name;
        this.year_group=Integer.parseInt( form.substring(0,2)   );
        this.form=form.charAt(2);
    }
    
    public String getname ()
    {
        return name;
    }
    
    public int getyear_group ()
    {
      return year_group;  
    }
    
    public char getform ()
    {
        return form;
    }

}
