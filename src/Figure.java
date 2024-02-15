public class Figure {
   int height;
   int widht;
   int lenght;

   int a;
   int b;
   int h;


   public double calculateVolume(){
      this.height = 12;
      this.lenght = 2;
      this.widht = 6;

      return (double) this.lenght * this.widht * this.height;
   }

   public int calculateSquare(){
      this.a = 5;
      this.b = 15;
      this.h = 20;

      return (int) 2*(this.a * this.b) + (this.a * this.h) + (this.b * this.h);

   }
   public int calculateVolumeGo(int lenght, int widht, int height) {

      return (int) lenght * widht * height;

   }


}

