public class ViolacaoResponsabilidadeUnica {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(1000);
        ImpressoraFatura impressora = new ImpressoraFatura();
        SalvadorBancoDados salvador = new SalvadorBancoDados();
        
        impressora.imprimirFatura(fatura);
        salvador.salvarNoBancoDados(fatura);
    }
}

class Fatura {
    private final double valor;

    public Fatura(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

class ImpressoraFatura {
    public void imprimirFatura(Fatura fatura) {
        System.out.println("Valor da fatura: " + fatura.getValor());
    }
}

class SalvadorBancoDados {
    public void salvarNoBancoDados(Fatura fatura) {
        System.out.println("Salvando fatura no banco de dados...");
    }
}
