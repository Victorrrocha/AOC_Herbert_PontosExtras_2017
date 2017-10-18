import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		decode dec = new decode();
		
		switch(N)
		{
		case 000000:
			System.out.println("INSTRU��O TIPO R\n");
			dec.buscaInstru��o();
			dec.decodifica��o();
			dec.execu��o();
			dec.Termino();
			break;
			
		case 000100:
			System.out.println("INSTRU��O DE DESVIO CONDICIONAL\n");
			dec.buscaInstru��o();
			dec.decodifica��o();
			dec.terminoDesvioCondicional();
			break;
			
		case 000101:
			System.out.println("INSTRU��O DE DESVIO INCONDICIONAL\n");
			dec.buscaInstru��o();
			dec.decodifica��o();
			dec.terminoDesvioIncondicional();
			break;
			
		case 100011:
			System.out.println("INSTRU��O DE TIPO i - LOAD\n");
			dec.buscaInstru��o();
			dec.decodifica��o();
			dec.calculoEndere�oMemoria();
			dec.acessoMemoriaLW();
			dec.passoEscrita();
			break;
			
		case 101011:
			System.out.println("INSTRU��O DE TIPO i - STORE\n");
			dec.buscaInstru��o();
			dec.decodifica��o();
			dec.calculoEndere�oMemoria();
			dec.acessoMemoriaSW();
			break;
			
		default:
			System.out.println("Numero Inv�lido");
		}
	}
}
