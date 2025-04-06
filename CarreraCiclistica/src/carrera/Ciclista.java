
package carrera;

public abstract class Ciclista {
    private int id;
    private String nombre;
    private int tiempoAcumulado; 

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void imprimirDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado + " minutos");
    }

    public abstract String imprimirTipo();
}


