public class LiskovSubstitutionViolation {
    public static void main(String[] args) {
        Flying sparrow = new Sparrow();
        sparrow.fly();

        Ostrich ostrich = new Ostrich();
        ostrich.run();
    }
}

class Bird {
}

interface Flying {
    void fly();
}

class Sparrow extends Bird implements Flying {
    @Override
    public void fly() {
        System.out.println("O pardal está voando");
    }
}

class Ostrich extends Bird {
    public void run() {
        System.out.println("O avestruz está correndo");
    }
}