package ejrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Manzanilla
 */
public class Cliente {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
           String ip= "192.168.0.12";
           // Registry reg = LocateRegistry.getRegistry("192.168.43.165", 1098);
            Registry miRegistro = LocateRegistry.getRegistry(ip, 1099);
            Calculadora c =(Calculadora)miRegistro.lookup("Calculadora");
            
           while (true){
               String menu =JOptionPane.showInputDialog("   Calculadora \n   **Bienvenido**\n \n  Seleccione una opcion:\n "
                            +"Suma...(1)\n"
                            +"Resta...(2)\n"
                            +"Multiplicación...(3)\n"
                            +"Divición...(4)\n"
                            +"connec...(5)\n"
                            +"Cancelar para salir");
               
               switch(menu){
                   case "1":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                       
                           // JOptionPane.showMessageDialog(null,"la suma es: " + c.add(x,y));
                            break;
                    } 
                   case "2":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                       
                          //  JOptionPane.showMessageDialog(null,"la resta es: " + c.sub(x,y));
                            break;
                   }
                   case "3":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                       
                           // JOptionPane.showMessageDialog(null,"la multiplicación es: " + c.mul(x,y));
                            break;
                   }
                   case "4":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                       
                      //      JOptionPane.showMessageDialog(null,"la divición es: " + c.div(x,y));
                            break;
                   }
               case "5":{
                       String user = JOptionPane.showInputDialog("Ingrese el usuario");
                       String pass = JOptionPane.showInputDialog("Ingrese la contrasena");
                       
                            JOptionPane.showMessageDialog(null, c.log(user, pass));
                            break;
                   }
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Servidor no encontrado\n" + e);
            System.out.println(e); 
        }
    }
}