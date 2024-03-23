import java.util.*;
public class StudentImpl {
     public static void main(String[] args){
               Student s= new Student("praveen","7094");
                 s.display();
     }
}
class Student{
    String nam,m;
    Student(String name,String rno){
      nam=name;
      rn=rno;
     }
public void display(){
    System.out.printf("Welcome %s rno is %s \n",nam,rn);

     }
}
