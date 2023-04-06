public class HotChocolate extends Product{

    private double chocoPowderConsumption;
    public HotChocolate(String productName, double productPrice, double chocoPowderConsumption) {
        super(productName, productPrice);
        this.chocoPowderConsumption = chocoPowderConsumption;
    }

    public double getChocoPowderConsumption() {
        return chocoPowderConsumption;
    }

}
