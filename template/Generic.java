package template;

public class Generic<T> {
    T array[];
    T e;
    
    public Generic(T myArray[]) {
        array = myArray;
    }
    
    public Generic(T e) {
        this.e = e;
    }
    
    public T getE() { return e;}
    
    public T[] getArray() {return array;}
}