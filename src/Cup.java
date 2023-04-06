public class Cup implements IRefillConsump {
    private String sizeIdentification;
    private int size;
    private int cupQuantity;

    public Cup(String sizeIdentification, int size, int cupQuantity) {
        this.sizeIdentification = sizeIdentification;
        this.size = size;
        this.cupQuantity = cupQuantity;
    }

    public String getSizeIdentification() {
        return sizeIdentification;
    }

    @Override
    public void refillComponents(Double v) {
        this.cupQuantity += v;
    }

    @Override
    public void consumpComponents(Double v) {
        this.cupQuantity -= v;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nName: " + sizeIdentification + ", ")
                .append("Volume: " + size + " ml, ")
                .append("Quantity: " + cupQuantity + " pcs.");
        return sb.toString();
    }
}
