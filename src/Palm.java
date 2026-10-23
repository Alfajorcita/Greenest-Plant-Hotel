public class Palm extends Plant { // Arv: ex. Palm ärver från Plant.
    private static final double DAILY_WATER_AMOUNT_PALM= 0.5;

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        return DAILY_WATER_AMOUNT_PALM * getHeight();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

    @Override
    public PlantType getPlantType() {
        return PlantType.PALM;
    }
}
