package factory;

import java.io.IOException;

public class Factory extends Logger{
	
	Factory() throws IOException {
	}

	public void registraMensagem(String salvar, boolean gravar) throws IOException {
		
		if (gravar == true) {
			super.log(salvar);
			
		} else {
			super.console(salvar);
		}
		
	}

}
