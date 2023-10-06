// Q1.Create two classes named Mammals and MarineAnimals. Create another class named
//  BlueWhale which inherits both the above classes. Now, create a function in each
//   of these classes which prints "I am mammal", "I am a marine animal" and "I belong 
//   to both the categories: Mammals as well as Marine Animals" respectively. Now, create an object for each of 
// the above class and try calling 

class Mammals{
   void display(){
    System.out.println("I am mammal");
   }
}
class MarineAnimals{
  void display(){
    System.out.println("I am a marine animal");
  }
}
class BlueWhale extends Mammals , MarineAnimals{
   void display1(){
    System.out.println("I belong  to both the categories: Mammals as well as Marine Animals");
  }
}