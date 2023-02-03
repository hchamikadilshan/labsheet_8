public abstract class LuxaryCars extends Vehicle {
    private float insuranceCharge;
    private float additionalRent;

    //setters
    public void setInsuranceCharge(float insuranceCharge){
        this.insuranceCharge = insuranceCharge;
    }

    public void setAdditionalRent(float additionalRent){
        this.additionalRent= additionalRent;
    }
    //Getters
    public float getInsuranceCharge(){
        return insuranceCharge;
    }

    public float getAdditonalRent(){
        return additionalRent;
    }
    //One Argument Constructor
    public LuxaryCars(String licensePlateNo){
        super(licensePlateNo);
        setAdditionalRent(10.0f);
        setDeposite(2000f);
    }
    
}
