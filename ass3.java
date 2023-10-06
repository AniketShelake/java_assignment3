// We want to calculate the total marks of each student of a class in
// Physics,Chemistry and Mathematics and the average marks of
// the class. The number of students in the class are entered by the
// user. Create a class named Marks with data members for roll
// number, name and marks. Create three other classes inheriting
// the Marks class, namely Physics, Chemistry and Mathematics,
// which are used to define marks in individual subject of each
// student. Roll number of each student will be generated
// automatically.

import java.util.ArrayList;
import java.util.Scanner;

class Marks{
    Marks(){

    }

    Scanner sc=new Scanner(System.in);
    
    int roll_number;
    String name;
    int marks;
    public Marks(int roll_number, String name, int marks) {
        this.roll_number = roll_number;
        this.name = name;
        this.marks = marks;
    }
    

}
class Physics extends Marks{
    Scanner sc=new Scanner(System.in);
   int Physics_marks=sc.nextInt();
   Marks s1=new Marks();
   //s1.roll_number=sc.nextInt();
   
}
class Chemistry extends Marks{
   
}
class Mathematics extends Marks{

}
public class ass3 {
    public static void main(String[] args) {
        System.out.println("Enter Number of students");
        Scanner sc=new Scanner(System.in);
        int no_students=sc.nextInt();
       // System.out.println("Roll number of Students ");
    //     for(int i=1;i<=no_students;i++){
    //         System.out.print("  "+i);
    //     }
    //     Marks m1=new Marks(1, null, no_students);
    //     ArrayList<Marks> list=new ArrayList<Marks>();
    int i=1;
          Marks m1=new Marks(i, "Aniket", 91);
          Marks m2=new Marks(i++, "Anugaj", 90);
          Marks m3=new Marks(i++, "Anhdjf", 93);
          Marks m4=new Marks(i++, "dhiraj", 92);
          Marks m5=new Marks(i++, "Mohit", 94);

     }

}
