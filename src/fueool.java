
import java.util.Scanner;

public class fueool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double effucency = 0;
        double price = 0;
        double priceTotal = 0;
        double distance = 0;
        String trash = "";

        System.out.println("how many gallons do you have?");
        if(in.hasNextDouble()){
            gallons = in.nextDouble();

            System.out.println("how much does it cost per gallon");
            if(in.hasNextDouble()){
                price = in.nextDouble();
                System.out.println("what about miles per gallon?");

                if(in.hasNextDouble()) {
                    effucency = in.nextDouble();
                    System.out.println("you can travel " + gallons * effucency);
                    System.out.println("the cost for 100 miles is " + (100/effucency)*price);



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
        else{

            trash = in.nextLine();
            in.nextLine();
            System.out.println("you gave me trash: "+trash);
            System.exit(0);

        }

    }








}
