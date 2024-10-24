package ucu.edu.ua.flower_cont.flowers;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    GREEN("#008000"), WHITE("#FFFFFF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
