public class pilha
{
	public Object [] pilha;
	public int topo;
	
	public pilha(int x) 
	{
		this.topo = -1;
		this.pilha = new Object[x];
	}
	public boolean isEmpty() 
	{
		if (topo == -1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean isFull() 
	{
		if (pilha.length == topo + 1) 
		{
		return true;
		}
		return false;
	}
	public void Push(Object elemento) 
	{
		if (topo < pilha.length - 1) 
		{
			pilha[++topo] = elemento;
		}
	}
	public Object Pop() 
	{
		if(isEmpty()) 
		{
			return null;
		}
		return pilha[topo--];
	}
	public boolean verificaExpressao(char X) throws EmptyStackException
	{
		boolean valor = false;
		if (isEmpty() == true) 
		{
			Push(X);
			return false;
		}
		switch(topo) 
		{
			case '+': if(X == '+'|| X == '-') 
					  {
					  	valor = true;
					  }
					  break;
			case '-': if(X == '+' || X == '-') 
					  {
						valor = true;
					  }
						break;
			case '*' : if(X == '+'|| X == '-' || X == '*' || X == '/') 
						{
							valor = true;
						}
						break;
			case '/' : if(X == '+' || X == '-' || X == '*' || X == '/') 
						{
					 		valor = true;
						}
						break;
		}
		return valor;
	}
}

	
