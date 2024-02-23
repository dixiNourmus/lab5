import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double miles = 0;
        double feet = 0;
        double inches = 0;
        double meters = 0;
        String trash = "";

        System.out.println("how many meters");
        if (in.hasNextDouble()){
            meters = in.nextDouble();
            miles = meters / 1609;
            feet = meters * 3.281;
            inches = meters * 39.37;
            System.out.println("you have " +miles + " miles");
            System.out.println("you have " +feet + " feet");
            System.out.println("you have " +inches + " inches");


        }
        else{

            trash = in.nextLine();
            in.nextLine();
            System.out.println("you gave me trash: "+trash);
            System.exit(0);

        }

    }








}

