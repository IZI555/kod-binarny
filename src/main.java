import java.util.Scanner;
public class main 

{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		int wartosci[] = new  int [8];
		
		int j=128;
		for(int i = 0;i < wartosci.length; i++ )
		{
		  	wartosci[i]=j;
		  	j=j/2;
		}
			
			
			
		
		/*wartosci[0]=128;
		wartosci[1]=64;
		wartosci[2]=32;
		wartosci[3]=16;
		wartosci[4]=8;
		wartosci[5]=4;
		wartosci[6]=2;
		wartosci[7]=1;
		*/
		System.out.println("podaj dowolna liczbe do przezialu 0 do 255");
		int x = in.nextInt();
		if(x>255&&x<0)
		{
			System.out.println("liczba jest albo ujemna lub wieksza od liczby 255 ");
			
		}
		else
		{
			System.out.println("trwa konwersja liczby na binarna");
			String bin = "";
			for (int i=0; i < wartosci.length; i++  )
			{
			       if(x-wartosci[i]>=0)
			       {
				       x=x-wartosci[i];
				       bin+="1";
			       }
			               else
			              {
			            	bin+="0";
			              }
				
			}
			System.out.println(""+bin);
		}
		
	}
}
