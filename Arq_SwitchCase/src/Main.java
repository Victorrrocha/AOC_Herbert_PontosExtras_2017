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
			System.out.println("INSTRUÇÃO TIPO R\n");
			dec.buscaInstrução();
			dec.decodificação();
			dec.execução();
			dec.Termino();
			break;
			
		case 000100:
			System.out.println("INSTRUÇÃO DE DESVIO CONDICIONAL\n");
			dec.buscaInstrução();
			dec.decodificação();
			dec.terminoDesvioCondicional();
			break;
			
		case 000101:
			System.out.println("INSTRUÇÃO DE DESVIO INCONDICIONAL\n");
			dec.buscaInstrução();
			dec.decodificação();
			dec.terminoDesvioIncondicional();
			break;
			
		case 100011:
			System.out.println("INSTRUÇÃO DE TIPO i - LOAD\n");
			dec.buscaInstrução();
			dec.decodificação();
			dec.calculoEndereçoMemoria();
			dec.acessoMemoriaLW();
			dec.passoEscrita();
			break;
			
		case 101011:
			System.out.println("INSTRUÇÃO DE TIPO i - STORE\n");
			dec.buscaInstrução();
			dec.decodificação();
			dec.calculoEndereçoMemoria();
			dec.acessoMemoriaSW();
			break;
			
		default:
			System.out.println("Numero Inválido");
		}
	}
}
