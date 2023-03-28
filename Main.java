package main;

import javax.swing.JOptionPane;
import logica.LogicaHipotenusa;

public class Main {

    public static void main(String[] args) {

        // VARIABLE BANDERA PARA CONTROLAR EL DO WHILE DE MODIFICAR CATETOS
        int estado_actualizacion = 0;

        // VARIABLE BANDERA PARA CONTROLAR EL DO WHILE DE MODIFICAR CATETOS
        boolean continuar = false;

        do {
            // MANEJAMOS EL EXCEPTION SI EL DATO QUE INGRESA NO ES DE TIPO INT
            try {
                // DECLARAMOS LAS VARIABLES
                int cateto_uno = Integer.parseInt(JOptionPane.showInputDialog("Digite el cateto uno"));
                int cateto_dos = Integer.parseInt(JOptionPane.showInputDialog("Digite el cateto dos"));
                continuar = true;

                // CREAMOS EL OBJETO DE TIPO LogicaHipotenusa PARA COMUNICARNOS CON LA CLASE
                LogicaHipotenusa logica_hipotenusa = new LogicaHipotenusa(cateto_uno, cateto_dos);
                logica_hipotenusa.ImprimirHipotenusa();

                JOptionPane.showMessageDialog(null, "La consulta del cateto uno es: "
                        + logica_hipotenusa.getCateto_uno());
                JOptionPane.showMessageDialog(null, "La consulta del cateto dos es: "
                        + logica_hipotenusa.getCateto_dos());

                // EJECUTAMOS EL CICLO PARA LA ACTUALIZACION O MODIFICACION DE LOS CATETOS
                do {
                    String respuesta = JOptionPane.showInputDialog("Quiere actualizar los valores? si/no");

                    // VALIDAMOS LA RESPUESTA
                    if (!respuesta.isEmpty()) {
                        if (respuesta.equalsIgnoreCase("si")) {

                            // ESTABLECEMOS LOS DATOS
                            cateto_uno = Integer.parseInt(JOptionPane.showInputDialog("Digite el cateto uno"));
                            logica_hipotenusa.setCateto_uno(cateto_uno);

                            cateto_dos = Integer.parseInt(JOptionPane.showInputDialog("Digite el cateto dos"));
                            logica_hipotenusa.setCateto_dos(cateto_dos);

                            // OBTENEMOS LOS DATOS
                            JOptionPane.showMessageDialog(null, "La consulta del cateto uno es: "
                                    + logica_hipotenusa.getCateto_uno());
                            JOptionPane.showMessageDialog(null, "La consulta del cateto dos es: "
                                    + logica_hipotenusa.getCateto_dos());

                            estado_actualizacion = 0;

                        } else if (respuesta.equalsIgnoreCase("no")) {
                            JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO", "MENSAJE",
                                    JOptionPane.WARNING_MESSAGE);

                            estado_actualizacion = 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "OPCIÓN NO VALIDA, VUELVA A INTENTAR",
                                    "ERROR", JOptionPane.ERROR_MESSAGE);
                            estado_actualizacion = 0;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "EN BLANCO, VUELVA A INTENTAR",
                                "ERROR", JOptionPane.ERROR_MESSAGE);
                        estado_actualizacion = 0;
                    }
                } while (estado_actualizacion == 0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } while (!continuar);
    }
}
