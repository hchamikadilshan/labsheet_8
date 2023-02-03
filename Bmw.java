public class Bmw extends LuxaryCars {
    private float costPerDay;
    private float permittedDistance;


    //Setters
    public void setCostPerDay(float costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void setPermittedDistance(float permittedDistance) {
        this.permittedDistance = permittedDistance;
    }

    //Getters
    public float getCostPerDay() {
        return costPerDay;
    }

    public float getPermittedDistance() {
        return permittedDistance;
    }

    public String getModel() {
        return "BMW";
    }

    public Bmw(String licensePlateNo){
        super(licensePlateNo);
        setCostPerDay(13000f);
        setPermittedDistance(100f);
    }
}
