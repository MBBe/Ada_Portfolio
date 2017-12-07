public class CD extends StockItem
{
    private String artist;
    private int playingTime;
    private String title;
    private String acquired;
    public CD(String title, String artist, int playingTime, String acquired){
       this.title=title;
       this.artist=artist;
       this.playingTime=playingTime;
       this.acquired=acquired;
    }
    
    @Override
    public void displayDetails (){
      System.out.println("This is the CD class");
      System.out.println("title:" + title);
        System.out.println("artist:" + artist);
        System.out.println("playing time:" + playingTime);
        System.out.println("Date acquired:" + acquired);
        
        if(onLoan)System.out.println("CD is on loan") ;
        else System.out.println("CD has been returned");
    } 
      
}