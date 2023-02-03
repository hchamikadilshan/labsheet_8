import java.util.Scanner;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


class Main {
  static ArrayList<Customer> customers = new ArrayList();
  static ArrayList<Vehicle>  vehicles = new ArrayList();
  static ArrayList<RentAgreement> rentAgreements = new ArrayList();


  
  public static void main(String[] args) throws ParseException {
    initialCars();
    
    menu();
  }

  public static void initialCars(){
    LandRover landRover1 = new LandRover("ABC 1234");
    LandRover landRover2 = new LandRover("ABC 5689");
    LandRover landRover3 = new LandRover("ABC 1256");
    LandRover landRover4 = new LandRover("ABC 9878");

    LandCruiser landCruiser1 = new LandCruiser("DEF 1234");
    LandCruiser landCruiser2 = new LandCruiser("DEF 1235");

    Bmw bmw1 = new Bmw("GHI 1234");
    Bmw bmw2 = new Bmw("GHI 4567");
    Bmw bmw3 = new Bmw("GHI 7895");

    MercedesBenze benze1 = new MercedesBenze("JKL 1234");
    MercedesBenze benze2 = new MercedesBenze("JKL 4567");

    vehicles.add(landRover1);
    vehicles.add(landRover2);
    vehicles.add(landRover3);
    vehicles.add(landRover4);
    vehicles.add(landCruiser1);
    vehicles.add(landCruiser2);
    vehicles.add(bmw1);
    vehicles.add(bmw2);
    vehicles.add(bmw3);
    vehicles.add(benze1);
    vehicles.add(benze2);

  }
  public static void searchRentAgreement(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("\t|Press 1 BY CUSTOMER NAME");
    System.out.println("\t|Press 2 BY LICENSE PLATE NO");
    int choice = scanner.nextInt();

    switch(choice){
      case 1:
        System.out.print("Enter Customer Name:");
        scanner.nextLine();
        String customerName2 = scanner.nextLine();

        rentAgreements.stream().
        filter(agreement -> (agreement.getCustomer().getName().equals(customerName2)))
        .forEachOrdered(agreement -> {
          System.out.println("\t Customer Name      : " + agreement.getCustomer().getName());
          System.out.println("\t Rent Date          : " + agreement.getRentDate());
          System.out.println("\t Hand Over Date     : " + agreement.getHandOverDate());
        });


        break;

      case 2:
        System.out.print("Enter License Plate No:");
        String licensePlateNo = scanner.nextLine();
        break;
    }


  }

  public static void createNewRentAgreement(){

    getVehicleAvailability();
    ArrayList<Vehicle> rentAgreemenVehicles = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    DateFormat  formatter = new SimpleDateFormat("dd/mmdyyyy");

    System.out.print("Enter Customer Name:");
    String customerName = scanner.nextLine();

    System.out.print("Enter No of Vehicles:");
    int noOfVehicles = scanner.nextInt();
    System.out.println(noOfVehicles);

    for (int i = 0; i < noOfVehicles; i++) {

      System.out.print("Enter Vehicle " + "License Plate No :");
      scanner.nextLine();
      String vehicleLicensePlateNo = scanner.nextLine();

//Error 1
      vehicles.stream()
          .filter(vehicle -> (vehicle.getLicensePlateNo().equals(vehicleLicensePlateNo)))
          .forEachOrdered(vehicle -> {
            rentAgreemenVehicles.add(vehicle);
            vehicles.remove(vehicle);
          });
      
    };



    System.out.print("Enter Rent Date(mm/dd/yyyy) :");
    String rentDate = scanner.nextLine();


    System.out.print("Enter Handover Date(mm/dd/yyyy) :");
    String handOverDate = scanner.nextLine();

    System.out.println(customers);

    
    customers.stream().filter(customer -> (customer.getName().equals(customerName))).
                forEachOrdered(customer -> {
                  RentAgreement rentAgreement = new RentAgreement(customer, rentAgreemenVehicles, rentDate, handOverDate);
                  rentAgreements.add(rentAgreement);
                });
    menu();
  }

  public static void getVehicleAvailability(){
    int bmw =0;
    int landRover =0;
    int landCruiser =0;
    int benze =0;
    for (Vehicle vehicle : vehicles){
      switch(vehicle.getModel()){
        case "Mercedeze Benze":
          benze +=1 ;
          break;

        case "Land Cruiser":
          landCruiser +=1;
          break;
        
        case "Land Rover":
          landRover += 1;
          break;

        case "BMW":
            bmw += 1;
            break;
      }
    }
    System.out.println("\t\t\t       Vehicle Availability");
    System.out.println("\t\t\t       ------------------");
    System.out.println("\t|Land Cruiser    :" + landCruiser);
    System.out.println("\t|Land Rover      :" + landRover);
    System.out.println("\t|Mercedeze Benze :" + benze);
    System.out.println("\t|BMW             :" + bmw);
    System.out.println("\t\t\t       ------------------");
    
  }

  public static void addCustomer(){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter Customer Name:");
    String customerName = scanner.nextLine();
    System.out.print("Enter contact no:");
    String contactNo = scanner.nextLine();
    System.out.print("Enter NIC no:");
    String nicNo = scanner.nextLine();

    Customer newCustomer = new Customer(customerName,contactNo,nicNo);
    customers.add(newCustomer);
    System.out.print(String.format("Customer %s added to the system scuccefully",customerName));
    menu();
  
  }
  public static void menu(){
    System.out.println("\t\t\t      Vehicle Rent System");
    System.out.println("\t\t\t       ------------------");
    System.out.println("\t|Press 1 ADD A NEW CUSTOMER");
    System.out.println("\t|Press 2 CREATE NEW RENT AGREEMENT");
    System.out.println("\t|Press 3 CHECK VEHICLE AVAILABILITY");
    System.out.println("\t|Press 4 SEARCH RENT AGREEMENT");


    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    switch(choice){
      case 1:
        addCustomer();
        break;
      case 2:
        createNewRentAgreement();
        break;
      case 3:
        getVehicleAvailability();
        menu();
        break;
      case 4:
        searchRentAgreement();
        break;
          
    }
  }
}