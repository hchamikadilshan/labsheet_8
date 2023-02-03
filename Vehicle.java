

public abstract class Vehicle{

    private String licensePlateNo ;
    private float deposit;

    //Setters
    public void setLicensePlateNo(String licensePlatenO){
        this.licensePlateNo = licensePlatenO;
    }

    public void setDeposite(float deposit){
        this.deposit = deposit;
    }

    //Getters
    public String getLicensePlateNo(){
        return licensePlateNo;
    }

    public float getDeposite(){
        return deposit;
    }

    public abstract String getModel();



    //Constructor
    public Vehicle(String licensePlateNo,float deposit){
        setDeposite(deposit);
        setLicensePlateNo(licensePlateNo);
    }

    //One Argument Constructor
    public Vehicle(String licensePlateNo){
        setLicensePlateNo(licensePlateNo);
        setDeposite(20000f);
    }
}
