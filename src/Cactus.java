public class Cactus extends Plants {
    private static final double DAILY_WATER_AMOUNT_CACTUS = 0.02;

    public Cactus(String name, double height, String plantType) {
        super(name, height, plantType);
    }

    public double calculateLiquid() {
        return DAILY_WATER_AMOUNT_CACTUS;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

}
