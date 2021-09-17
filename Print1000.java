public class Print1000 {
   public static void main(String[] args){
      int start = 1;
      for (int i=start; i<=1000+start-1;i=i++)
         if (i%2 == 1)
            IO.outputIntAnswer(i);
   }
}
