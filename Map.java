public class Map {
    
    public House house;
    public User user;
    public Room clue;
    public Room kitchen;
    public Room dining;
    public Room conservatory;
    public Room hall; 
    public Room theatre;
    public Room library;
    public Room lounge;
    public Room study;

    public Map() {
        this.house = new House("Clue", "1 Mystery Lane");
        this.user = new User();
        this.clue = new Room("Clue Room", 0, 0);
        this.house.addRoom(clue);
        this.kitchen = new Room("Kitchen", 2, 2);
        this.house.addRoom(kitchen);
        this.dining = new Room("Dining Room", 2, 0);
        this.house.addRoom(dining);
        this.conservatory = new Room("Conservatory", 2, -2);
        this.house.addRoom(conservatory);
        this.hall = new Room("Hall", 0, -2);
        this.house.addRoom(hall);
        this.study = new Room("Study", -2, -2);
        this.house.addRoom(study);
        this.theatre = new Room("Theatre", -2, 0);
        this.house.addRoom(theatre); 
        this.library = new Room("Library", -2, 2);
        this.house.addRoom(library);
        this.lounge = new Room("Lounge", 0, 2);
        this.house.addRoom(lounge);


    }
}