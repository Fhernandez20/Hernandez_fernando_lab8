/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hernandez_fernandolab8;

/**
 *
 * @author fdhg0
 */
public class Song {
    private int code;
    private String nombre;
    private int precio;
    private int estrellas;
    private int numeroDeReviews;
    
            
    Song(int code, String nombre, int precio){
        this.code=code;
        this.nombre=nombre;
        this.precio=precio;
        this.estrellas=0;
        this.numeroDeReviews=0;
    }
    
    public int getCode(){
        return code;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getEstrellas(){
        return estrellas;
    }
    public void addReview(int estrellas) {
        if (estrellas >= 0 && estrellas <= 5) {
            this.estrellas += estrellas;
            this.numeroDeReviews++;
        } else {
            System.out.println("Número de estrellas inválido. Debe estar entre 0 y 5.");
        }
    }
     public double getRating() {
        if (numeroDeReviews == 0) {
            return 0;
        }
        return (double) estrellas / numeroDeReviews;
    }
     
    public int getcountReviews(){
        return numeroDeReviews;
    }
    public String print(){
    return "Código: " + code + "\n"
           + "Nombre: " + nombre + "\n"
           + "Precio: " + precio + "\n"
           + "Promedio de Estrellas: " + getEstrellas() + "\n"
           + "Número de Reseñas: " + getcountReviews() + "\n"
           + "Rating Promedio: " + getRating() + "\n\n";
    }
}
