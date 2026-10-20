import java.util.Scanner;

public static void main(String[] args) {

    PlantHotel hotel = new PlantHotel();
    Scanner scanner = new Scanner(System.in);

    ConsoleView.printWelcome();
    ConsoleView.dividingLine();

    while (true) {

        System.out.print("Vilken växt vill du ha info om?: ");
        String input = scanner.nextLine();

        // Polymorfism: Samma anrop, olika beteende.
        Plant response = hotel.findByName(input);

        if (response == null) {
            System.out.println("Växten hittades inte.");

        } else {
            ConsoleView.dividingLine();
            System.out.println("Hittad växt: " + response.getName());
            System.out.println("Växtart: " + response.getPlantType());
            System.out.println("Vätskebehovet: " + response.calculateLiquid() + " l");
            System.out.println("Vätska: " + response.getLiquidType());
            ConsoleView.dividingLine();
        }
    }
}

