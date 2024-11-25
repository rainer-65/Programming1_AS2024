package lecture10.examples;

import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Other room-related methods
}

class House {
    private ArrayList<Room> rooms; // Composition

    public House() {
        this.rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
    }

    public List<Room> getRooms() {
        return rooms;
    }

// Other house-related methods
}

public class BadComposition {
    public static void main(String[] args) {

        // Should not be possible without having a house assigned to it!
        // "myRoom" cannot exist alone!
        Room myRoom = new Room("Living Room");
        System.out.println("Room: " + myRoom);

    }
}