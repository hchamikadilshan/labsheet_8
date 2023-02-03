

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ravimal
 */
public class GPS {
    private GPSListener gpsListener;
    private String id;
    private double lat;
    private double lon;
    Random rnd;
    
    public GPS(String id){
        this.id = id;
        rnd = new Random(System.currentTimeMillis());
        lat = 7+rnd.nextDouble();
        lon = 80+rnd.nextDouble();
    }
    
    public void setGPSListener(GPSListener listener){
        this.gpsListener = listener;
    }
    
    public void startGPSSimulation(){
        new Simulator().start();
    }
    
    private class Simulator extends Thread{
        
        @Override
        public void run(){
            while(true){
                
                    if(gpsListener!=null){
                        lat = lat+rnd.nextDouble()/100.0;
                        lon = lon+rnd.nextDouble()/100.0;
                        gpsListener.onChangeLocation(lat, lon, id);
                    }
                  try {
                    sleep(15000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GPS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}