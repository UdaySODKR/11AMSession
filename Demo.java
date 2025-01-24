public class Demo {
    public static void main(String[] args) {
         // Implicit Casting
        int i = 10;
        double d = i; // int to double
        
        System.out.println("Double value: " + d);  // Output: 10.0
        
        // Explicit Casting
        double e = 10.5;
        int f = (int) e;  // double to int
        
        System.out.println("Integer value: " + f);  // Output: 10
    }
}