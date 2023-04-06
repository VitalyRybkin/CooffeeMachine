public class Reservoir implements IRefillConsump {

    private String tankName;
    private double tankVolume;

    public Reservoir(String tankName, double tankVolume) {
        this.tankName = tankName;
        this.tankVolume = tankVolume;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public String getTankName() {
        return tankName;
    }

    @Override
    public void refillComponents(Double v) {
        this.tankVolume += v;
    }

    @Override
    public void consumpComponents(Double v) {
        this.tankVolume -= v;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nName: " + tankName + ", ")
                .append("Quantity: " + tankVolume + " ml");
        return sb.toString();
    }
}
