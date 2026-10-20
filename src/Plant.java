public abstract class Plant implements LiquidRequirement {

    protected String name;
    protected double height;

    public Plant(String name, double height ) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public abstract LiquidType getLiquidType();

    public abstract PlantType getPlantType();
}


