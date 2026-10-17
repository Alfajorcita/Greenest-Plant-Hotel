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
                    System.out.println("Programmet avslutas...");
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


