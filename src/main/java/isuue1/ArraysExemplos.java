package isuue1;

public class ArraysExemplos {
    public static void main(String[] args) {
        // Declaração
        int[] numeros;

        // Inicialização
        numeros = new int[]{10, 20, 30, 40, 50};

        // Acesso aos elementos
        System.out.println("Primeiro elemento: " + numeros[0]);

        // Loop com array
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}