import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempF = 0;
        double tempC = 0;
        String trash = "";

        System.out.println("Give me temp in C");

        if(in.hasNextDouble()){

            tempC = in.nextDouble();
            tempF = (tempC * 9/5) + 32;
            System.out.println("Temp converted: "+tempF);

        }
        else{

            trash = in.nextLine();
            in.nextLine();
            System.out.println("you gave me trash: "+trash);
            System.exit(0);

        }

    }
}