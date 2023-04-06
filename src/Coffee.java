public class Coffee extends Product{
    private double milkConsumption;
    private double coffeeConsumption;


    public Coffee(String productName, double productPrice, double milkConsumption, double coffeeConsumption) {
        super(productName, productPrice);
        this.milkConsumption = milkConsumption;
        this.coffeeConsumption = coffeeConsumption;
    }

    public double getMilkConsumption() {
        return milkConsumption;
    }

    public double getCoffeeConsumption() {
        return coffeeConsumption;
    }
}
