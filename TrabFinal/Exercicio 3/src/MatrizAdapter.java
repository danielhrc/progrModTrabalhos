public class MatrizAdapter extends Matriz implements InterfaceMatriz {
    public MatrizAdapter(double[][] entrada) {
        super(entrada);
    }

    @Override
    public Matriz somar(Matriz l, Matriz r) {
        Matriz m = new Matriz(new double[1][1]);
        return m.mais(l,r);
    }

    @Override
    public Matriz subtrair(Matriz l, Matriz r) {
        Matriz m = new Matriz(new double[1][1]);
        return m.menos(l,r);
    }
}
