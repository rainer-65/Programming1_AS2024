package lecture10.examples;

class House2 {
    // Outer class member
    private String address;

    // Constructor for the outer class
    public House2(String address) {
        this.address = address;
    }

    // Method in the outer class
    public String getAddress() {
        return address;
    }

    // Static nested class
    static class Room {
        private String name;
        private int area; // in square meters

        // Constructor for the nested class
        public Room(String name, int area) {
            this.name = name;
            this.area = area;
        }

        // Method to display room details
        public void displayRoomInfo() {
            System.out.println("Room Name: " + name);
            System.out.println("Room Area: " + area + " square meters");
        }
    }

    public static void main(String[] args) {
        // Create a Room instance without a House instance
        Room livingRoom = new Room("Living Room", 20);

        // Display room details
        livingRoom.displayRoomInfo();
    }
}
