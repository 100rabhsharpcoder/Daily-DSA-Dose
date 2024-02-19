package OOPS;
class Student {
    int rno;
    String name;
    float marks;
     Student(int rno, String name, float marks){
         this.rno = rno;
         this.name = name;
         this.marks = marks;
     }

}

public class Main {
   
    public static void main(String[] args) {
         Student saurabh = new Student(131, "satnxsnc", 5645);
        //  System.out.println(saurabh);
         System.out.println(saurabh.rno);
         System.out.println(saurabh.name);
         System.out.println(saurabh.marks);

    }
}
