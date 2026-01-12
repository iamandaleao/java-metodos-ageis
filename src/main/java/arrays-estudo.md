# Estudo de Arrays em Java

## O que são Arrays em Java?

Array é uma estrutura que guarda vários valores do mesmo tipo em uma única variável. É como uma caixa com várias gavetas numeradas, onde cada gaveta guarda um valor.

## Declaração de Arrays

Existem duas formas de declarar:
```java
// Forma 1 (mais comum)
int[] numeros;
String[] nomes;

// Forma 2 (menos comum)
int numeros[];
String nomes[];
```

## Inicialização de Arrays

Você pode inicializar de várias formas:
```java
// Definindo o tamanho (cria 5 espaços vazios)
int[] numeros = new int[5];

// Já colocando os valores
int[] numeros = {10, 20, 30, 40, 50};

// Ou assim
String[] frutas = new String[]{"maçã", "banana", "laranja"};
```

## Acesso aos Elementos

Os elementos começam na posição 0 (zero):
```java
int[] numeros = {10, 20, 30, 40, 50};

System.out.println(numeros[0]); // Mostra 10
System.out.println(numeros[2]); // Mostra 30

// Alterando um valor
numeros[1] = 99;
System.out.println(numeros[1]); // Agora mostra 99
```

## Tamanho do Array

Para saber quantos elementos tem no array:
```java
int[] numeros = {10, 20, 30, 40, 50};
System.out.println(numeros.length); // Mostra 5
```

## Uso de Loops com Arrays
```java
int[] numeros = {10, 20, 30, 40, 50};

// For tradicional
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}

// For-each (mais simples)
for (int numero : numeros) {
    System.out.println(numero);
}
```

## Conclusão

Array é como uma lista numerada onde você guarda vários dados do mesmo tipo. Cada posição tem um número (índice) que começa do 0. Para acessar um valor, você usa o nome do array e o número da posição entre colchetes. Você pode usar loops para percorrer todos os elementos do array de forma automática.

## Pontos Importantes

- Arrays têm tamanho fixo (não aumentam ou diminuem depois de criados)
- O índice sempre começa em 0
- Se tentar acessar uma posição que não existe, dá erro (ArrayIndexOutOfBoundsException)
- Todos os elementos precisam ser do mesmo tipo

## Exercícios Realizados

✅ Criei arrays de diferentes tipos  
✅ Pratiquei acesso e modificação de elementos  
✅ Usei loops para percorrer arrays  
✅ Testei exemplos práticos

---

**Status:** Concluído ✅  
**Data:** 12/01/2026