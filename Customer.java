public class Customer{
    private String name;
    private String contacNo;
    private String nicNo;

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setContactNo(String contactNo){
        this.contacNo= contactNo;
    }

    public void setNicNo(String nicNo){
        this.nicNo = nicNo;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getContactNo(){
        return contacNo;
    }

    public String getNicNo(){
        return nicNo;
    }



    public Customer(String name,String contacNo,String nicNo){
        setContactNo(contacNo);
        setName(name);
        setNicNo(nicNo);
    }
}