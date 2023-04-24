import java.util.ArrayList;

public class User {
    /**Stores strings for the name and type of the bug, and integers for the x_positon, y_position, size, and energy. Also stores an ArrayList for all the items that the bug is holding.  */
    public ArrayList<String> items;
    int x_position;
    int y_position;


    /**Constructor */ 
    public User() {
        this.items = new ArrayList<String>();
        this.x_position = 0;
        this.y_position = 0;
    }
    
    /**Manipulator to grab an item by adding it to the items arraylist if the bug has enough energy and can hold another object. Reduces the bugs energy if it can grab the item. 
     * @param item item to be grabbed (item to be added to the items ArrayList)
     */
    public void grab(String item) {
        if (this.items.size() ==2) {
            throw new RuntimeException("You cannot hold more than two items");
        }
        if (this.items.size() < 2){
            items.add(item);
        }
    }

    /**Manipulator to drop an item by removing it from the items arraylist if the bug is holding the item. 
     * @param item item to be dropped (item to be removed from the items Arraylist)
     */
    public String drop(String item) {
        if (this.items.size() ==0) {
            throw new RuntimeException("You arent holding any items");
        }
        if (!this.items.contains(item)) {
            throw new RuntimeException("You aren't holding " + item);
        }
        else {
            this.items.remove(item);
            return item;
        }
    }

    /**Function that examines an item if the bug has enough energy. Reduces the bugs energy if it can examine the item. 
     * @param item item to be examined
     */
    public void examine(String item) {
        grab(item);
        //Get clue
        drop(item);
    }
    
    public void inventory() {
        System.out.println("Current inventory:");
        System.out.println(this.items.toString()
                            .replace("[","")
                            .replace("]","")
                            .replace(", ", "\n"));

    }

    //public void goWest() {

    //}

    //public void goEast() {
        
    //}

    //public void goNorth() {

    //}

    //public void goSouth() {

    //}

    public static void main(String[] args) {
        User myHouse = new User();
        myHouse.grab("pen");
        myHouse.grab("pencil");
        myHouse.inventory();
    }

}