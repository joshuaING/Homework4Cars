public class ParkingTester {
    public  void main(){
        ParkingLot lot = new ParkingLot();
        System.out.println(lot.toString());

    Car x = new Car("Infinity", "Blue", true);
        int parkTheCar = lot.parkTheCar(x);
        System.out.println(lot.toString());
        int unPark = lot.unPark(x);
        
    Car y = new Car("Cadillac", "Black", false);
        int parkTheCar2 = lot.parkTheCar(y);
        System.out.println(lot.toString());
        int unPark2 = lot.unPark(y);
        System.out.println(lot.toString());

    }
    
    }




















//• ParkingTester:
// ◦ Contains only a main class that performs the following operations:
 //▪ Instantiate a ParkingLot
 //▪ “Print” the ParkingLot by calling its ToString() method
 //▪ Instantiate a Car that represents a “Blue Infiniti”, with handicap accessible tags
 //▪ Park this Car in the ParkingLot
 //▪ “Print” the ParkingLot by calling its ToString() method
 //▪ Instantiate a Car entirely that represents a “Black Cadiliac”, non-handicap
 //▪ Park this Car in the ParkingLot
 //▪ “Print” the ParkingLot by calling its ToString() method
 //▪ Remove the first Car (the Infiniti) from the ParkingLot
 //▪ “Print” the ParkingLot by calling its ToString() method