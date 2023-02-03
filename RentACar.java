
public class RentACar implements GPSListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GPS gps = new GPS("bmw");
        gps.setGPSListener(new RentACar());
        gps.startGPSSimulation();
    }

    @Override
    public void onChangeLocation(double lat, double lon, String id) {

        System.out.println(lat + ", " + lon + " " + id);
    }

}