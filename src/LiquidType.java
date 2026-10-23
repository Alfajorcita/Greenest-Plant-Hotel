public enum LiquidType {
    TAP_WATER("Kranvatten"),
    MINERAL_WATER("Mineralvatten"),
    PROTEIN_DRINK("Proteindryck");

    private final String liquid;

    LiquidType(String liquid) {
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return this.liquid;
    }
}