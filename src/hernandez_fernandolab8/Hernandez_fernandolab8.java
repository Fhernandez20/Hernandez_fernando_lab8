/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernandolab8;

/**
 *
 * @author fdhg0
 */
public class Hernandez_fernandolab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jtunes jtunes = new Jtunes(20);
        JtunesMenu menu=new JtunesMenu(jtunes);
        menu.setVisible(true);
    }
    
}
