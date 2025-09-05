package senac.rr.com;


public class pessoa {
public String nome;
public int idade;
private String cpf;

public String getnome(){
    System.out.println("Seu nome é");
    return this.nome;
  }
public int getidade(){
    System.out.println("Sua idade é");
    return this.idade;
  }
 public String getcpf(){
        System.out.println("Seu cpf é");
        return this.cpf;
  }
 public void setCpf(String cpf){
    this.cpf = cpf;
 }
}
