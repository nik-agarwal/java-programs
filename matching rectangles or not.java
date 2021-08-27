class rectangle{
    double len,wid,area;
    String color;
    void get_length(double len){
        this.len=len;
    }
    void get_width(double wid){
        this.wid=wid;
    }
    void get_color(String color){
        this.color=color;
    }
    double find_area(){
        this.area = this.len * this.wid;
        return this.area;
    }}

public class MyClass {
    public static void main(String args[]) {
      rectangle r1 = new rectangle();
      r1.get_length(9.9);
      r1.get_width(6.6);
      r1.get_color("green");
      double area1= r1.find_area();
      rectangle r2 = new rectangle();
      r2.get_length(8.6);
      r2.get_width(5.4);
      r2.get_color("blue");
      double area2= r2.find_area();
      System.out.println("Area of Rectangle 1 = " + r1.area + "  Color of Rectangle 1 : " + r1.color);
      System.out.println("Area of Rectangle 2 = " + r2.area + "  Color of Rectangle 2 : " + r2.color);
      
      if(r1.area == r2.area && r1.color == r2.color){
          System.out.println("\n Matching Rectangles ");
      }
      else{
           System.out.println("\n Rectangles are not matched");
      }

    }
}
