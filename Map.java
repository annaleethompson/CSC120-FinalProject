public class Map {
    
    public House house;
    public User user;
    public Room clue;
    public static Room kitchen;
    public static Room dining;
    public static Room conservatory;
    public static Room hall; 
    public static Room theatre;
    public static Room library;
    public static Room lounge;
    public static Room study;

    public Map() {
        this.house = new House("Clue", "1 Mystery Lane");
        this.user = new User();
        this.clue = new Room("Clue Room", 0, 0);
        this.house.addRoom(clue);
        Room kitchen = new Room("Kitchen", 2, 2);
        this.house.addRoom(kitchen);
        Room dining = new Room("Dining Room", 2, 0);
        this.house.addRoom(dining);
        Room conservatory = new Room("Conservatory", 2, -2);
        this.house.addRoom(conservatory);
        Room hall = new Room("Hall", 0, -2);
        this.house.addRoom(hall);
        Room study = new Room("Study", -2, -2);
        this.house.addRoom(study);
        Room theatre = new Room("Theatre", -2, 0);
        this.house.addRoom(theatre); 
        Room library = new Room("Library", -2, 2);
        this.house.addRoom(library);
        Room lounge = new Room("Lounge", 0, 2);
        this.house.addRoom(lounge);

    }

    public static void enterRoom(int x_position, int y_position) {
        if (x_position ==-2 && y_position ==0) {
            theatre.enterRoom();
        }
        else {
            throw new RuntimeException("There is no room in this direction");
        }
    }
}