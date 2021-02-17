package Typical;


public class Maping {
	
	interface Calculatefunction
	{
		int calculate(int a,int b);
		static void printResult(int a, int b,String function, Calculatefunction fobj)
		{
		System.out.println("result of " +function+ " is " +fobj.calculate(a,b));
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maping.Calculatefunction mul=(int a,int b) -> a+b;
		
		Calculatefunction divide=(x,y)->x/y;
		Calculatefunction add=Integer::sum;
		Calculatefunction sub=(x,y)->x-y;
		
	
		
		System.out.println("multipliaction is " +mul. calculate( 6, 8));
		System.out.println("divison is " +divide. calculate( 6, 8));
		System.out.println(" addition is " +add. calculate( 6, 8));
		System.out.println("subration is " +sub. calculate( 6, 8));
		
		System.out.println();
		
		Calculatefunction.printResult(6, 5, "Addition", add);
		Calculatefunction.printResult(6, 5, "Subraction", sub);
		Calculatefunction.printResult(6, 5, "Multipication", mul);
		Calculatefunction.printResult(6, 5, "Divison", divide);
		
		
		
	}

	

}
