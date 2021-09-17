public class Zoo{
  public static void main(String[] args){
      IO io;
    int n;
    int total_giraffes = 0;
    int total_lion = 0;
    int total_snakes = 0;

    System.out.print("Enter number of Zoos: ");
    n = IO.readInt();

    while (n > 0){
      int giraffe;
      System.out.print("Enter number of giraffes for zoo " + n + ": ");
      giraffe = IO.readInt();
      total_giraffes = total_giraffes + giraffe;

      int lion;
      System.out.print("Enter number of lions for zoo " + n + ": ");
      lion = IO.readInt();
      total_lion = total_lion + lion;

      int snake;
      System.out.print("Enter number of snakes for zoo " + n + ": ");
      snake = IO.readInt();
      total_snakes = total_snakes + snake;

      n--;

    }
    IO.outputIntAnswer(total_giraffes);
    IO.outputIntAnswer(total_lion);
    IO.outputIntAnswer(total_snakes);
  }
}
