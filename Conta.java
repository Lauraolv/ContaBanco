/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Conta {
    private int numero;
    private String agencia, nome_cliente;
    private double saldo;

    public Conta(int numero, String agencia, String nome_cliente, double saldo) {
        this.nome_cliente = nome_cliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
    public String getConta(){
        return ("\"Olá "+ this.nome_cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia +", conta " + this.numero+" e seu saldo "+this.saldo+" já está disponível para saque\".");
        
    }
}
