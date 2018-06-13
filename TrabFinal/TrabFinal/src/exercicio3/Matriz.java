package exercicio3;
public class Matriz {
        private double[][] entrada;
        private int linha, coluna;

        public Matriz(double[][] entrada) {
                this.setEntrada(entrada);
                this.setLinha(entrada.length);
                this.setColuna(entrada[0].length);
        }

        public Matriz mais(Matriz l, Matriz r) {
                Matriz soma = new Matriz(new double[l.getLinha()][l.getColuna()]);
                for(int i = 0; i<l.getColuna(); i++){
                        for(int j = 0; j<l.getLinha(); j++){
                                soma.setValor(i,j, (l.getValor(i, j) + r.getValor(i,j)));
                        }
                }
                return soma;
        }

        public Matriz menos(Matriz l, Matriz r){
                Matriz subtracao = new Matriz(new double[l.getLinha()][l.getColuna()]);
                for(int i = 0; i<l.getColuna(); i++){
                        for(int j = 0; j<l.getLinha(); j++){
                                subtracao.setValor(i,j, (l.getValor(i, j) - r.getValor(i,j)));
                        }
                }
                return subtracao;
        }

        public void setValor(int i, int j, double valor){
                this.entrada[i][j] = valor;
        }

        public double getValor(int i, int j){
                return this.entrada[i][j];
        }

        public void setEntrada(double[][] entrada) {
                this.entrada = entrada;
        }

        public int getLinha() {
                return linha;
        }

        public void setLinha(int linha) {
                this.linha = linha;
        }

        public int getColuna() {
                return coluna;
        }

        public void setColuna(int coluna) {
                this.coluna = coluna;
        }
}