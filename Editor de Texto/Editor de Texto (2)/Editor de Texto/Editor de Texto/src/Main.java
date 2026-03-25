import editor.Editor;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Editor edi = new Editor();

        System.out.println("\n--- MENU ---");
        System.out.println("1 - Criar lista");
        System.out.println("2 - Consultar nome");
        System.out.println("3 - Alterar nome");
        System.out.println("4 - Remover nome");
        System.out.println("5 - Sair");
        System.out.println("Escolha uma opção: ");

        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Arquivo criado");
                edi.criarArquivo();
                break;

            case 2: 
                System.out.println("Consultando arquivo");
                edi.consultarArquivo();
                break;

            case 3:
                System.out.println("Arquivo alterado");
                edi.alterarArquivo();
                break;
                
            case 4:
                System.out.println("Arquivo removido");
                edi.RemoverArquivo();
                break;

            case 5:
                System.out.println("Programa encerrado");
                break;

            default:
                System.out.println("Escolha uma opção válida");
                break;
        }
    } 
}