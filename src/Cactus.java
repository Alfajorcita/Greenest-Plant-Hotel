public class Cactus extends Plant { // Arv: Cactus ärver egenskaper och metoder från Plant.
    private static final double DAILY_WATER_AMOUNT_CACTUS = 0.02;

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        return DAILY_WATER_AMOUNT_CACTUS;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

    @Override
    public PlantType getPlantType() {
        return PlantType.CACTUS;
    }
}
