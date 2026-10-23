public enum PlantType {
    PALM("Palm"),
    CACTUS("Kaktus"),
    CARNIVOROUS("Kötantande");

    PlantType(String type) {
        this.type = type;
    }
    private final String type;

    @Override
    public String toString() {
        return this.type;
    }

}
