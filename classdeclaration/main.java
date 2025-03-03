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
        Car yourCar = new Car();
        
        myCar.car_number = 1234;
        myCar.gasoline   = 20.5;
        myCar.car_name   = "prius";
        myCar.car_color  = "Red";

        yourCar.car_number = 5678;
        yourCar.gasoline   = 30.5;
        yourCar.car_name   = "corolla";
        yourCar.car_color  = "Blue";

        System.out.println("Car Number: " + myCar.car_number);
        System.out.println("Gasoline: " + myCar.gasoline);
        System.out.println("Car Name: " + myCar.car_name);
        System.out.println("Car Color: " + myCar.car_color);

        System.out.println("Car Number: " + yourCar.car_number);
        System.out.println("Gasoline: " + yourCar.gasoline);
        System.out.println("Car Name: " + yourCar.car_name);
        System.out.println("Car Color: " + yourCar.car_color);
    }
}