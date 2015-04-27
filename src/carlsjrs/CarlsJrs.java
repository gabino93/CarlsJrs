/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carlsjrs;

/**
 *
 * @author fimaz2014
 */
public class CarlsJrs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Conexion conexion = new Conexion();
        
        conexion.conectar();
    }
    
}
