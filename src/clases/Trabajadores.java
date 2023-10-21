package clases;

public class Trabajadores {

    private int identificacion;
    private String nombre, correo, sede, lengua, estudios;
    private int edad;

    public Trabajadores() {
        identificacion = 0;
        nombre = "";
        edad = 0;
        correo = "";
        sede = "";
        lengua = "";
        estudios = "";
    }

    public void setEstudios(String est) {
        estudios = est;
    }

    public void setLengua(String len) {
        lengua = len;
    }

    public void setSede(String sed) {
        sede = sed;
    }

    public void setIdentificacion(int ide) {
        identificacion = ide;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setEdad(int ed) {
        edad = ed;
    }

    public void setCorreo(String email) {
        correo = email;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getLengua() {
        return lengua;
    }

    public String getEstudios() {
        return estudios;
    }

    public String getSede() {
        return sede;
    }

    public boolean isManejaIngles() {
        if (getLengua().equalsIgnoreCase("Si")) {
            return true;
        } else {
            return false;
        }
    }

    public String informacion() {
        return "<-----INFORME----->\n"
                + "Nombre: " + getNombre() + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "Sede: " + getSede();

    }
}
