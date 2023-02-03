public class LandRover extends Suv{
    private float costPerDay;
    
    //Setters
    public void setCostPerDay(float costPerDay) {
        this.costPerDay = costPerDay;
    }

    //Getters
    public float getCostPerDay() {
        return costPerDay;
    }
    
    public String getModel() {
        return "Land Rover";
    }

    public LandRover(String licensePlateNo){
        super(licensePlateNo);
        setCostPerDay(5000f);
    }
}
