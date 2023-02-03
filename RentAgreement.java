import java.util.ArrayList;
import java.util.Date;

public class RentAgreement{
    private Customer customer;
    private ArrayList<Vehicle> vehicles;
    private String rentDate;
    private String handOverDate;

    //Setters
  public void setRentDate(String rentDate){
      this.rentDate = rentDate;
    }

  public void setHandOverDate(String handOverDate){
      this.handOverDate = handOverDate;
    }

  public void setCustomer(Customer customer){
    this.customer = customer;
  }

  public void setVehicles(ArrayList<Vehicle> vehicles){
    this.vehicles = vehicles;
  }
    //Getters
  public String getRentDate(){
    return rentDate;
  }

  public String getHandOverDate(){
    return handOverDate;
  }

  public Customer getCustomer(){
    return customer;
    }

    //Constructor
    public RentAgreement(Customer customer, ArrayList<Vehicle> vehicles, String rentDate, String handOverDate){
      setCustomer(customer);
      setRentDate(rentDate);
      setHandOverDate(handOverDate);
      setVehicles(vehicles);
    }
}