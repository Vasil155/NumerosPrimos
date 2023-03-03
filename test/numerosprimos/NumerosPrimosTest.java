/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vasil
 */
public class NumerosPrimosTest {

    public NumerosPrimosTest() {
    }

    @Test
    public void generarPrimos1() {
        int[] centArray = CribaEratostenes.generarPrimos(0);
        System.out.println("Los números primos del 0 son: ");
        if (centArray.length > 0) {
            for (int i = 0; i < centArray.length; i++) {
                System.out.println(centArray[i]);
            }
        } else {
            System.out.println("No existen números primos de 0");
        }

    }

    @Test
    public void generarPrimos2() {
        int[] centArray = CribaEratostenes.generarPrimos(2);
        if (centArray.length > 0) {
            System.out.println("Los números primos del 2 son: ");
            for (int i = 0; i < centArray.length; i++) {
                System.out.println(centArray[i]);
            }
        } else {
            System.out.println("No existen números primos de 2");
        }
    }

    @Test
    public void generarPrimos3() {
        int[] centArray = CribaEratostenes.generarPrimos(3);
        if (centArray.length > 0) {
            System.out.println("Los números primos del 3 son: ");
            for (int i = 0; i < centArray.length; i++) {
                System.out.println(centArray[i]);
            }
        } else {
            System.out.println("No existen números primos de 3");
        }
    }

    @Test
    public void generarPrimos4() {
        int[] centArray = CribaEratostenes.generarPrimos(100);
        if (centArray.length > 0) {
            System.out.println("Los números primos del 100 son: ");
            for (int i = 0; i < centArray.length; i++) {
                System.out.println(centArray[i]);
            }
        } else {
            System.out.println("No existen números primos de 100");
        }
    }

}