import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
//        10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras.
//        O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens.
//        O programa deve continuar executando até que o usuário decida sair.

        Scanner scanner = new Scanner(System.in);

        List<String> listaCompras = new ArrayList<>();

        System.out.println("OLá, gostaria de fazer sua lista de compras?");

        String continuar = "S";

        while ("S".equals(continuar)) {
            System.out.println("Insira o item na sua lista de compras! ");
            String item = scanner.nextLine();
            listaCompras.add(item);
            System.out.println("Sua Lista de Compras! " + listaCompras);
            System.out.println("Deseja continuar? (S/N)");

            continuar = scanner.next();
            if (continuar != "S" || continuar != "N") {
                System.out.println("Entrada inválida!!!");
            }
            scanner.nextLine();
        }
    }
}


