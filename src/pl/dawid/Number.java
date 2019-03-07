package pl.dawid;

public class Number {
    private Integer value;
    private int index;

    public Number() {}

    public Number(Integer value, int index) {
        this.value = value;
        this.index = index;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
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
