package lesson30.addHomeTask.generics.addTask1;

public class Box <T>{

    private T item;

    public void putItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
