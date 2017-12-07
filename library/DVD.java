public class DVD extends StockItem
{
    private String director;
    private int playingTime;
    private String title;
    private String acquired;
    public DVD(String title, String director, int playingTime, String acquired){
       this.title=title;
       this.director=director;
       this.playingTime=playingTime;
       this.acquired=acquired;
    }
    
    @Override
    public void displayDetails (){
      System.out.println("This is the DVD class");
      System.out.println("title:" + title);
        System.out.println("Director:" + director);
        System.out.println("playing time:" + playingTime);
        System.out.println("Date acquired:" + acquired);
        
        if(onLoan)System.out.println("DVD is on loan") ;
        else System.out.println("DVD has been returned");
    } 
      
}