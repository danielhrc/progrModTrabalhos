package factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Logger {
    private static Logger myObj;
    private static FileWriter arquivo;
    private static PrintWriter gravarArquivo;
    private static FileReader arq;
    private static BufferedReader lerArq;

    Logger() throws IOException{
    	arquivo = new FileWriter("log.txt",true);
        gravarArquivo = new PrintWriter(arquivo);
        arq = new FileReader("log.txt");
        lerArq = new BufferedReader(arq);
    }
    public static Logger getInstance() throws IOException{
        if(myObj == null){
            myObj = new Logger();
        }
        return myObj;
    }
    public static void log(String string) throws IOException {	
    	gravarArquivo.println(string);
    	arquivo.flush();
    	arquivo.close();
    }
    public void getSomething() throws IOException{
    	String linha = "Lendo o Arquivo";
    	while (linha != null){
            System.out.printf("%s\n",linha);
            linha = lerArq.readLine();
        }
    }
    
    public static void console(String string) throws IOException{
    	String linha = "Mostrando no console";
    	while (linha != null){
            System.out.printf("%s\n",linha);
            linha = lerArq.readLine();
            System.out.printf("%s\n",string);
        }
    }
    
    public static void main(String a[]) throws IOException{
    	Scanner scanner = new Scanner(System.in);
        Logger st = Logger.getInstance();
        String salvar;
        Factory factory = new Factory();
        System.out.println("Digite o que deseja salvar em arquivo");
        salvar = scanner.nextLine();
        factory.registraMensagem(salvar, true);
        st.getSomething();
        scanner.close();
    }
}
