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


        }
        else{

            trash = in.nextLine();
            in.nextLine();
            System.out.println("you gave me trash: "+trash);
            System.exit(0);

        }

    }








}

