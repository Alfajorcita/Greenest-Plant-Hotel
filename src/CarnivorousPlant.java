public class CarnivorousPlant extends Plant { // Arv: Carnivorous ärver egenskaper och metoder från Plant.
    private static final double DAILY_WATER_AMOUNT_CARNIVOROUS = 0.1;
    private static final double LIQUID_PER_METER = 0.2;

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquid() {
        double liquidAmount = DAILY_WATER_AMOUNT_CARNIVOROUS + (LIQUID_PER_METER * height);
        return liquidAmount;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }

    @Override
    public PlantType getPlantType() {
        return PlantType.CARNIVOROUS;

    }
}

