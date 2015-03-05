package by.bsu.template;

/**
 * Created by A.Aplevich on 05.03.2015.
 */
public class Message<T> {
    private T value;

    public Message() {
    }

    public Message(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == null) {
            return null;
        }
        return value.getClass().getName() + " : " + value;
    }
}
