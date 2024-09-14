/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hernandez_fernandolab8;

/**
 *
 * @author fdhg0
 */
public class Jtunes {

    private Song[] canciones;
    private int numCanciones;

    public Jtunes(int length) {
        this.canciones = new Song[length];
        this.numCanciones = 0;
    }

    public boolean addSong(int code, String nombre, int precio) {
        if (searchCode(code) != null) {
            System.out.println("Ya existe una cancion con ese codigo: " + code);
            return false;
        }

        if (numCanciones < canciones.length) {
            canciones[numCanciones] = new Song(code, nombre, precio);
            numCanciones++;
            return true;
        } else {
            System.out.println("No hay más espacio en Jtunes para agregar nuevas canciones.");
            return false;
        }
    }

    public Song searchCode(int code) {
        for (int contador = 0; contador < numCanciones; contador++) {
            if (canciones[contador].getCode() == code) {
                return canciones[contador];
            }
        }
        return null;
    }

    public void printAllSongs() {
        if (numCanciones == 0) {
            System.out.println("No hay canciones");
        }
        for (int contador = 0; contador < numCanciones; contador++) {
            canciones[contador].print();
        }

    }
    public Song[] getCanciones(){
        return canciones;
    }
    

    public int getnumCanciones() {
        return numCanciones;
    }
}
