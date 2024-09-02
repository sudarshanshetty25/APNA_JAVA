public class costoper {
    public static void main (String[]args)
  {

    int[] arr = { 2, 5, 3, 3 ,3 };

    int X = 2;
    int Y = 2;
    int ans = 0;

    for (int i = 0; i < arr.length; i++)
      {

	arr[i]--;

      }
    ans = ans + X;

    for (int i = 0; i < arr.length; i++)
      {
	if (arr[i] != 0)
	  {
	    arr[i] = 0;
	    ans = ans + Y;
	  }
      }
    System.out.println (ans);
  }
}
