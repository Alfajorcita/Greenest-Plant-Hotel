import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Vilken växt vill du ha info om?");
        Scanner scanner = new Scanner(System.in);
        Palm laura = new Palm("Laura", 5.0);

        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("Laura")) {
            System.out.println("Plant: " + laura.getName());
            System.out.println("Liquid amount: " + laura.calculateLiquidAmount());
            System.out.println("Liquid type: " + laura.getLiquidType());
        }
        else {
            System.out.println("Vi har itne den växten");
        }

    }
}