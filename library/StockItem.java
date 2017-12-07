public class StockItem
{
 protected String title;
 protected boolean onLoan;
 protected String dateAquired;
 public void displayDetails (){
    System.out.println("This is the StockItem base class"); 
    
 }

 public void setLoan (){
    onLoan=true;
 }
 public void giveback (){
    onLoan=false;
}
}
