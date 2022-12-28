package extra_5;

import java.util.*;
import extra_5.Entidad.Meses;

public class Extra_5 {

    public static void main(String[] args) {
        Meses m = new Meses();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String mes;
        boolean op = true;

        do {
            System.out.println("Ingresa un mes");
            mes = sc.next();
            if (mes.equalsIgnoreCase(m.getMesSecreto())) {
                op = false;
                System.out.println("Correcto!!");
            } else {
                System.out.println("Intenta de nuevo");
            }
        } while (op == true);

    }

}
