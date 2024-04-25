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
        boolean condicion = true;
        while (condicion) {
            BigDecimal cantidad;
            BigDecimal montoDelCambio;
            System.out.println("****************************************");
            System.out.println("Sea Bienvenido/a al Conversor de Moneda\n");

            String menu = """
                    1) Dólar >>> Peso Argentino
                    2) Peso Argentino >>> Dólar
                    3) Dólar >>> Real Brasileño
                    4) Real Brasileño >>> Dólar
                    5) Dólar >>> Peso Colombiano
                    6) Peso Colombiano >>> Dólar
                    7) Dólar >>> Boliviano
                    8) Boliviano >>> Dólar
                    9) Dólar >>> Pesos Chilenos
                    10) Pesos Chilenos >>> Dólar
                    11) Dólar >>> Pesos Mexicanos
                    12) Pesos Mexicanos >>> Dólar
                    0) Salir
                    Elija una opción valida:
                    """;
            System.out.println(menu);
            System.out.println("****************************************");

            try {
                int opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Argentinos: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("USD", "ARS", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [ARS]");
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de Pesos Argentinos que desea convertir a Dólares: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("ARS", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [ARS] corresponde al valor final de =>>> " + montoDelCambio + " [USD]");
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Real Brasileño: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("USD", "BRL", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [BRL]");
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad de Real Brasileño que desea convertir a Dólares: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("BRL", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [BRL] corresponde al valor final de =>>> " + montoDelCambio + " [USD]");
                        break;
                    case 5:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Colombianos: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("USD", "COP", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [COP]");
                        break;
                    case 6:
                        System.out.println("Ingrese la cantidad de Pesos Colombianos que desea convertir a Dólares: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("COP", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [COP] corresponde al valor final de =>>> " + montoDelCambio + " [USD]");
                        break;
                    case 7:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Bolivianos: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("USD", "BOB", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [BOB]");
                        break;
                    case 8:
                        System.out.println("Ingrese la cantidad de Bolivianos que desea convertir a Dólares: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("BOB", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [BOB] corresponde al valor final de =>>> " + montoDelCambio + " [USD]");
                        break;
                    case 9:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Chilenos: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("USD", "CLP", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [CLP]");
                        break;
                    case 10:
                        System.out.println("Ingrese la cantidad de Pesos Chilenos que desea convertir a Dólares: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("CLP", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [CLP] corresponde al valor final de =>>> " + montoDelCambio + " [USD]");
                        break;
                    case 11:
                        System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Mexicanos: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("USD", "MXN", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [MXN]");
                        break;
                    case 12:
                        System.out.println("Ingrese la cantidad de Pesos Mexicanos que desea convertir a Dólares: ");
                        cantidad = entrada.nextBigDecimal();
                        montoDelCambio = cambio.conversion("MXN", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [MXN] corresponde al valor final de =>>> " + montoDelCambio + " [USD]");
                        break;
                    case 0:
                        condicion = false;
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
