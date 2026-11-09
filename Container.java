public class Container<T> {
    //Generics 
/*Generics are used in the case for container classes to eliminate the need for casting and the potential for ClassCastException at runtime. */

    private T thing;

    
    public void set(T thing){
        this.thing = thing;
    }

    public T get(){
        return thing;
    }
}

