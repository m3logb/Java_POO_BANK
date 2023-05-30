package Entidades;

public class Banco {

    private String name;
    private int numeroConta;
    private float saldo;

    public Banco(String n,int nc,float d){

        this.name = n;
        this.numeroConta = nc;
        deposito(d);
        }

    public Banco(String n,int nc){
        this.name = n;
        this.numeroConta = nc;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getNumeroConta(){
        return this.numeroConta;

    }

    public float getSaldo(){
        return this.saldo;
    }

    public void deposito(float ammount){
        this.saldo += ammount;
    }

    public void saque(float ammount){
        this.saldo -= ammount + 5;
    }






    public String toString(){
       return " Conta: "
                           + this.numeroConta 
                           + " Titular: " 
                           + this.name 
                           + " Saldo " 
                           + this.saldo;
    
                        }
    
}
