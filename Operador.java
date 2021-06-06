import javax.swing.*;

public class Operador {
    public static void main(String[] args) {
        //variables
        String nombre;
        int opt;
        double cal1, cal2, cal3, cal4, cal5, cal6, cal7, cal8, resultado;


        //menu de opciones

        do{
            opt = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una Opcion 1. Calificacion 2. salir"));
        }while(opt > 3 || opt < 1);


            switch (opt) {
                case 1:
                    JOptionPane.showMessageDialog(null, "selecione 1.- Calificaciones");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "seleccione 2.- salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion correcta");
                    break;
            }

            //pedimentos de datos

        nombre = JOptionPane.showInputDialog("Dijite su nombre por favor");
        JOptionPane.showMessageDialog(null,"Si el nombre es correcto "+ nombre +" ");

        //pedimento de calificaciones

        cal1 = Double.parseDouble(JOptionPane.showInputDialog("Dijite por favor primera calificacion"));
        cal2 = Double.parseDouble(JOptionPane.showInputDialog("Dijite por favor segunda calificacion"));
        cal3 = Double.parseDouble(JOptionPane.showInputDialog("Dijite por favor tercera calificacion"));
        cal4 = Double.parseDouble(JOptionPane.showInputDialog("Dijite por favor cuarta calificacion"));
        cal5 = Double.parseDouble(JOptionPane.showInputDialog("Dijite por favor quinta calificacion"));
        cal6 = Double.parseDouble(JOptionPane.showInputDialog("Dijite por favor sexta calificacion"));
        cal7 = Double.parseDouble(JOptionPane.showInputDialog("Dijite por favor spetima calificacion"));
        cal8 = Double.parseDouble(JOptionPane.showInputDialog("Dijite por favor octaba calificacion"));

        //toma de la decision

        resultado =  Math.round((cal1 +cal2 + cal3 + cal4 + cal5 + cal6 + cal7 + cal8)  / 8  ) ;

        JOptionPane.showMessageDialog(null, "El rresultado de "+ nombre +":  " + String.format("%.1f",resultado));

        if(resultado >= 60.0){
            JOptionPane.showMessageDialog(null, "la calificacion es:  si aprobo felicidades " + String.format("%.1f", resultado));
        }else {
            JOptionPane.showMessageDialog(null, "El resultado es: no aprobo" + String.format("%.1f", resultado));
        }
    }
}
