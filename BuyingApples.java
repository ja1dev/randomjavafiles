public class BuyingApples{
  public static void main(String[] args){
    double cost;
    System.out.print("Enter cost per LB: ");
    cost = IO.readDouble();

    double pounds;
    System.out.print("Enter number of pounds: ");
    pounds = IO.readDouble();

    if (cost < 0){
      IO.reportBadInput();
    }

    if (pounds < 0){
      IO.reportBadInput();
    }

    if (cost >= 0 && pounds >= 0){
      IO.outputDoubleAnswer(cost*pounds);
    }

  }
}
