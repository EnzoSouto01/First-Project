package com.mycompany.pessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author Enzo S
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private double salario;
    private String telefone;
    private String email;

    public Pessoa() {
        this("","",0,"","");
    }
    //inicializa os atributos com valores passados por parametro
    public Pessoa(String nome, String endereco, double salario, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
       
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public double getSalario() {
        return salario;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
   
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void inserirDados(){
    setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
    setEndereco(JOptionPane.showInputDialog("Digite o seu endereço:"));
    setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: ")));
    setTelefone(JOptionPane.showInputDialog("Digite o seu número de telefone:"));
    setEmail(JOptionPane.showInputDialog("Digite o seu e-mail:"));
}
 
public void apresentarPessoa(){
    String mensagem = "O seu nome é: " + getNome() + "\n" +
                  "O seu endereço é: " + getEndereco() + "\n" +
                  "O seu salário é: " + getSalario() + "\n" +
                  "O seu número de telefone é: " + getTelefone() + "\n" +
                  "O seu email é: " + getEmail();
    
JOptionPane.showMessageDialog(null, mensagem);

  }
}
