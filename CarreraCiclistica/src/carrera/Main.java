/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;


public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("real madrid", "Colombia");

        Velocista v1 = new Velocista(1, "jhon", 400, 65);
        v1.setTiempoAcumulado(120);

        Escalador e1 = new Escalador(2, "Luis", 3.5f, 12.5f);
        e1.setTiempoAcumulado(135);

        Contrarrelojista c1 = new Contrarrelojista(3, "jhoselin", 70);
        c1.setTiempoAcumulado(140);

        equipo1.añadirCiclista(v1);
        equipo1.añadirCiclista(e1);
        equipo1.añadirCiclista(c1);

        equipo1.imprimirEquipo();
        equipo1.listarCiclistas();

        System.out.println("\nBuscando ciclista con ID 2:");
        equipo1.buscarCiclistaPorId(2);

        System.out.println("\nTiempo total del equipo: " + equipo1.calcularTiempoTotal() + " minutos");
    }
}