/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamónLarhzialeNahid2122 miJamonLarhzialeNahid2122;
        int stockActual;
        
        miJamonLarhzialeNahid2122 = new JamónLarhzialeNahid2122("5Jotas",580,100);
         vendeJamLarhzialeNahid2122(miJamonLarhzialeNahid2122);
        
        compraJamLarhzialeNahid2122(miJamonLarhzialeNahid2122);
        stockActual = miJamonLarhzialeNahid2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void compraJamLarhzialeNahid2122(JamónLarhzialeNahid2122 miJamonLarhzialeNahid2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonLarhzialeNahid2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void  vendeJamLarhzialeNahid2122(JamónLarhzialeNahid2122 miJamonLarhzialeNahid2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonLarhzialeNahid2122.vender(80, España);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
