public class Arrays20{
  public static int[] getRow(int[][] a, int i)
  {
    if (i<0 || i>=a.length) return null;
    int[] tmp = new int[a[i].length];
    for (int j=0; j<a[i].length; j++)
       tmp[j] = a[i][j];
  }
  public static void print2DIntArray(int[][])
  {
    for (int i=0; i<a.length; i++) {
      for (int j=0; j<a[i].length; j++)
         System.out.print(a[i][j]+ " ");
      System.out.println();
    }
  }
   public static void main(String[] args)
   {
     int[][] a = new int[10][5];
     for (int i = 0; i<a.length; i++)
        for (int j=0; j<a[1].length; j++)
          a[i][j] = i+j;
    print2DIntArray(a);

    int[][] b = 
    int[] tmp = getRow(a,2);
    for (int i = 0; i<tmp.length; i++)
       System.out.print(temp[i]+" ");
    System.out.println();
   }
}
