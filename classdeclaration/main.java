package classdeclaration;

class Car {
    int car_number;
    double gasoline;
    String car_name;
    String car_color;
}

class toyota {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.car_number = 1234;
        myCar.gasoline   = 20.5;
        myCar.car_name   = "prius";
        myCar.car_color  = "Red";

        System.out.println("Car Number: " + myCar.car_number);
        System.out.println("Gasoline: " + myCar.gasoline);
        System.out.println("Car Name: " + myCar.car_name);
        System.out.println("Car Color: " + myCar.car_color);
    }
}