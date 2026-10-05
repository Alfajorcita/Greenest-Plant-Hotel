public class Main {
    public static void main(String[] args) {

        Palm laura = new Palm("Laura", 5.0);

        double liquidAmount = laura.calculateLiquidAmount();

        LiquidType liquidType = laura.getLiquidType();


        System.out.println("Plant: " + laura.getName());
        System.out.println("Liquid amount: " + liquidAmount);
        System.out.println("Liquid Type: " + liquidType);

    }
}