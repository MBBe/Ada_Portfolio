public class Book
{
    private String title;
    private boolean onLoan=false;
    private String dateAcquired;
    private String author;
    private String isbn;
    
    public Book(String author,String title,String isbn, String dateAcquired){
        this.author=author; 
        this.title=title;
        this.isbn=isbn;
        this.dateAcquired=dateAcquired;
    }
    
    public void displayDetails (){
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("isbn:" + isbn);
        System.out.println("Date acquired:" + dateAcquired);
        
        if(onLoan)System.out.println("Book is on loan"); 
        else System.out.println("Book has been returned");
        
        
    }
    
    public void borrow(){
        onLoan=true;
    }
public void giveback (){
    onLoan=false;
}

}
