public class CarnivorousPlant extends Plants {
    private static final double DAILY_WATER_AMOUNT_CARNIVOROUS = 0.1;
    private static final double DOUBLE= 0.2;

    public CarnivorousPlant(String name, double height, String plantType) {
        super(name, height, plantType);
    }

    @Override
    public double calculateLiquid() {
        double liquidAmount = DAILY_WATER_AMOUNT_CARNIVOROUS + (DOUBLE * height);
        return liquidAmount;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }


}

