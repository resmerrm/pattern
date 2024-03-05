package creational.prototype;

public abstract class Coffee implements Cloneable {
    public abstract void brew();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

