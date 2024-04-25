import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String fechaHora = formatter.format(new Date());
        String nombreArchivo = "consultas_" + fechaHora + ".txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {

            while (condicion) {
                BigDecimal cantidad;
                BigDecimal montoDelCambio;
                String mensaje;
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
                    writer.println("Opción seleccionada: " + String.valueOf(opcion));
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Argentinos: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("USD", "ARS", cantidad);
                            mensaje = "El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [ARS]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de Pesos Argentinos que desea convertir a Dólares: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("ARS", "USD", cantidad);
                            mensaje = "El valor " + cantidad + " [ARS] corresponde al valor final de =>>> " + montoDelCambio + " [USD]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de dólares que desea convertir a Real Brasileño: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("USD", "BRL", cantidad);
                            mensaje = "El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [BRL]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de Real Brasileño que desea convertir a Dólares: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("BRL", "USD", cantidad);
                            mensaje = "El valor " + cantidad + " [BRL] corresponde al valor final de =>>> " + montoDelCambio + " [USD]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Colombianos: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("USD", "COP", cantidad);
                            mensaje = "El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [COP]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 6:
                            System.out.println("Ingrese la cantidad de Pesos Colombianos que desea convertir a Dólares: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("COP", "USD", cantidad);
                            mensaje = "El valor " + cantidad + " [COP] corresponde al valor final de =>>> " + montoDelCambio + " [USD]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 7:
                            System.out.println("Ingrese la cantidad de dólares que desea convertir a Bolivianos: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("USD", "BOB", cantidad);
                            mensaje = "El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [BOB]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 8:
                            System.out.println("Ingrese la cantidad de Bolivianos que desea convertir a Dólares: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("BOB", "USD", cantidad);
                            mensaje = "El valor " + cantidad + " [BOB] corresponde al valor final de =>>> " + montoDelCambio + " [USD]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 9:
                            System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Chilenos: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("USD", "CLP", cantidad);
                            mensaje = "El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [CLP]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 10:
                            System.out.println("Ingrese la cantidad de Pesos Chilenos que desea convertir a Dólares: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("CLP", "USD", cantidad);
                            mensaje = "El valor " + cantidad + " [CLP] corresponde al valor final de =>>> " + montoDelCambio + " [USD]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 11:
                            System.out.println("Ingrese la cantidad de dólares que desea convertir a Pesos Mexicanos: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("USD", "MXN", cantidad);
                            mensaje = "El valor " + cantidad + " [USD] corresponde al valor final de =>>> " + montoDelCambio + " [MXN]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 12:
                            System.out.println("Ingrese la cantidad de Pesos Mexicanos que desea convertir a Dólares: ");
                            cantidad = entrada.nextBigDecimal();
                            montoDelCambio = cambio.conversion("MXN", "USD", cantidad);
                            mensaje = "El valor " + cantidad + " [MXN] corresponde al valor final de =>>> " + montoDelCambio + " [USD]";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                        case 0:
                            mensaje = "Salir del conversor";
                            writer.println(mensaje);
                            condicion = false;
                            break;
                        default:
                            mensaje = "Opcion invalida.";
                            System.out.println(mensaje);
                            writer.println(mensaje);
                            break;
                    }

                } catch (InputMismatchException e) {
                    mensaje = "Debe ingresar un número.";
                    System.out.println(mensaje);
                    writer.println(mensaje);
                    entrada.next();
                }

            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
