public class MercedesBenze extends LuxaryCars {
    private float costPerDay;
    private float permittedDistance;

    // Setters
    public void setCostPerDay(float costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void setPermittedDistance(float permittedDistance) {
        this.permittedDistance = permittedDistance;
    }

    // Getters
    public float getCostPerDay() {
        return costPerDay;
    }

    public float getPermittedDistance() {
        return permittedDistance;
    }

    public String getModel(){
        return "Mercedeze Benze";
    }

    public MercedesBenze(String licensePlateNo) {
        super(licensePlateNo);
        setCostPerDay(20000f);
        setPermittedDistance(150f);
    }
}
