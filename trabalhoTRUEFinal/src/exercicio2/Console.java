package exercicio2;

import java.io.IOException;

public class Console implements Salvavel {

	@Override
	public void registrador(String salvar) throws IOException {
		System.out.println(salvar);
	}

}
