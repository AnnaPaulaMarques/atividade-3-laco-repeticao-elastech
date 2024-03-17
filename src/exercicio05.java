
public class exercicio05 {
    public static void main(String[] args) {

//        5 - Implemente um algoritmo que exiba os primeiros 20 números
//        da sequência de Fibonacci.

        System.out.println("Segue os 20 primeiros números da sequência de Fibonacci!!!");
        int numeroAtual = 1;
        int numeroAnterior = 0;

        for (int i = 1; i <= 20; i++) {
            int fibonacci = numeroAtual + numeroAnterior;
            numeroAnterior = numeroAtual;
            numeroAtual = fibonacci;

            System.out.println(numeroAtual + " + " + numeroAnterior + " = " + fibonacci);
        }
    }
}


//              int numero = 0;
//
//          for (int i = 1; i <= 20; i++) {
//          numero = i + numero;
//          System.out.println(numero);

//
// for (int i = 1; i <= 20; i++) {
//        for (int k = 1; k <= 20; k++) {
//k--;
//numero = k + i;
//                System.out.println(numero);
//                System.out.println(i + " + " + k + " = " + numero);

//
//int numeroAnterior = 0;
//int resultado = 1;
//
//        for (int i = 1; i <= 20; i++) {
//        System.out.println(resultado);
//
//int temp = resultado;
//resultado = resultado + numeroAnterior;
//numeroAnterior = temp;
//
//

