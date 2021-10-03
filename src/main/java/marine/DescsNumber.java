package marine;

public enum DescsNumber {
    ONEDESC(1, "однопалубный"), TWODESC(2, "двухпалубный"), THREEDESC(3, "трехпалубный"), FOURDESC(4, "четырехпалубный");
    int descsCount;
    String description;

    DescsNumber(int descsCount, String description) {
        this.descsCount = descsCount;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
