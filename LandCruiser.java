public class LandCruiser  extends Suv{
    private float costPerDay;

    // Setters
    public void setCostPerDay(float costPerDay) {
        this.costPerDay = costPerDay;
    }

    //Getters
    public float getCostPerDay() {
        return costPerDay;
    }

    public String getModel() {
        return "Land Cruiser";
    }

    public LandCruiser(String licensePlateNo){
        super(licensePlateNo);
        setCostPerDay(12000f);
    }
}
