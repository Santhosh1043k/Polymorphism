public class Main {
    public static void main(String[] args) {
      Dhoni dhoni = new Dhoni();
      dhoni.printData();
        Dhoni kohli = new Kohli();
        kohli.printData();
        //in this line we use Dhoni as a class name instead of kohli because of polymorphism
        Dhoni raina = new Raina();
        kohli.printData();

    }
}