public class AppendRec{
  public static void main(String[] args){
    String a = appendNTimes("CS111",11);
    System.out.println(a);
    System.out.println();
    a = appendNTimes("is the best!",11);
    System.out.println(a);
  }
  public static String appendNTimes( String original, int n ){
    if(n<=0){
      return original;
    }
    else{
      return original + appendNTimes(original,n-1);
    }
  }
}
