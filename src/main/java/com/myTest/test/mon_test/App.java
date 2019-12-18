package com.myTest.test.mon_test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public int maxi(int x, int y) {
		
		if(x>y) 
			{return x;}
		if (x<y)
			{return y;}
		return x;
	}
	
	
	/*
	 * 1   	Le programme récursif
			C'est le plus facile, il n'y a qu'à ècrire la définition mathématique, java fait le reste:*/
	public int fact (int n) {
        if (n==0) return(1);
        else return(n*fact(n-1));
    }

	/*2   Le programme itératif
	C'est à peine plus dur; on se donne une variable dans laquelle on accumule le résultat des multiplications jusqu'au résultat final:*/



    public static int fact1 (int n) {
        int f = 1;
        for (int i=1; i<=n; i++)
        f=f*i;
        return(f);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
