import java.util.HashMap;
import java.util.Map;

public class Menu {
    private LinkedMenu state = new StartState();

    public LinkedMenu getState() {
        return state;
    }

    public void setState(LinkedMenu state) {
        this.state = state;
    }

    public void previousState() {
        state.prevNode(this);
    }

    public void nextState() {
        state.nextNode(this);
    }

    public void exitState() {
        state.exit();
    }

    public Map<Integer, String> printStatus(CoffeeMachine coffeeMachine) {
        Map<Integer, String> menuOutput = new HashMap<>();
        menuOutput = state.printState(coffeeMachine);
        return menuOutput;
    }

}
