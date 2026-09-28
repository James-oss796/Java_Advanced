package generics.basics;
//this is a generic class
public class Box<T> {

    //this is a generic value,,, or it has a type generic,,, we do not know what to expect or what the value of the value would be
    private T value;

    public Box(T value) {
        this.value = value;
    }

    //this is a generic method
    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

}
