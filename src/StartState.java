import java.util.Map;

public class StartState implements LinkedMenu {

    @Override
    public void startNode(Menu menu) {
        menu.setState(new StartState());
    }

    @Override
    public void nextNode(Menu menu) {
        menu.setState(new OrderState());
    }

    @Override
    public void prevNode(Menu menu) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    @Override
    public Map<Integer, String> printState(CoffeeMachine coffeeMachine) {
        menuOutput.clear();
        for (Reservoir cm : coffeeMachine.getReservoirsList()) {
            if (cm.getTankVolume() < 300){
                menuOutput.put(1, "Order (unavailable)");
            } else {
                menuOutput.put(1, "Order");
            }
        }
        menuOutput.put(2, "Service");
        menuOutput.put(3, "Quit");
        System.out.println("\nChoose operation: ");
        menuOutput.forEach((key, value) -> System.out.println(key + ". " + value));
        System.out.print(">> ");
        return menuOutput;
    }
}
