// Spoke with Chris, Jacob and Gavyn on this portion 
public class ParkingLot {
    public ParkingSpot[] spaces;

    public ParkingLot(){
        spaces = new ParkingSpot[8];
        for (int i = 0; i <= 8; i++){
            if (i<2){
                spaces[i] = new ParkingSpot(true);
            } else {
                spaces[i] = new ParkingSpot(false);
                
            }
        }
    }
    public int parkTheCar(Car car){ 
        for(int i = 0; i<8; i++){
            if (ParkingSpots[i].car == null){
                if (car.handicap == ParkingSpots[i].handicap){
                    ParkingSpots[i].car = car;
                    return i;
                }
            }
        return -1;
        }

        }
    public Car unpark(int i){
    Car x = ParkingSpots[i].car;
    PArkingSpots[i].car = null;
    return x;
    }

    public String toString(){
        for (int i = 0; i <= 8; i++){
            if spaces.car == null
        } 
        return " ";
    }
   
}  