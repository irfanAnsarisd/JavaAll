package generics_examples;

// Define the generic class A
class A<T> {
    private T data;

    // Constructor that accepts a value of type T
    public A(T data) {
        this.data = data;
        System.out.println(data);
    }

    // Method to return the data
//    public T getData() {
//        return data;
//    }
//
//    // Method to set the data
//    public void setData(T data) {
//        this.data = data;
//    }
}

public class Test {
    public static void main(String[] args) {
        A<String> a1 = new A<>("abc");
//        System.out.println("String value: " + a1.getData());
        
        A<Integer> a2 = new A<>(100);
//        System.out.println("Integer value: " + a2.getData());
        
        A<Character> a3 = new A<>('a');
//        System.out.println("Character value: " + a3.getData());
    }
}
