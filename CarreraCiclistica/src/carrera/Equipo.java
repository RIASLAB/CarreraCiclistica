/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera;
import java.util.ArrayList;
/**
 *
 * @author Jhon Edinson R
 */
public class Equipo {
   
    private String nombre;
    private String pais;
    private ArrayList<Ciclista> ciclistas;
    private static int tiempoTotal = 0;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected void añadirCiclista(Ciclista c) {
        ciclistas.add(c);
        tiempoTotal += c.getTiempoAcumulado();
    }

    protected void imprimirEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("País: " + pais);
    }

    protected void listarCiclistas() {
        System.out.println("Ciclistas del equipo:");
        for (Ciclista c : ciclistas) {
            System.out.println("- " + c.getNombre());
        }
    }

    protected void buscarCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getId() == id) {
                c.imprimirDatos();
                System.out.println(c.imprimirTipo());
                return;
            }
        }
        System.out.println("Ciclista no encontrado.");
    }

    protected int calcularTiempoTotal() {
        int suma = 0;
        for (Ciclista c : ciclistas) {
            suma += c.getTiempoAcumulado();
        }
        tiempoTotal = suma;
        return tiempoTotal;
    }

    public static int getTiempoTotal() {
        return tiempoTotal;
    }
}


