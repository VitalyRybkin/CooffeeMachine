import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CoffeeMachine {

    private List<Adding> addingsList = new ArrayList<>();
    private List<Reservoir> reservoirsList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();
    private List<Cup> cupList = new ArrayList<>();
    private double totalCash;


    public double getTotalCash() {
        return totalCash;
    }
    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    public void AddAdding(Adding adding) {
        this.addingsList.add(adding);
    }
    public void AddReservoir(Reservoir reservoir){
        this.reservoirsList.add(reservoir);
    }
    public void AddProduct(Product product){
        this.productList.add(product);
    }
    public void AddCup(Cup cupSize) { this.cupList.add(cupSize);}


    public List<Reservoir> getReservoirsList() {
        return reservoirsList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coffee Machine info:")
                .append("\nAddings:")
                .append(addingsList)
                .append("\nReservoirs:")
                .append(reservoirsList)
                .append("\nCups:")
                .append(cupList);
        return sb.toString();
    }

    public void RefillAdding(String name, double v) {
        for (Adding adding : addingsList) {
            if (Objects.equals(adding.getAddingName(), name)) {
                adding.refillComponents(v);
                System.out.printf("Adding %s is refilled!%n", adding.getAddingName());
            }
        }
    }

    public void RefillReservoir(String name, double v) {
        for (Reservoir reservoir : reservoirsList) {
            if (Objects.equals(reservoir.getTankName(), name)) {
                reservoir.refillComponents(v);
                System.out.printf("Reservoir %s is refilled!%n", reservoir.getTankName());
            }
        }
    }

    public void RefillCup(String name, double v) {
        for (Cup cup : cupList) {
            if (Objects.equals(cup.getSizeIdentification(), name)) {
                cup.refillComponents(v);
                System.out.printf("Adding %s is refilled!%n", cup.getSizeIdentification());
            }
        }
    }

    public void Encashment(double cash){
        if (this.getTotalCash() < cash) {
            this.totalCash = this.getTotalCash() - cash;
        }
        else {
            System.out.println("Not enough cash to take out!");
        }
    }
}
