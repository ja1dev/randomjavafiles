public class SpeedingTickets {
  public static void main(String[] args){
    double x = IO.readDouble();
    System.out.print("Speed: ");

    if (x <= 60)
    {
      System.out.print("Fine: $0");
    }

    if (x > 60, x <= 75)
    {
      System.out.print("Fine: $100");
    }

    if (x > 75, x <= 90)
    {
      System.out.print("Fine: $200");
    }

    if (x > 90)
    {
      System.out.print("Fine: $500");
    }
  }
}
