package clases;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DeclararVector {

    private Trabajadores[] vectorTrabajadores;
    private int tamano;

    public DeclararVector() {
        tamano = 0;
        vectorTrabajadores = null;
    }

    public void crearVector() {
        vectorTrabajadores = new Trabajadores[tamano];
    }

    public void setTamano(int N) {
        tamano = N;
    }

    public int getTamano() {
        return tamano;
    }

    public Trabajadores[] getVectorTaTrabajadores() {
        return vectorTrabajadores;
    }

    public void setVectorTrabajadores(int p, Trabajadores ve) {
        vectorTrabajadores[p] = ve;
    }

    public Trabajadores getVectorTrabajadores(int p) {
        return vectorTrabajadores[p];
    }

    public DefaultTableModel cargarTablaTrabajador(ArrayList<Trabajadores> arrayList) {

        String cabecera[] = {
            "Nombre",
            "Identificación",
            "Estudios",
            "Edad",
            "Sede",
            "Correo",
            "Ingles"
        };
        DefaultTableModel model = new DefaultTableModel(null, cabecera);
        Object[] registro = new Object[7];
        for (int i = 0; i < arrayList.size(); i++) {
            registro[0] = (arrayList.get(i).getNombre());
            registro[1] = (arrayList.get(i).getIdentificacion());
            registro[2] = (arrayList.get(i).getEstudios());
            registro[3] = (arrayList.get(i).getEdad());
            registro[4] = (arrayList.get(i).getSede());
            registro[5] = (arrayList.get(i).getCorreo());
            registro[6] = (arrayList.get(i).getLengua());
            model.addRow(registro);
        }
        return model;
    }

    public Trabajadores buscarEmpleadoPorIdentificacion(int identificacion) {
        Trabajadores trabajador = null;

        for (int i = 0; i < getVectorTaTrabajadores().length; i++) {

            trabajador = getVectorTrabajadores(i);

            if ((identificacion == trabajador.getIdentificacion())) {

                return trabajador;

            } else {

                trabajador = getVectorTrabajadores(i);
            }
        }
        return trabajador;
    }

}
