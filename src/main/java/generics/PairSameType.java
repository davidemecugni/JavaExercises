package generics;

public class PairSameType<T>{
    private T first;
    private T second;

    public PairSameType(T key, T value) {
        this.first = key;
        this.second = value;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T key) {
        this.first = key;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T value) {
        this.second = value;
    }

    public void swap(){
        T tmp = getFirst();
        setFirst(getSecond());
        setSecond(tmp);
    }
}
