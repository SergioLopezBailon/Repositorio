/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diurno
 * @param <T>
 */
public class Calculadora<T> {

    public void sumar(T t1, T t2) {
        if (t1 instanceof Integer && t2 instanceof Integer) {

            System.out.println((Integer) t1 + (Integer) t2);

        }
        if (t1 instanceof Double && t2 instanceof Double) {
            System.out.println((Double) t1 + (Double) t2);

        }
    }
}
