import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        String command;
        Scanner keyboard = new Scanner(System.in);
        Animal myPet;

        myPet = new Animal("Gnasher", "Dennis");
        myPet = new Cat ("topCat", "officerDibble");
        myPet = new Dog ("Clifford","Emily");

        while (true) {
            myPet.display();
            System.out.println("What do you want to do with your pet?");
            System.out.println("f - Feed; n - Nap; w - Wake up; p - Play");
            System.out.println("x - Exit");
            System.out.println("s - Speak");

            System.out.print("> ");
            command = keyboard.next();
            if (command.equals("x")) {
                break;
            }

            handleCommand(myPet, command);
        }

        System.out.println("Good bye");
    }

    public void handleCommand(Animal pet, String command) {
        if (command.equals("f")) {
            pet.feed(1);
        }
        if (command.equals("n")) {
            pet.nap();
        }
        if (command.equals("w")) {
            pet.wakeUp();
        }
        if (command.equals("p")) {
            pet.play();
        }
        if (command.equals("s")) {
            pet.speak();
        }
    }
}
