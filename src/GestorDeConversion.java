import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorDeConversion {
    private ConsultarCambio cambio;
    private Scanner entrada;

    public GestorDeConversion() {
        this.cambio = new ConsultarCambio();
        this.entrada = new Scanner(System.in);
    }

    public void ejecutarConversiones() {
        while (true) {
            System.out.println("****************************************");
            System.out.println("Sea Bienvenido/a al Conversor de Moneda\n");

            String menu = """
                    1) Dólar >>> Peso Argentino
                    2) Peso Argentino >>> Dólar
                    3) Dólar >>> Real Brasileño
                    4) Real Brasileño >>> Dólar
                    5) Dólar >>> Peso Colombiano
                    6) Peso Colombiano >>> Dólar
                    7) Salir
                    Elija una opción valida:
                    """;
            System.out.println(menu);
            System.out.println("****************************************");

            try {
                int opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Argentinos: ");
                        BigDecimal cantidad1 = entrada.nextBigDecimal();
                        BigDecimal montoDelCambio1 = cambio.conversion("USD", "ARS", cantidad1);
                        System.out.println("El valor " + cantidad1 + " [USD] corresponde al valor final de =>>> " + montoDelCambio1 + " [ARS]");
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de Pesos Argentinos que desea convertir a Dólares: ");
                        BigDecimal cantidad2 = entrada.nextBigDecimal();
                        BigDecimal montoDelCambio2 = cambio.conversion("ARS", "USD", cantidad2);
                        System.out.println("El valor " + cantidad2 + " [ARS] corresponde al valor final de =>>> " + montoDelCambio2 + " [USD]");
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Real Brasileño: ");
                        BigDecimal cantidad3 = entrada.nextBigDecimal();
                        BigDecimal montoDelCambio3 = cambio.conversion("USD", "BRL", cantidad3);
                        System.out.println("El valor " + cantidad3 + " [USD] corresponde al valor final de =>>> " + montoDelCambio3 + " [BRL]");
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad de Real Brasileño que desea convertir a Dólares: ");
                        BigDecimal cantidad4 = entrada.nextBigDecimal();
                        BigDecimal montoDelCambio4 = cambio.conversion("BRL", "USD", cantidad4);
                        System.out.println("El valor " + cantidad4 + " [BRL] corresponde al valor final de =>>> " + montoDelCambio4 + " [USD]");
                        break;
                    case 5:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Colombianos: ");
                        BigDecimal cantidad5 = entrada.nextBigDecimal();
                        BigDecimal montoDelCambio5 = cambio.conversion("USD", "COP", cantidad5);
                        System.out.println("El valor " + cantidad5 + " [USD] corresponde al valor final de =>>> " + montoDelCambio5 + " [COP]");
                        break;
                    case 6:
                        System.out.println("Ingrese la cantidad de Pesos Colombianos que desea convertir a Dólares: ");
                        BigDecimal cantidad6 = entrada.nextBigDecimal();
                        BigDecimal montoDelCambio6 = cambio.conversion("COP", "USD", cantidad6);
                        System.out.println("El valor " + cantidad6 + " [COP] corresponde al valor final de =>>> " + montoDelCambio6 + " [USD]");
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número.");
                entrada.next();
            }

        }
    }
}
