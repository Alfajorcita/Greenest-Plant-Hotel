public abstract class Plants implements LiquidRequirement {

    protected String name;
    protected double height;

    public Plants(String name, double height ) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public abstract LiquidType getLiquidType();

    public abstract PlantType getPlantType();
}


