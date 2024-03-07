public class Bird {
    private String name;
    private String nameLatin;
    private int observations;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
    }

    public String getName() {
        return name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }
}
