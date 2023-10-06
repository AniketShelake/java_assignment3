// Make a class named Fruit with a data member to calculate the
// number of fruits in a basket. Create two other class named
// Apples and Mangoes to calculate the number of apples and
// mangoes in the basket. Print the number of fruits of each type
// and the total number of fruits in the basket.

class Fruit{
    int no_fruit;
    
     
}
class Apples {
  int no_Apples;
}
class Mangoes {
  int no_mangoes;
}
class ass2{
    public static void main(String[] args) {
        Fruit f1=new Fruit();
        Apples a1=new Apples();
        a1.no_Apples=5;
        Mangoes m1=new Mangoes();
        m1.no_mangoes=7;
        f1.no_fruit=a1.no_Apples+m1.no_mangoes;
        System.out.println("Total number of fruits in basket "+f1.no_fruit);
    }
}