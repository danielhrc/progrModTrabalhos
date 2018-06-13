package exercicio2;

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class Logger {
	private static Logger logger;
	private static FileWriter escritorDoArquivo;
	private static FileReader leitorDoArquivo;
	private static BufferedReader bufferArquivo;
	private static PrintWriter imprimeArquivo;
	
	public static Logger getInstance() throws IOException {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}

	private Logger() throws IOException {
		bufferArquivo = new BufferedReader(leitorDoArquivo);
		imprimeArquivo = new PrintWriter(escritorDoArquivo);
		escritorDoArquivo = new FileWriter("log.txt", true);
		leitorDoArquivo = new FileReader("log.txt");

	}

	public void getTextoASerLido() throws IOException {
		String textoASerLido = "Leitura do arquivo:";
		while (textoASerLido != null) {
			System.out.printf("%s\n", textoASerLido);
			textoASerLido = bufferArquivo.readLine();
		}
	}


	public static void log(String textoLido) throws IOException {
		imprimeArquivo.println(textoLido);
		escritorDoArquivo.flush();
		escritorDoArquivo.close();
	}
    
	
    public static void main(String args[]) throws IOException{
    	String salva;
		Scanner scanner = new Scanner(System.in);
		Logger apanhadorDeTexto = Logger.getInstance();
		System.out.println("Digite e tecle Enter: \n");
		Arquivo a = new Arquivo();
		Console c = new Console();
        salva = scanner.nextLine();
        apanhadorDeTexto.getTextoASerLido();
        a.registrador(salva);
        c.registrador(salva);
        
        scanner.close();
        
    }
}
