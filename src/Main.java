import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o Nº de caracteres da operação"));
		pilha p = new pilha(n);
		String expressao = JOptionPane.showInputDialog("Insira a expressão:");
		char Exp [] = expressao.toCharArray();
		Object posfixo[] = new Object [n];
		Object aux;
		boolean verifica;
		for(int CTA = 0; CTA<n-1; CTA++) 
		{
			if(Exp[CTA] == '+') 
			{
				try 
				{
					verifica = p.verificaExpressao(Exp[CTA]);
					if(verifica) 
					{
						aux = p.Pop();
						posfixo[CTA] = aux;
						p.Push(Exp[CTA]);
					}
					else 
					{
						p.Push(Exp[CTA]);
					}
				}
				catch (EmptyStackException e) 
				{
					e.printStackTrace();
				}
			}
			else if (Exp[CTA] == '-') 
			{
				try 
				{
					verifica = p.verificaExpressao(Exp[CTA]);
					if(verifica) 
					{
						aux = p.Pop();
						posfixo[CTA] = aux;
						p.Push(Exp[CTA]);
					}
					else 
					{
						p.Push(Exp[CTA]);
					}
				}
				catch (EmptyStackException e) 
				{
					e.printStackTrace();
				}
			}
			else if(Exp[CTA] == '*') 
			{
				try 
				{
					verifica = p.verificaExpressao(Exp[CTA]);
					if(verifica) 
					{
						aux = p.Pop();
						posfixo[CTA] = aux;
						p.Push(Exp[CTA]);
					}
					else 
					{
						p.Push(Exp[CTA]);
					}
				}
				catch (EmptyStackException e) 
				{
					e.printStackTrace();
				}
			}
			else if(Exp[CTA] == '/') 
			{
				try 
				{
					verifica = p.verificaExpressao(Exp[CTA]);
					if(verifica) 
					{
						aux = p.Pop();
						posfixo[CTA] = aux;
						p.Push(Exp[CTA]);
					}
					else 
					{
						p.Push(Exp[CTA]);
					}
				}
				catch (EmptyStackException e) 
				{
					e.printStackTrace();
				}
			}
			else 
			{
				posfixo[CTA] = Exp[CTA];
			}
		}
		for(int X = 0; X<n; X++) 
		{ 
			System.out.print(posfixo[X]);
		}
	}
}
