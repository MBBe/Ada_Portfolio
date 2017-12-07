/**
 * Created by Apprentice on 06/12/2017.
 */

public class Dog extends Animal {


    Dog(String name, String owner) {
        super(name, owner);
    }
    @Override
    public void display (){
        System.out.println("This is the Dog Class");
        System.out.println("");
        System.out.println("             __");
        System.out.println("            /  \\");
        System.out.println("           / ..|\\");
        System.out.println("          (_\\  |_)");
        System.out.println("          /  \\@\'");
        System.out.println("         /     \\");
        System.out.println("    _   /  `   |");
        System.out.println("    \\/  \\  | _\\");
        System.out.println("     \\   /_ || \\\\_");
        System.out.println("      \\____)|_) \\_)");
        System.out.println("");


        //hi manasseh

        super.display();
        //displayspeak ();
    }
    @Override
    public void speak () {
        System.out.println("*Woof*");
    }

}