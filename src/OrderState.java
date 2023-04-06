import java.util.Map;

public class OrderState implements LinkedMenu {

    @Override
    public void startNode(Menu menu) {
        menu.setState(new StartState());
    }

    @Override
    public void nextNode(Menu menu) {
        //menu.setState(new ReceivedState());
    }

    @Override
    public void prevNode(Menu menu) {
        menu.setState(new StartState());
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    @Override
    public Map<Integer, String> printState(CoffeeMachine coffeeMachine) {
        //TODO new state
        System.out.println("TODO");
        return menuOutput;
    }

}
