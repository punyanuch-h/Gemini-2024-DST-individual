import java.util.List;
// Test minicase4
public class Main {
    public static void main(String[] args) {
        Vehicle test = new Vehicle("001", "Toyota Camry", "model_test", 1989, "Toyota", 200000.00);
        test.printInfo();

        Vehicle test2 = new Vehicle("002", "Yaris", "model_test", 1999, "Toyota", 599000.00);
        test2.printInfo();
    }
}
