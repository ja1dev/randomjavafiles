public class MyPayment {
  public static double calculatePayment(double principle, double rate, int payments){
      return principle*((rate*Math.pow(1+rate,payments))/(Math.pow(1+rate, payments)-1));
  }
  public static void main(String[] args){
      IO.outputStringAnswer("Please enter Principle: ");
      double principle = IO.readDouble();
      IO.outputStringAnswer("Please enter yearly rate as a decimal (eg. 4.5% is 0.045): ");
      double rate = IO.readDouble();
      IO.outputStringAnswer("Please enter total payments (eg. 60 for 5 year loan): ");
      int payments = IO.readInt();
      double myPayment = calculatePayment(principle, rate/12, payments);
      IO.outputDoubleAnswer(myPayment);
  }
}
