package juego;

public class Juego2048 
{
	int[][] tablero;
	
	
	/*constructor*/
	public Juego2048()
	{
		tablero= new int[4][4];
	}
	/*************/

	public void iniciar()
	{	
		for (int i = 0; i < tablero.length; i++) 
		{
			for (int j = 0; j < tablero[i].length; j++) 
			{
				tablero[i][j]=0;
			}
		}
		int rand1= (int) (Math.random()*4);	
		int rand2= (int) (Math.random()*4);
		int rand3= (int) (Math.random()*4);
		int rand4= (int) (Math.random()*4);
		int rand5= (int) (Math.random()*2);
		int k=2;
		if(rand5==0)
			k=4;
		tablero[rand1][rand2] = 2;
		tablero[rand3][rand4] = k;
		
	}
	
	public void mostrar() 
	{
		for (int x=0; x < tablero.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < tablero[x].length; y++) {
			    System.out.print (tablero[x][y]);
			    if (y!=tablero[x].length-1) 
			    	System.out.print("\t");
			  }
			  System.out.println("|");
			}
	}
	
	public void mover(char x)
	{
		moverDerecha(x);
		moverIzquierda(x);
		moverAbajo(x);
		moverArriba(x);
	}
	
	private void moverDerecha(char x)
	{
		if (x=='d')
		{
			for (int i = 0; i < tablero.length; i++) 
			{
				for (int j = 0; j < tablero[1].length; j++) 
				{
					if(tablero[i][j]!=0)
					{
						int k=tablero[i][j];
						tablero[i][j]=0;
						tablero[i][colVaciaDer(i, j)]=k;
					}
				}
			}
		}
	}
	
	private int colVaciaDer(int i, int j)
	{
		
		for (int k = tablero.length-1; k >=0 ; k--) 
		{
			if(i==k)
			{
				for (int k2 = tablero[i].length-1; k2 >=0 ; k2--) 
				{
					if(tablero[i][k2]==0)
						return k2;
				}
			}
		}
		return -1;
	}
	
	private void moverIzquierda(char x)
	{
		if (x=='a')
		{
			for (int i = 0; i < tablero.length; i++) 
			{
				for (int j = 0; j < tablero[1].length; j++) 
				{
					if(tablero[i][j]!=0)
					{
						int k=tablero[i][j];
						tablero[i][j]=0;
						tablero[i][colVaciaIzq(i, j)]=k;
					}
				}
			}
		}
	}
	
	private int colVaciaIzq(int i, int j)
	{
		
		for (int k = 0; k <tablero.length; k++) 
		{
			if(i==k)
			{
				for (int k2 =0; k2 < tablero[i].length ; k2++) 
				{
					if(tablero[i][k2]==0)
						return k2;
				}
			}
		}
		return -1;
	}

	private void moverAbajo(char x)
	{
		if (x=='s')
		{
			for (int i = tablero.length-1; i >=0 ; i--) 
			{
				for (int j = tablero[1].length-1; j >=0; j--) 
				{
					if(tablero[i][j]!=0)
					{
						int k=tablero[i][j];
						tablero[i][j]=0;
						tablero[filaVaciaAbajo(i, j)][j]=k;
					}
				}
			}
		}
	}
     
	private int filaVaciaAbajo(int i, int j)
	{
		for (int i2 = tablero.length-1; i2 >=0; i2--) 
		{
			for (int k = tablero[i2].length-1; k >=0 ; k--) 
			{
					if(k==j && tablero[i2][k]==0)
						return i2;
			}
		}
		return -1;
	}

	private void moverArriba(char x)
	{
		if (x=='w')
		{
			for (int i = 0; i <tablero.length ; i++) 
			{
				for (int j = 0; j < tablero[1].length; j++) 
				{
					if(tablero[i][j]!=0)
					{
						int k=tablero[i][j];
						tablero[i][j]=0;
						tablero[filaVaciaArriba(i,j)][j]=k;
					}
				}
			}
		}
	}
	
	private int filaVaciaArriba(int i,int j)
	{
		for (int i2 = 0; i2 <tablero.length; i2++) 
		{
			for (int k = 0; k < tablero.length ; k++) 
			{
					if(k==j && tablero[i2][k]==0)
						return i2;
			}
		}
		return -1;
	}

	
}












