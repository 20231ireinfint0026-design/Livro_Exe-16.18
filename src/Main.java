import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void limparBuffer(Scanner sc){
        sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        try{
            System.out.print("\nDigite a frase que você deseja analisar: ");
            String frase = sc.nextLine();

            AnaliseTexto auxiliar = new AnaliseTexto(frase);

            do {
                System.out.println("------------------------------MENU-----------------------------");
                System.out.println("-> Utilizar outra frase                                      :1");
                System.out.println("-> Tabela de repetições de letras                            :2");
                System.out.println("-> Tabela de ocorrência de diferentes tamanhos de palavras   :3");
                System.out.println("-> Tabela de repetições de palavras                          :4");
                System.out.println("-> Sair                                                      :0");

                System.out.print("\n#Operação: ");
                op = sc.nextInt();
                limparBuffer(sc);

                switch (op){
                    case 1:
                        System.out.print("\nDigite a frase que você deseja analisar: ");
                        frase = sc.nextLine();
                        
                        auxiliar.setFrase(frase);
                        System.out.println("\nSUCESSO: Frase atualizada!");
                        break;
                        
                    case 2:
                        auxiliar.casoA();
                        break;
                        
                    case 3:
                        auxiliar.casoB();
                        break;
                        
                    case 4:
                        auxiliar.casoC();
                        break;
                        
                    case 0:
                        System.out.println("!!!Obrigado pelo teste!!!");
                        break;
                        
                    default:
                        System.out.println("\nERRO: O valor digitado não corresponde a uma operação válida.");
                        break;
                }
            }while (op != 0);
        } catch (InputMismatchException e) {
            System.out.println("\nERRO: A expressão digitada não é válida.");
        }
    }
}