public class AbertoFechadoCorreto {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        Desconto descontoVIP = new DescontoVIP();
        Desconto descontoRegular = new DescontoRegular();

        System.out.println("Desconto VIP: " + calculadora.calcularDesconto(descontoVIP, 200));
        System.out.println("Desconto Regular: " + calculadora.calcularDesconto(descontoRegular, 200));
    }
}

interface Desconto {
    double calcular(double valor);
}

class DescontoVIP implements Desconto {
    public double calcular(double valor) {
        return valor * 0.2;
    }
}

class DescontoRegular implements Desconto {
    public double calcular(double valor) {
        return valor * 0.1;
    }
}

class CalculadoraDesconto {
    public double calcularDesconto(Desconto desconto, double valor) {
        return desconto.calcular(valor);
    }
}
