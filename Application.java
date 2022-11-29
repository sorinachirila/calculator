public class Application {
  public static void main(String[] args){
    Calculator calculator = new Calculator();
    System.out.println(calculator.addition(1, 2)); // Should be 3
    System.out.println(calculator.addition(1.5, 3.2)); // Should be 4.7
  }
}
