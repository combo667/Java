class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    Vehicle(){
        fuelcap=0;
        mpg=0;
        passengers=0;
    }

    Vehicle(int x, int y, int z) {
        passengers = x;
        fuelcap = y;
        mpg = z;
    }

}

class VehicleDemo {
    public static void main(String[] args) {
        int range, range1;
        Vehicle minivan;
        minivan = new Vehicle();
        Vehicle bike;
        bike = new Vehicle();
        Vehicle sportsCar;
        sportsCar = new Vehicle(3, 20, 14);
        bike.fuelcap = 30;
        bike.passengers = 2;
        bike.mpg = 40;

        minivan.fuelcap = 20;
        minivan.passengers = 6;
        minivan.mpg = 20;

        range = minivan.fuelcap * minivan.mpg;
        range1 = bike.fuelcap * bike.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " passengers " + " With a range of " + range);
        System.out.println("Bike can carry " + bike.passengers + " passengers " + " With a range of " + range1);
        System.out.println("The fuel required by bike to travel 30 miles is :" + bike.fuelNeeded(30) + "Gallons");

        System.out.println("Passengers capacity of sports car is :" + sportsCar.passengers);
        System.out.println("Fuel capacity of sports car is :" + sportsCar.fuelcap);
        System.out.println("Miles per gallon of sports car is :" + sportsCar.mpg);
    }
}