import java.util.Scanner;

public class flipswap {
static String str;
  static int cash, n, a, b;
  static void swapf ()
  {
    char s[] = str.toCharArray ();
    int i = 0;
    for (int a = 0; a < s.length; a++)
      if (s[a] == '1')
	{
	  i = a;
	  break;
	}
    int j = s.length - 1;
    while (j > i)
      {
	if (cash < a)
	  break;
	if (s[j] == '0')
	  {
	    if (s[i] == '0')
	      i++;
	    else
	      {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		cash -= a;
		j--;
	      }
	  }
	else
	  j--;
      }
    str = new String (s);
  }
  static void flipf ()
  {
    char s[] = str.toCharArray ();
    int i = 0;

    for (int a = 0; a < s.length; a++)
      if (s[a] == '1')
	{
	  i = a;
	  break;
	}
    while (cash >= b)
      {
	if (i == s.length)
	  break;
	if (s[i] == '1')
	  {
	    s[i] = '0';
	    i++;
	    cash -= b;
	  }
      }
    str = new String (s);
  }

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    n = sc.nextInt ();//NUMBER OF STRINGS
    str = sc.next ();// INPUT STRING IN BINARY
    cash = sc.nextInt ();//CASH TOTAL
    a = sc.nextInt ();//COST TO SWAP TWO CHARACTER
    b = sc.nextInt ();//COST TO FLIP TWO CHARACTER

    if (a < b)
      {
	swapf ();
	flipf ();
      }
    else
      {
	flipf ();
	swapf ();
      }
    System.out.println (Integer.parseInt (str, 2));
  }
}
