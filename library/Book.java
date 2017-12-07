public class Book extends StockItem
{
    private String author;
    private String isbn;
    
    public Book(String author, String isbn, String title, String dateAquired){
       this.author=author;
       this.isbn=isbn;
       this.title=title;
       this.dateAquired=dateAquired;
    }
    
    public void displayDetails (){
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("isbn:" + isbn);
        System.out.println("Date acquired:" + dateAquired);
        
        if(onLoan)System.out.println("Book is on loan") ;
        else System.out.println("Book has been returned");
    }
}
