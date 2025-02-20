```java
public class DependencyInversionViolation {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);
        lightSwitch.turnOn();
    }
}

class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}

class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void turnOn() {
        bulb.turnOn();
    }

    public void turnOff() {
        bulb.turnOff();
    }
}

```
_PROBLEMAS_

1- classe LightBulb está com mais de uma função 

2- classe Switch está com sobreposição de métodos e mais de uma função

```java
public class GodClassViolation {
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}

class Application {
    public void run() {
        System.out.println("Running application...");
        authenticateUser();
        loadDashboard();
        processPayments();
        generateReports();
    }

    private void authenticateUser() {
        System.out.println("Authenticating user...");
    }

    private void loadDashboard() {
        System.out.println("Loading dashboard...");
    }

    private void processPayments() {
        System.out.println("Processing payments...");
    }

    private void generateReports() {
        System.out.println("Generating reports...");
    }
}
```
_PROBLEMAS_

1- classe está sobre carregada com muitas responsabilidade

2- muitas métodos sendo criados dentro de uma só classe

```java
public class HardCodedDependencies {
    public static void main(String[] args) {
        Report report = new Report();
        report.generatePDFReport();
    }
}

class Report {
    public void generatePDFReport() {
        System.out.println("Generating PDF Report...");
    }
}

```
_PROBLEMAS_

1- Classe sendo instanciada sem um construtor

2- classe com duas chamadas para execultar apenas uma ação

```java

public class ImproperExceptionHandling {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}

class Calculator {
    public void divide(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}

```

_PROBLEMAS_

No método "divide()" da classe Calculator o bloco trycatch captura a exceção "Exception e"
isso não é bom pois captura todas as exceções possíveis e isso não é necessario neste codigo, seria a mesma coisa que importar o java usando "*" em um codigo simples.
Outro ponto era que esta o "calculator.divide" ele estava divindo o 10 por 0.

```java
public class InterfaceSegregationViolation {
    public static void main(String[] args) {
        MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print();
        printer.scan();
        printer.fax();
    }
}

interface Machine {
    void print();
    void scan();
    void fax();
}

class MultiFunctionPrinter implements Machine {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void fax() {
        System.out.println("Faxing...");
    }
}

```

_PROBLEMAS_

A interface Machine faz com que todas as classes que a implementam a
fornecer métodos para imprimir, escanear e enviar fax, mesmo que nem todas as classes
necessitem dessas funcionalidades, essa forma de desing não é muito eficiente para as classes que possam
precisar implementar apenas uma ou duas dessas operações, resultando em métodos que não serão utilizados

```java
public class LiskovSubstitutionViolation {
    public static void main(String[] args) {
        Bird bird = new Ostrich();
        bird.fly();
    }
}

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}


```

_PROBLEMAS_

A classe "Ostrich" é uma subclasse de "Bird" mas "Ostrich" não pode voar. Sobrescrever
o método "fly()" para lançar uma exceção e quebrar o comportamento esperado de que todos os objetos
da classe "Bird" devem ser capazes de voar, so que isso viola o LSP ja que uma instância de "Ostrich" não
pode substituir uma instância de "Bird" sem causar outros erros

```java
public class OpenClosedViolation {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Discount: " + calculator.calculateDiscount("VIP", 200));
    }
}

class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1;
        } else if (customerType.equals("VIP")) {
            return amount * 0.2;
        } else {
            return 0;
        }
    }
}


```
_PROBLEMAS_

No codigo original, eu tinha uma unica classe chamada Invoice, que estava fazendo muitas coisas. Ela era responsavel por:
Armazenar os dados da fatura, ou seja, o valor da fatura. Imprimir a fatura atraves do metodo printInvoice(). Salvar a fatura no banco de dados atraves do metodo saveToDatabase()."

```java
public class SingleResponsibilityViolation {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);
        invoice.printInvoice();
        invoice.saveToDatabase();
    }
}

class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void printInvoice() {
        System.out.println("Invoice amount: " + amount);
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database...");
    }
}

```
_PROBLEMAS_

1- Eu percebi que o código violava o Princípio Aberto-Fechado (OCP) porque, para adicionar novos tipos de desconto, eu precisava modificar a classe DiscountCalculator, o que não é ideal.

2- Para corrigir isso, eu criei a interface Desconto, que define o cálculo do desconto, e então criei classes específicas para cada tipo de desconto, como DescontoVIP e DescontoRegular. Assim, a classe CalculadoraDesconto agora usa polimorfismo para calcular o desconto, e eu posso adicionar novos tipos de desconto sem precisar modificar a classe CalculadoraDesconto.

3- Agora, a classe CalculadoraDesconto está fechada para modificações, mas aberta para extensões, seguindo o OCP corretamente.

```java
public class TightCouplingViolation {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.start();
    }
}

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car is running");
    }
}


```

_Descrição do Problema_

O código apresentado demonstra uma violação do princípio de acoplamento apertado (Tight Coupling). A classe `Car` depende diretamente da classe `Engine`, o que torna difícil a manutenção e a extensibilidade do código. Se quisermos alterar a implementação do motor ou adicionar novos tipos de motores, teremos que modificar a classe `Car`, o que não é uma prática recomendada em design de software.

_Problemas Identificados_

1. Acoplamento Apertado: A classe `Car` está fortemente acoplada à classe `Engine`. Isso significa que qualquer mudança na classe `Engine` pode impactar diretamente a classe `Car`.
2. Dificuldade de Testes: Testar a classe `Car` isoladamente se torna complicado, pois ela depende de uma instância concreta de `Engine`.
3. Falta de Flexibilidade: Se quisermos usar diferentes tipos de motores (por exemplo, um motor elétrico ou um motor a combustão), teremos que modificar a classe `Car`.

```java
public class ViolationOfEncapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John Doe";
        person.age = 30;
        System.out.println(person.name + " is " + person.age + " years old.");
    }
}

class Person {
    public String name;
    public int age;
}


```

_Explicação das Mudanças_

1. Propriedades Privadas: 
   - As propriedades `name` e `age` agora são privadas, protegendo-as de acesso direto. Isso impede que outras classes modifiquem esses atributos sem passar pelos métodos apropriados.

2. Métodos Getters e Setters:
   - Getters: 
     - `getName()` e `getAge()` permitem que outras classes acessem os valores de `name` e `age`.
   - Setters: 
     - `setName(String name)` e `setAge(int age)` permitem que outras classes modifiquem os valores de `name` e `age`. O setter para `age` inclui uma validação para garantir que a idade não seja negativa.

3. Maior Controle: 
   - Com essa abordagem, podemos facilmente adicionar lógica adicional no futuro, como validações ou transformações, sem afetar o restante do código que utiliza a classe `Person`.
