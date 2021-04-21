/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode7;

/**
 *
 * @author LENOVO
 */


 interface MyInterface {
 void calculate();
}
 
public class Mycode7 {
 public static void main(String[] args) {
 MyInterface obj = () -> {
 int i = 22;
 i++;
 System.out.println(i);
 return;
 };
 obj.calculate();
 }
}

