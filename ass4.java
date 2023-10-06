// We want to store the information of different vehicles. Create a
// class named Vehicle with two data member named mileage and
// price. Create its two subclasses

// *Car with data members to store ownership cost, warranty (by
// years), seating capacity and fuel type (diesel or petrol).

// *Bike with data members to store the number of cylinders,
// number of gears, cooling type(air, liquid or oil), wheel
// type(alloys or spokes) and fuel tank size(in inches)

// Make another two subclasses Audi and Ford of Car, each having
// a data member to store the model type. Next, make two
// subclasses Bajaj and TVS, each having a data member to store
//the make-type.

// Now, store and print the information of an Audi and a Ford car
// (i.e. model type, ownership cost, warranty, seating capacity, fuel
// type, mileage and price.) Do the same for a Bajaj and a TVS
// bike.
class Vehicles{
    int mileage;
    float price;
    @Override
    public String toString() {
        return "Vehicles [mileage=" + mileage + ", price=" + price + "]";
    }
    public Vehicles(int mileage, float price) {
        this.mileage = mileage;
        this.price = price;
    }
    
}
class Car extends Vehicles{
    float ownership_cost;
    int warranty;
    public Car(int mileage, float price, float ownership_cost, int warranty, int seating_capacity, String fuel_type) {
        super(mileage, price);
        this.ownership_cost = ownership_cost;
        this.warranty = warranty;
        this.seating_capacity = seating_capacity;
        this.fuel_type = fuel_type;
    }
    int seating_capacity;
    @Override
    public String toString() {
        return "Car [ownership_cost=" + ownership_cost + ", warranty=" + warranty + ", seating_capacity="
                + seating_capacity + ", fuel_type=" + fuel_type + "]";
    }
    String fuel_type;
} 
class Bike extends Vehicles{
    int no_cylinders;
    int no_gears;
    public Bike(int mileage, float price, int no_cylinders, int no_gears, String cooling_type, String wheel_type,
            int fuel_tank_size) {
        super(mileage, price);
        this.no_cylinders = no_cylinders;
        this.no_gears = no_gears;
        this.cooling_type = cooling_type;
        this.wheel_type = wheel_type;
        this.fuel_tank_size = fuel_tank_size;
    }
    String cooling_type;
    String wheel_type;
    int fuel_tank_size;


}
class Audi extends Car{
    
  String model_type;

public Audi(int mileage, float price, float ownership_cost, int warranty, int seating_capacity, String fuel_type,
        String model_type) {
    super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
    this.model_type = model_type;
    System.out.println("mileage "+mileage+ "price "+price+ "ownership_cost "+ownership_cost+" warranty "+warranty+" seating_capacity "+seating_capacity+ " fuel_type "+fuel_type);
}

@Override
public String toString() {
    return "Audi [model_type=" + model_type + "]";
}
}
class Ford extends Car{
  String model_type;

public Ford(int mileage, float price, float ownership_cost, int warranty, int seating_capacity, String fuel_type,
        String model_type) {
    super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
    this.model_type = model_type;
}
}
class Bajaj extends Bike{
   String make_type;

public Bajaj(int mileage, float price, int no_cylinders, int no_gears, String cooling_type, String wheel_type,
        int fuel_tank_size, String make_type) {
    super(mileage, price, no_cylinders, no_gears, cooling_type, wheel_type, fuel_tank_size);
    this.make_type = make_type;
}
}
class TVS extends Bike{
 String make_type;

public TVS(int mileage, float price, int no_cylinders, int no_gears, String cooling_type, String wheel_type,
        int fuel_tank_size, String make_type) {
    super(mileage, price, no_cylinders, no_gears, cooling_type, wheel_type, fuel_tank_size);
    this.make_type = make_type;
}
}
public class ass4 {
    public static void main(String[] args) {
        Audi a1=new Audi(10, 100000, 1200000, 1, 7, "petrol"," q6");
        // a1.mileage=10;
        // a1.price=10000;
        // a1.ownership_cost=12000;
        // a1.seating_capacity=7;
        // a1.model_type="q7";
        System.out.println(a1.toString());
    }
}
