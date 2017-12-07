public class Animal {
    String name;
    String owner;
    int hunger;
    int size;
    boolean isSleeping;
    String message;

    Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
        setSize(30);
        setHunger(5);
        //this.message = message;
    }

    void setHunger(int hunger) {
        if (hunger < 0) {
            hunger = 0;
        }
        if (hunger > 10) {
            hunger = 10;
        }
        this.hunger = hunger;
    }

    void setSize(int size) {
        if (hunger < 0) {
            hunger = 0;
        }
        if (hunger > 100) {
            hunger = 100;
        }
        this.size = size;
    }

    void feed(int amount) {
        message = "The pet is hungry";
        setHunger(hunger - amount);
        if (hunger == 0) {
            setSize(size + 2);
        }
    }

    void nap() {
        message = "The pet is sleeping";
        isSleeping = true;
    }

    void wakeUp() {
        message = "The pet is awake";
        isSleeping = false;
    }

    int getHealth() {
        return Math.max(0, (30 - Math.abs(30 - size)) - hunger);
    }
    void play() {
        message = "The pet is playing";
        setHunger(hunger + 3);
        if (hunger > 5) {
            setSize(size - 3);
        }
    }

    public void speak () {
        message = "The pet is speaking";
    }

    void display() {
        System.out.println("");
        System.out.println("????????");
        System.out.println("?      ?");
        System.out.println("?      ?");
        System.out.println("????????");
        System.out.println("");
        System.out.println(message);
        displaySleeping();
        displayName ();
        displayHunger();
        displaySize();
        displayHealth();
        //System.out.println("This is " + name + ". They belong to " + owner + ".");
        //System.out.println("Hunger level: " + hunger + " / 10");
        //System.out.println("Size: " + size + " / 100");
        //System.out.println("Health: " + getHealth() + " / 30");



    }

    private void displaySleeping(){
        if (isSleeping) {
            System.out.println("Shhh!" + name + " is sleeping.");
        }else
        {
            System.out.println(name + " is awake.");
        }
    }
    private void displayName(){
        System.out.println("This is " + name + ". They belong to " + owner + ".");
    }

    private void displayHunger(){
        System.out.println("Hunger level: " + hunger + " / 10");
    }

    private void displaySize() {
        System.out.println("Size: " + size + " / 100");
    }

    private void displayHealth() {
        System.out.println("Health: " + getHealth() + " / 30");
    }





}
