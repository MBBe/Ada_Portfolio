/**
 * Created by Apprentice on 06/12/2017.
 */
public class Cat extends Animal {


    Cat(String name, String owner) {
        super(name, owner);
    }
    @Override
    public void display (){
        System.out.println("This is the Cat Class");
        System.out.println("");
        System.out.println(" /\\___/\\");
        System.out.println("( o   o )");
        System.out.println("(  =^=  )");
        System.out.println("(        )");
        System.out.println("(         )");
        System.out.println("(          ))))))))))) ");
        System.out.println("");

        //hi manasseh

        super.display();
        //displayspeak ();
    }
    @Override
    public void speak () {
        System.out.println("*Miaow*");
    }

}

