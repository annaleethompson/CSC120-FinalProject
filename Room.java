import java.util.ArrayList;

public class Room {
    
    public String name;
    public int x_position;
    public int y_positon;
    public ArrayList<String> residents;
    public ArrayList<String> items;

    public Room(String name, int x_position, int y_positon) {
        this.name = name;
        this.x_position = x_position; 
        this.y_positon = y_positon;
        this.residents = new ArrayList<String>();
        this.items = new ArrayList<String>();
    }
    /**
     * Adds a passenger to a car and throws a RunTimeException if the passenger is on the car already or if the car is at maximum capacity.
     * @param p the passenger to be added
     */
    public void enterRoom (String p) {
        this.residents.add(p);
    }

    /**
     * Removes a passenger from a car and throws a RunTimeException if the passenger isn't in the car or if there are no passengers on the car.
     * @param p the passenger to be removed
     */
    public void removePassenger(String p) {
        this.residents.remove(p);
    } 
    

}
