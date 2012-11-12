import java.util.Random;

public class air
{

	public static int[][] arr = new int[27][6];
	public static int num;
	public static int i;
	public static int all;
	public static int k;
	public static int guy;
	public static int col;
	public static int row;
	public static int i_am_tired;
	public static boolean full1;
	public static boolean full2;
	public static boolean full3;
 
	public static void make_me_board(int guy)
	{

		if(guy!=1 && guy!=2 && guy!=3)
		{
			System.out.print("People overflow.. Try again!");
			System.out.print("\n");
		}
		   else
		   {
				switch(guy)
				{
				case 1:
					 if(col == 5)
					 {
						 row++;
					 }
				while(arr[row][col]!=0)
				{
					  col++;
				}
				arr[row][col] = 1;
				break;

				case 2:
				if(full2)
					break;
				while(arr[row][col]!=0 || arr[row][col+1]!=0)
				{
						 col++;
					  if(col == 5)
					  {
						  row++;
						  col = 0;
					  }
					  if(col == 2)
					  {
						  col +=1;
					  }
				}
					 if(full2)
						 break;
				arr[row][col] = 1;
				arr[row][col+1] = 1;
				break;

				case 3:
					if(full3)
						break;
				while(arr[row][col]!=0 || arr[row][col+1]!=0 || arr[row][col+2]!=0)
				{
							 col++;
						 if(col == 5 || col == 4)
						 {
							 row++;
							 col = 0;
						 }
						 if(col == 1)
						 {
							 col +=2;
						 }
						 if(col == 2)
						 {
							 col +=1;
						 }
				}
			   if(full3)
				   break;
				arr[row][col] = 1;
				arr[row][col+1] = 1;
				arr[row][col+2] = 1;
				break;

				}
		System.out.print("    A B C  D E F");
		for(int i = 0;i<=26;i++)
		{
		System.out.print("\n");
		System.out.print(i);
		System.out.print("/ ");
		if(i<=9)
		{
			System.out.print(" ");
		}
		for(int k = 0;k<=5;k++)
		{
		System.out.print(arr[i][k]);
		System.out.print(" ");
		if(k == 2)
		{
			System.out.print(" ");
		}
		}
		}
	  System.out.print("\n");
		   }
	}

	public static int Main()
	{
		all = 0;
		i = 0;
		col = 0;
		row = 0;
		full1 = false;
		full2 = false;
		full3 = false;
	  do
	  {
	  int num = new Random() % 3 +1;
	  System.out.print(num);
	  System.out.print("\n");
	  System.in.read();
	  if(num == 2 || num == 3)
	  {
		  while(arr[26][3]!=0 || arr[26][3]!=0 || arr[26][4]!=0 || arr[26][5]!=0)
		  {
			  System.out.print("No more space for 2 or 3!");
			  System.out.print("\n");
			  full2 = true;
			  full3 = true;
			  break;
		  }
	  }
	  if(num == 1 && !full1)
	  {
		  all += 1;
	  }
	  if(num == 2 && !full2)
	  {
		  all += 2;
	  }
	  if(num == 3 && !full3)
	  {
		  all += 3;
	  }
	  col = 0;
	  row = 0;
	  MainClass.make_me_board(num);
	  if(all == 162)
		  break;
	  } while(!full1 || !full2 || !full3);
	  return 0;
	}
}