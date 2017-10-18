
public class decode {
	
	public void buscaInstrução()
	{
		System.out.println("LerMem\nULAFonteA = 0\nlouD = 0\nIREsc\nULAFonteB = 01\nNULAOp = 00\nPCEsc\nFontePC = 00\n");
	}
	public void decodificação()
	{
		System.out.println("ULAFonteA = 0\nULAFonteB = 11\nULAOP = 00\n");
	}
	
	public void execução()
	{
		System.out.println("ULAFonteA = 1\nULAFonteB = 00\nULAOp = 10\n");
	}
	
	public void terminoDesvioCondicional()
	{
		System.out.println("ULAFonteA = 1\nULAFonteB = 00\nULAOp = 01\nPCEscCond\nFontePC = 01\n");
	}
	
	public void terminoDesvioIncondicional()
	{
		System.out.println("PCEsc\nFontePC = 10\n");
	}
	
	public void calculoEndereçoMemoria()
	{
		System.out.println("ULAFonteA = 1\nULAFonteB = 10\nULAOp = 00\n");
	}
	public void acessoMemoriaLW()
	{
		System.out.println("LerMem\nlouD = 1\n");
	}
	
	public void Termino()
	{
		System.out.println("RegDst = 1\nEscReg\nMemParaReg = 0\n");
	}
	
	public void acessoMemoriaSW()
	{
		System.out.println("EscMem\nlouD = 1\n");
	}
	public void passoEscrita()
	{
		System.out.println("RedDst = 0\nEscReg\nMemParaReg = 1\n");
	}
}
