package issue2;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void falar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

