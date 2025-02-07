//Discussed this assignment with Chris Gavyn and Jacob

public class Car { 
    public String make; 
    public boolean handicapped;
    public String color;

    public Car(String make, String color, boolean handicapped){ //make,color, and handicapped are the parameters
        this.make = make;
        this.handicapped = handicapped;
        this.color = color;


    }
    public String getMake(){
        return make;
    }
    public boolean isHandicapped(){
        return handicapped;
    }
    public String getColor(){
        return color;
    }
    
    }

    
