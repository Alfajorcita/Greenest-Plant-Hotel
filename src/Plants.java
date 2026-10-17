public abstract class Plants implements LiquidRequirement {

    protected String name;
    protected double height;
    protected String plantType;

    public Plants(String name, double height, String plantType) {
        this.name = name;
        this.height = height;
        this.plantType= plantType;
    }

    public abstract LiquidType getLiquidType();

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getPlantType() {
        return plantType;
    }
}


