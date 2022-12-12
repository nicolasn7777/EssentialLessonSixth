package task_vehicles;

enum Vehicles {
    // Екземпляри
    CAR(20000){
        @Override
        public String toString() {
            return "CAR price: " + cost + ". Color: " + CAR.getColour("red");
        }
    },
    SHIP(7000000){
        @Override
        public String toString() {
            return "SHIP price: " + cost + ". Color: " + SHIP.getColour("blue");
        }
    };
    int cost;

    // Конструктор
    Vehicles(int cost) {
        this.cost = cost;
    }

    public String getColour(String color) {
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicles car = Vehicles.CAR;
        System.out.println(car.toString());

        Vehicles ship = Vehicles.SHIP;
        System.out.println(ship.toString());
    }
}
