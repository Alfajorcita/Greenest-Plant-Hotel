import java.util.Scanner;

public static void main(String[] args) {

    PlantHotel hotel = new PlantHotel();
    Scanner scanner = new Scanner(System.in);

    Menu.printWelcome();

    boolean running = true;

    while (running) {

        Menu.printMenu();

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    hotel.showPlants();
                    Menu.dividingLine();
                    break;

                case 2:
                    System.out.print("Vilken växt vill du ha info om?");

                    String input = scanner.nextLine();
                    Plants response = hotel.findByName(input);

                    if (response == null) {
                        System.out.println("Växten hittades inte.");
                        break;
                    } else {
                        Menu.dividingLine();
                        System.out.println("Hittad växt: " + response.getName());
                        System.out.println("Växtart: " + response.getPlantType());
                        System.out.println("Vätskebehovet: " + response.calculateLiquid() + " l");
                        System.out.println("Vätska: " + response.getLiquidType());
                        Menu.dividingLine();
                    }
                    break;

                case 3:
                    //System.out.println("Tack...");
                    running = false;
                    break;

                default:
                    System.out.println("Ogiltigt val. Välj 1, 2 eller 3.");
                    break;
            }

        } else {
            System.out.println("Ogiltig inmatning. Ange ett nummer.");
            scanner.nextLine();
        }
    }

    scanner.close();
}



/*import javax.swing.*;
i
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PlantHotel hotel = new PlantHotel();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("----Välkommen till Växthotellet Greenest----");

            System.out.println("Skriv vilken växt vill du ha info om: ");
            System.out.println("Tillgängliga växter: " + " ");
                    hotel.showPlants();

            String input = scanner.nextLine();
            Plants response = hotel.findByName(input);

            if (response != null) {
                System.out.println(response.getName());
                System.out.println(response.calculateLiquid());
                System.out.println(response.getLiquidType());

            } else {
                System.out.println("Vi har inte den här växten");
            }
            running = false;
            scanner.close();


            /*if (response.equalsIgnoreCase("Laura")) {
                System.out.println("Plant: " + PalmLaura.getName());
                System.out.println("Liquid amount: " + PalmLaura.calculateliquid());
                System.out.println("Liquid type: " + laura.getLiquidType());

            } else if (response.equalsIgnoreCase("Palm Olof")) {
                System.out.println("Plant: " + PalmOlof.getName());
            } else if (response.equalsIgnoreCase("Cactus Igge")) {
                System.out.println("Plant: " + Cactus.getName());
            } else if (response.equalsIgnoreCase("Meatloaf")) {
                System.out.println("Plant: " + CarnivorousPlant.getName());
            } else {
                System.out.println("Vi har inte den här växten");

            }

            running = false;
            scanner.close();

        }
    }*/



