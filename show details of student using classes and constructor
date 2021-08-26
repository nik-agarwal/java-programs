class studentdetails{
    int regno;
    String name;
    int marks[];
    int total;
      studentdetails(int regno, String name, int marks[]){
          this.regno=regno;
          this.name=name;
          this.marks=marks;
          }
        void caltotal(){
            for(int i=0; i<5;++i){
                total+=marks[i];
            }   
        }  
        
        void display(){
            System.out.println("Regno. :" + regno + "\nName : " + name + "\nMarks : ");
            for(int i=0; i<5;++i){
                System.out.print(marks[i]+" ");
            }
            System.out.println("\nTotal Marks : " + total + "\n \n");
        }
}


public class MyClass {
    public static void main(String args[]) {
      int mks[]={77,78,78,79,80};
      studentdetails student1= new studentdetails(1,"Nikhil",mks);
      student1.caltotal();
      student1.display();
      studentdetails student2= new studentdetails(2,"Nikhil",mks);
      student2.caltotal();
      student2.display();
      studentdetails student3= new studentdetails(3,"Nikhil",mks);
      student3.caltotal();
      student3.display();
      studentdetails student4= new studentdetails(4,"Nikhil",mks);
      student4.caltotal();
      student4.display();
      studentdetails student5= new studentdetails(5,"Nikhil",mks);
      student5.caltotal();
      student5.display();
    }
}
