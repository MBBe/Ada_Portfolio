public class DoubleCD extends CD
{
    //private String artist;
    //private int playingTimeCD1;
    private int playingTimeCD2;
    //private String title;
    //private String acquired;
    
    public DoubleCD(String title, String artist, int playingTimeCD1, int playingTimeCD2, String acquired){
       super(title, artist, playingTimeCD1, acquired);
       this.playingTimeCD2=playingTimeCD2;
       
    }
    
    @Override
    public void displayDetails (){
      System.out.println("This is the DoubleCD class");
     /* System.out.println("title:" + title);
        System.out.println("artist:" + artist);
        System.out.println("playing time CD1:" + playingTimeCD1);
        System.out.println("playing time CD2:" + playingTimeCD2);
        System.out.println("Date acquired:" + acquired);
        
        if(onLoan)System.out.println("DoubleCD is on loan") ;
        else System.out.println("DoubleCD has been returned");*/
        super.displayDetails();
       System.out.println("playing time 2" + playingTimeCD2);
    } 
      
}

