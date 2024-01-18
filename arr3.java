public class arr3 {
  public static void main(String[] arg) {
    int[][] a = new int[3][];
    for (int i = 0; i < a.length; i++)
      a[i] = new int[3];
    a[0][0] = 12;
    System.out.print(a[0][0]);

  }
}
