public class ParkingSpot {  
    public boolean handicapped; 
    public Car car; //null = empty

    public ParkingSpot(boolean handicapped){ //note to self we are defining the spot here is it handicap?
        this.handicapped = handicapped;
        this.car = null; //no car here at first
    }

}