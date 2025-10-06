package classTow;

public class Box<T> {
    //This is a generic class
    private T value;

    public Box(T value) {
        this.value = value;
    }



    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
