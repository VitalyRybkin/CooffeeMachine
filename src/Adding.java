public class Adding implements IRefillConsump {

    private final String addingName;
    private double addingConsumption;
    private double addingQuantity;

    public Adding(String addingName, double addingQuantity, double addingConsumption) {
        this.addingName = addingName;
        this.addingQuantity = addingQuantity;
        this.addingConsumption = addingConsumption;
    }

    public String getAddingName() {
        return addingName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nName: " + addingName + ", ")
                .append("Dosing: " + addingConsumption + " mg, ")
                .append("Quantity: " + addingQuantity + " mg");
        return sb.toString();
    }

    @Override
    public void refillComponents(Double v) {
        this.addingQuantity += v;
    }

    @Override
    public void consumpComponents(Double v) {this.addingQuantity -= v;}

}
