package clases;

import views.VentanaE;
import views.VentanaT;

public class ProyectoEmpresa {

    public static VentanaE ventanaEmpresa;
    public static VentanaT ventanaTabla;

    public static void main(String[] args) {
        ventanaEmpresa = new VentanaE();
        ventanaTabla = new VentanaT();
        ventanaEmpresa.setVisible(true);
        ventanaEmpresa.setLocationRelativeTo(null);
    }
}
