package exercicio2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo implements Salvavel{
	
	public void registrador(String salvar) throws IOException {
		PrintWriter escritor = new PrintWriter(new FileWriter("log.txt"));
		escritor.print(salvar);
		escritor.close();
	}

}
