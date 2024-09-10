package lecture10.exercises;

import java.util.ArrayList;
import java.util.List;

// Class 1
// Building class
class Building {

    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private List<Room> rooms;

    public Building(String name, String streetAddress, String city, String state, String zipCode) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.rooms = new ArrayList<>();
    }

    // Room is tightly connected to Building (Composition)
    static class Room {
        private String roomId;
        private float size;

        public Room(String roomId, float size) {
            this.roomId = roomId;
            this.size = size;
        }

        public String toString() {
            return "Room: " + "Room ID = " + roomId + ", Size = " + size;
        }


    }

    // Method to add new Room to a Building
    public void addRoom(Building.Room room) {
        rooms.add(room);
    }

    // Getting all Rooms
    public List<Building.Room> getRooms() {
        return rooms;
    }

}

// Class 2: Driver class
class BuildingRoom {

    public static void main(String[] args) {
        // Creating a Room object
        Building ovr = new Building("FHNW OVR", "Von Roll-Strasse 10", "Olten", "Solothurn", "4600");

        // Adding Rooms to the Building
        ovr.addRoom(new Building.Room("B151", 20f));
        ovr.addRoom(new Building.Room("A131", 100f));
        ovr.addRoom(new Building.Room("B223", 18f));

        // Printing Room details
        System.out.println("Room details of OVR Building: ");
        System.out.println(ovr.getRooms().toString());
    }
}
