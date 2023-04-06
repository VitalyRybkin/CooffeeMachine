import java.util.HashMap;
import java.util.Map;

public interface LinkedMenu {

    Map<Integer, String> menuOutput = new HashMap<>();

    void nextNode(Menu menu);

    void prevNode(Menu menu);

    void startNode(Menu menu);

    void exit();

    Map<Integer, String> printState(CoffeeMachine coffeeMachine);
}
