public class Figure {
   int height;
   int widht;
   int lenght;

   int a;
   int b;
   int h;




   public void myTriangles(){

   }

   public void myTriangleOptions(String massage){

      System.out.println(massage);

   }

   public double calculateVolume(){

      lenght = 12;
      widht = 16;
      height = 7;

      return (double) this.lenght * this.widht * this.height;
   }

   public int calculateSquare(){

      a = 2;
      b = 8;
      h = 4;

      return (int) 2*(this.a * this.b) + (this.a * this.h) + (this.b * this.h);

   }

}

