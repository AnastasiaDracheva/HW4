//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Figure myTriangleOne = new Figure();
        Figure myTriangle = new Figure();

        myTriangleOne.height = 7;
        myTriangleOne.widht = 14;
        myTriangleOne.lenght = 21;

        System.out.println("My triangle one height = " + myTriangleOne.height);
        System.out.println("My triangle one lenght = " + myTriangleOne.lenght );
        System.out.println("My triangle one widht = " + myTriangleOne.widht );

        System.out.println("Triangle  V = " + myTriangle.calculateVolume ());
        System.out.println("Triangle  S =  " + myTriangle.calculateSquare());

        System.out.println("My Triangle One V = " + myTriangleOne.calculateVolumeGo(7,14,21));

    }




}
