import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        String trash = "";

        System.out.println("what is the length");
        if (in.hasNextDouble()){
            side1 = in.nextDouble();
            System.out.println("what is the width");
            if (in.hasNextDouble()){
                side2 = in.nextDouble();
                System.out.println("the area is "+ side1 * side2);
                System.out.println("the perimeter is " + (side1+side1+side2+side2));
                side3 = Math.sqrt((side1*side1)+(side2*side2));
                System.out.println("the diagonal is " + side3);
            }
            else{

                trash = in.nextLine();
                in.nextLine();
                System.out.println("you gave me trash: "+trash);
                System.exit(0);

            }

        }
        else{

            trash = in.nextLine();
            in.nextLine();
            System.out.println("you gave me trash: "+trash);
            System.exit(0);

        }




    }
}
