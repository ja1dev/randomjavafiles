public class Gas{
  public static void main(String[] args){
    double cost;
    System.out.print("Enter cost of gallon of gas: ");
    cost = IO.readDouble();

    double number;
    System.out.print("Enter number of gallons: ");
    number = IO.readDouble();

    if (cost < 0){
       IO.reportBadInput();
    }

    if (number < 0){
       IO.reportBadInput();
    }


    boolean credit;
    System.out.print("Is customer paying with a credit card? ");
    credit = IO.readBoolean();

    if (credit = true){
       IO.outputDoubleAnswer(1.10*(cost*number));
    }

    else{
       IO.outputDoubleAnswer(cost*number);
    }




}
}
