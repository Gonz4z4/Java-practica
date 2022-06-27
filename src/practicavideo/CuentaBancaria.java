/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicavideo;

/**
 *
 * @author gonza
 */
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;
    
    //CONSTRUCTOR:
    //cada vez que llame a new CuentaBancaria() va a hacer         esto
    
    public CuentaBancaria(String alias, String moneda, String tipo) {
        System.out.println("Se creó el objeto "+this);
        this.CBU= generarCBU();
        setMoneda(moneda);
        setTipo(tipo);
        setAlias(alias);
    }
    
    //Constructor para usar con alias preasignado
    /*
    public CuentaBancaria(String moneda, String tipo) {
        System.out.println("Se creó el objeto "+this);
        this.CBU= generarCBU();
        setMoneda(moneda);
        setTipo(tipo);
        setAlias("NombreGenérico");
    }
    */
    //Este es el mismo constructor que el anterior pero usa       el this() para acortar código
    public CuentaBancaria(String moneda, String tipo) {
        this("NombreGenérico", moneda, tipo); 
    }
    
    //Otro constructor para enviar sin datos
    public CuentaBancaria(){
    }
    
    //METODO CBU
    private String generarCBU(){
        return "12345678";
    }
    
    //GETTERS:
    public void mostrarDatos(){
    //void no devuelve resultados
        System.out.println("Cuenta bancaria: "+CBU+" "+alias+" "+saldo+" "+moneda+" "+tipo);
    }
    
    public double getSaldo(){  
    // esto es un getter
      return saldo;  
    }

    public String getAlias() {
        return alias;
    }

    //SETTERS
    public void setAlias(String alias) {
        //esto es un setter
        if (alias !=null){
            this.alias = alias; //uso de this para sacar                   ambiguedades
        }
    }

    public void setMoneda(String moneda) {
        if (moneda!=null){
        this.moneda = moneda;
        }
    }

    public void setTipo(String tipo) {
        if (tipo!=null){
        this.tipo = tipo;
        }
    }
    
    //TRANSACCIONES
    public boolean saldoDisponible(double monto){
        return saldo>=monto;
    }
    
    public void depositar(double monto){
        if (monto>0){
            saldo += monto;
        } else {
            System.out.println("Error no se puede depositar                menos de 1 peso");
        }
    }
    
    public void extraer(double monto){
        if (saldoDisponible(monto)){
            saldo -=monto;
        } else {
            System.out.println("No se puede extraer más de lo que tiene");
        }
    }
    
}

