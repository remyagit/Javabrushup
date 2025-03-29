package interviewReview;

public class Basics extends BaseParent implements basicInterface {
	
	/**
	 * This class uses most of the java concepts . Easy for brushup and interview prep
	 * 
	 */

     public Basics() {
    	 
    	 System.out.println("constructor called");
    	 System.out.println("*************************");
    	 
     }
	
	
	
	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Basics b = new Basics();
		
		b.reverseastring("aymeR");
		System.out.println("*************************");
		b.junkremoval();
		System.out.println("*************************");
	    int Sum = b.sumofarray();
	    System.out.println(Sum);
	    System.out.println("*************************");
	    b.minmaxOfArray();
	    System.out.println("*************************");
	    b.swapwithtemp();
	    System.out.println("*************************");
	    b.swapwithouttemp();
	    System.out.println("*************************");
	    b.pyramid();
	    System.out.println("*************************");
	    b.minmaxOfMultiarray();
	    System.out.println("*************************");
	    b.fibanocci();
	    System.out.println("*************************");
	    b.primeNumber(11);
	    
	    System.out.println("*************************");
	    b.findduplicatesanduniquenumber();
	    
	    System.out.println("*************************");
	    b.swapstring();
	    System.out.println("*************************");
	    b.stringmanipulation();
	    
	    System.out.println("*************************");
	    b.findDuplicateWords("I am counting string in a sentence in a ");
	}

	private int sumofarray() {
		int [] a = {-183,56,365,498,508};
		int Sum = 0;
		
		for (int i = 0;i<a.length;i++)
		{
			
			Sum = Sum + a[i];
			
		}
		return Sum;
	}

	private void junkremoval() {
		String s = "Hi(";
		s = s.replaceAll("[^a-z A-Z ]", "");
		System.out.println(s);
	}

	private void reverseastring(String s) {
		//String s = "I am reversed";
		int length = s.length();
		String rev = "";
		
		for ( int i=length-1;i>=0;i--)
		{
			
			rev = rev +s.charAt(i);
			
		}
		System.out.println(rev);
	}

	

	@Override
	public void swapwithtemp() {
		
		int a = 6;
		int b = 8;
		System.out.println("a is now "+ a +";b is now "+b);
		int temp ;
		temp = a;
		a = b ;
		b = temp;
		System.out.println("after swapping");
		System.out.println("a is now "+ a +";b is now "+b);
		
	
	}

	@Override
	public void swapwithouttemp() {
		
		int a = 9;
		int b = 2;
		System.out.println("a is now "+ a +";b is now "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swapping");
		System.out.println("a is now "+ a +";b is now "+b);
		
	}

	@Override
	public void pyramid() {
		
		for(int i=1;i<5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				System.out.print("\t");
			
			}
			System.out.println( );
		}
		
	}

	@Override
	public void fibanocci() {
		
		//0,1,1,2,3,5,8,13,....
		
		int a = 0;
		int b= 1;
		int fib = 0;
		
		for(int i=1;i<9;i++) {
			
			fib = a+b;
			a = b;
			b = fib;
			System.out.print(fib);
			System.out.print(" ");
		}
		
	}

	@Override
	public void primeNumber(int val) {
		boolean flag = false; ;
		//int val = 31;
		for(int i=2;i<val;i++)
		{
			
			if (val % i==0) {
				
				 flag = true;
				break;
			}
		}
		
		if(flag)
			System.out.println("not prime");
		else
			System.out.println("is prime");
	}

	@Override
	public void minmaxOfArray() {
		//max num in array
		int a[] = { 12,3674,1,5,24};
		int max = a[0];
		int min = a[0];
		for (int i=1; i<a.length ; i++)
		{
			
			if(a[i]>max)
				
				max = a[i];
			if(a[i]<min)
				
				min = a[i];
		}
	   System.out.println(max +" is max number");
	   System.out.println(min +" is min number");
	  
	}

	@Override
	public void minmaxOfMultiarray() {
		
		//this prints maximum number in the column of minimum number
		/**
		 * 
		 */
		int[][] abc = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {11, 8, 9}
			};
		
		int min=abc[0][0];
		int mincoloumn = 0;


		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		if(abc[i][j]<min)//2
		{
		min=abc[i][j];
		mincoloumn=j;
		}
		}
		}
		//=1
		int max=abc[0][mincoloumn];
		int k = 0;
		while(k<3)
		{
		if(abc[k][mincoloumn]>max)
		{
		max=abc[k][mincoloumn];
		}
		k++;
		}

		System.out.println(max);
		
		
	}

	public void swapstring() {
		
		String s1 = "Hello";
		String s2 = "World";
		
	    s1 = s1 + s2 ;  // helloworld-- length 10
	    s2 = s1.substring(0,s1.length()-s2.length()); //0,10-5--0,5--Hello
	    s1 = s1.substring(s2.length()); // helloworld--5--s1.substrin(5)---starts from 5th --world
	    
	    System.out.println("After swapping s1 = " + s1 + " s2 = "+ s2 );
		
		
		
	}
	
	public void stringmanipulation() {
		
		String s = "environment";
		String s2 = "atmosphere";
		s = s.substring(0,5);
		System.out.println(s);
		s2 = s2.substring(5);
		System.out.println(s2);
}
	
	
	public static void findDuplicateWords (String inputString) {
		
		String words[] = inputString.split(" ");
		
		
	}
	
}
