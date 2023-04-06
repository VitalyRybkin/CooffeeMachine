import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.AddProduct(new Coffee("Cappuchino", 1.19, 100.0, 120.0));
        coffeeMachine.AddProduct(new Coffee("Americano", 0.99,0.0, 150.0));
        coffeeMachine.AddProduct(new Coffee("Moccachino", 1.29,150.0, 150.0));
        coffeeMachine.AddProduct(new HotChocolate("Vanilla", 1.39,100.0));
        coffeeMachine.AddProduct(new HotChocolate("Regular", 1.09,120.0));

        coffeeMachine.AddAdding(new Adding("Sugar", 500.0, 5.0));
        coffeeMachine.AddAdding(new Adding("Cinnamon", 500.0, 3.0));
        coffeeMachine.AddAdding(new Adding("Milk", 500.0, 15.0));
        coffeeMachine.AddAdding(new Adding("Syrup", 500.0, 5.0));

        coffeeMachine.AddReservoir(new Reservoir("Milk", 5000.0));
        coffeeMachine.AddReservoir(new Reservoir("Coffee", 5000.0));
        coffeeMachine.AddReservoir(new Reservoir("Chocolate powder", 5000.0));

        coffeeMachine.AddCup(new Cup("100 ml", 100, 100));
        coffeeMachine.AddCup(new Cup("150 ml", 150, 100));
        coffeeMachine.AddCup(new Cup("200 ml", 200, 100));

        coffeeMachine.RefillReservoir("Milk", 500.0);
        coffeeMachine.RefillAdding("Sugar", 50);
        coffeeMachine.RefillCup("150 ml", 5);

        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> userChoiceMenu = new HashMap<>();
        int userChoice;

        while (true) {

            userChoiceMenu = menu.printStatus(coffeeMachine);
            userChoice = scanner.nextInt();

            if (userChoiceMenu.get(userChoice).equals("Quit")) {
                menu.exitState();
                break;
            }

            menu.nextState();

            menu.printStatus(coffeeMachine);
//
//            menu.previousState();
//
//            menu.printStatus(coffeeMachine);
        }
//        System.out.println(coffeeMachine);
    }
}