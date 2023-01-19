import java.util.Scanner;

public class LeituraDaGertrudes {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int diasDeLeitura = paginas/paginasLidas;
        
        System.out.println(diasDeLeitura + "dias");
        
        
	}

}
