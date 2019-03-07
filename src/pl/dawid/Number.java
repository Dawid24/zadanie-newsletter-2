package pl.dawid;

public class Number {
    private String value;
    private String index;

    public Number() {}

    public Number(String value, String index) {
        this.value = value;
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Number{" +
                "value='" + value + '\'' +
                ", index='" + index + '\'' +
                '}';
    }
}