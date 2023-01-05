package E4 ;

public class Switch {
    public static void main(String[] args) {
        String estacion = "Invierno";

        switch (estacion) {
        case "Verano":
            System.out.println("Es Verano");
            break;
        case "Invierno":
                System.out.println("Es Invierno");
            break;
        case "otoño":
            System.out.println("Es otoño");
            break;
        case "primavera":
            System.out.println("Es primavera");
            break;
        default:
            System.out.println("No es una estación");
        }
    }
}
