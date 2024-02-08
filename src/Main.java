//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Figure myTriangleOne = new Figure();
        Figure myTriangleTwo = new Figure();
        Figure myTriangleThree = new Figure();
        Figure myTriangleFour = new Figure();

        myTriangleTwo.height = 12;
        myTriangleTwo.widht = 6;
        myTriangleTwo.lenght = 6;



        System.out.println(myTriangleOne);

        System.out.println("My triangle two height = " + myTriangleTwo.height );
        System.out.println("My triangle two lenght = " + myTriangleTwo.lenght );
        System.out.println("My triangle two widht = " + myTriangleTwo.widht );

        System.out.println("Triangle three V = " + myTriangleThree.calculateVolume ());

        System.out.print("Triangle four S =  " + myTriangleFour.calculateSquare());


    }


}