/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavideo;

//import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Auto miAuto = new Auto(); //crear un objeto tipo auto (Clase creada por mi)
            System.out.println("miAuto: "+miAuto.color + " "+ miAuto.patente+ " "+ miAuto.conAire+" "+miAuto.kms);
            miAuto.color="Verde";
            miAuto.patente="GAY069";
            miAuto.kms=3000;
            miAuto.conAire=true;
            System.out.println("miAuto: "+miAuto.color + " "+ miAuto.patente+ " "+ miAuto.conAire+" "+miAuto.kms); //aca cambiamos el estado y lo vimos en consola
            System.out.println(miAuto); //para ver el identificador en la consola (en este caso es b4c966a)
            
        Auto miAuto2 = new Auto();
            miAuto2.color="Rojo";
            miAuto2.conAire=true;
            miAuto2.kms=0;
            miAuto2.patente="GON420";
            System.out.println("miAuto2: "+miAuto2.color + " "+ miAuto2.patente+ " "+ miAuto2.conAire+" "+miAuto2.kms);
            System.out.println(miAuto2); //en este caso el identificador es 2f4d3709
            
        Auto otroAuto= miAuto; //otro auto es una variable NO un objeto. Le asigne miAuto a esta variable
            otroAuto.color="azul";
            System.out.println("miAuto2: "+miAuto.color); //tanto la variable otroAuto como la variable miAuto apuntan al mismo objeto, asi que si cambio el estado del objeto, se va a cambiar en ambas.
        
            
            
        CuentaBancaria cb = new CuentaBancaria();
        
            cb.setAlias("Gonzo");
            cb.mostrarDatos();
            cb.setAlias(null); 
            //no te deja cambiar a null!!
            cb.mostrarDatos();
            System.out.println(cb.getAlias());
            
        
            System.out.println(cb.obtenerSaldo());
            cb.depositar(200);
            cb.mostrarDatos();
            cb.depositar(-50);
            cb.mostrarDatos();
            
            System.out.println(cb.saldoDisponible(300));
            System.out.println(cb.saldoDisponible(100));
            
            cb.extraer(500);
            cb.extraer(150);
            cb.mostrarDatos();
        
        CuentaBancaria cb = new CuentaBancaria("miAlias", "Pesos", "Caja de ahorro");
        CuentaBancaria cb2 = new CuentaBancaria("caja2", "Dólares", "Caja de ahorro");
        CuentaBancaria cb3 = new CuentaBancaria("Cuenta_123", "Pesos", "Cuenta corriente");
        //ya no necesitamos esto por el constructor
        cb.setAlias("miAlias");
        cb.setMoneda("Pesos");
        cb.setTipo("Caja de ahorro");
        
        cb2.setAlias("caja2");
        cb2.setMoneda("Dólares");
        cb2.setTipo("Caja de ahorro");
        
        cb3.setAlias("Cuenta_123");
        cb3.setMoneda("Pesos");
        cb3.setTipo("Cuenta corriente");
        */
        /*
         CuentaBancaria cb = new CuentaBancaria("miAlias", "Pesos", "Caja de ahorro");
        CuentaBancaria cb2 = new CuentaBancaria("caja2", "Dólares", "Caja de ahorro");
        CuentaBancaria cb3 = new CuentaBancaria("Cuenta_123", "Pesos", "Cuenta corriente");
        
        
        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();
        */
        
        CuentaBancaria cb = new CuentaBancaria("miAlias", "Pesos", "Caja de ahorro");
        CuentaBancaria cb2= new CuentaBancaria();
        CuentaBancaria cb3= new CuentaBancaria("Pesos", "Cuenta corriente");
                
        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();
    }
    
}
