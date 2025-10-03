import java.util.ArrayList;

public class AnaliseTexto {
    private String frase;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public AnaliseTexto(String frase){
        setFrase(frase);
    }

    public void casoA(){
        char[] chars = new char[getFrase().length()];
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ç', 'ã', 'õ', 'á', 'é', 'í', 'ó','ú', 'ô'};
        int[] caracteres = new int[35];
        getFrase().getChars(0, getFrase().length(), chars, 0);

        for (char aux : chars){
            if (aux == 'a' || aux == 'A') {
                caracteres[0]++;
            } else if (aux == 'b' || aux == 'B') {
                caracteres[1]++;
            }else if (aux == 'c' || aux == 'C') {
                caracteres[2]++;
            }else if (aux == 'd' || aux == 'D') {
                caracteres[3]++;
            }else if (aux == 'e' || aux == 'E') {
                caracteres[4]++;
            }else if (aux == 'f' || aux == 'F') {
                caracteres[5]++;
            }else if (aux == 'g' || aux == 'G') {
                caracteres[6]++;
            }else if (aux == 'h' || aux == 'H') {
                caracteres[7]++;
            }else if (aux == 'i' || aux == 'I') {
                caracteres[8]++;
            }else if (aux == 'j' || aux == 'J') {
                caracteres[9]++;
            }else if (aux == 'k' || aux == 'K') {
                caracteres[10]++;
            }else if (aux == 'l' || aux == 'L') {
                caracteres[11]++;
            }else if (aux == 'm' || aux == 'M') {
                caracteres[12]++;
            }else if (aux == 'n' || aux == 'N') {
                caracteres[13]++;
            }else if (aux == 'o' || aux == 'O') {
                caracteres[14]++;
            }else if (aux == 'p' || aux == 'P') {
                caracteres[15]++;
            }else if (aux == 'q' || aux == 'Q') {
                caracteres[16]++;
            }else if (aux == 'r' || aux == 'R') {
                caracteres[17]++;
            }else if (aux == 's' || aux == 'S') {
                caracteres[18]++;
            }else if (aux == 't' || aux == 'T') {
                caracteres[19]++;
            }else if (aux == 'u' || aux == 'U') {
                caracteres[20]++;
            }else if (aux == 'v' || aux == 'V') {
                caracteres[21]++;
            }else if (aux == 'w' || aux == 'W') {
                caracteres[22]++;
            }else if (aux == 'x' || aux == 'X') {
                caracteres[23]++;
            }else if (aux == 'y' || aux == 'Y') {
                caracteres[24]++;
            }else if (aux == 'z' || aux == 'Z') {
                caracteres[25]++;
            }else if (aux == 'ç' || aux == 'Ç') {
                caracteres[26]++;
            }else if (aux == 'ã' || aux == 'Ã') {
                caracteres[27]++;
            }else if (aux == 'õ' || aux == 'Õ') {
                caracteres[28]++;
            }else if (aux == 'á' || aux == 'Á') {
                caracteres[29]++;
            }else if (aux == 'í' || aux == 'Í') {
                caracteres[30]++;
            }else if (aux == 'é' || aux == 'É') {
                caracteres[31]++;
            }else if (aux == 'ó' || aux == 'Ó') {
                caracteres[32]++;
            }else if (aux == 'ú' || aux == 'Ú') {
                caracteres[33]++;
            }else if (aux == 'ô' || aux == 'Ô') {
                caracteres[34]++;
            }
        }

        System.out.println("\nTABELA: Ocorrência de repetições de caracteres na frase digitada.\n");
        System.out.printf("%-29s%s\n", "Caractere", "Ocorrência");

        for(int i = 0; i < caracteres.length; i++){
            System.out.printf("-> %c:%25d\n", alfabeto[i], caracteres[i]);
        }

        System.out.println();
    }

    public void casoB(){
        String[] palavras = getFrase().split(" ");
        int[] ctrl = new int[15];
        int maiorVal = 0;

        for (String aux : palavras){
            if (aux.length() > maiorVal){
                ctrl[aux.length() - 1] += 1;
                maiorVal = aux.length();
            }else{
                ctrl[aux.length() - 1] += 1;
            }
        }

        System.out.println("\nTABELA: Número de letras por palavra.\n");
        System.out.printf("%-29s%s\n", "Comprimento de palavra", "Ocorrência");

        for(int i = 0; i < maiorVal; i++){
            System.out.printf("-> %d:%25d\n", (i + 1), ctrl[i]);
        }

        System.out.println();
    }

    public void casoC(){
        String[] palavras = getFrase().split(" ");
        ArrayList<String> auxiliar = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        int ctrl;

        for(int l = 0; l < palavras.length; l++){
            ctrl = 1;

            for (int c = l + 1; c < palavras.length; c++){
                if(palavras[l].equals(palavras[c])){
                    ctrl++;
                }
            }

            if(auxiliar.contains(palavras[l]) == false){
                auxiliar.add(palavras[l]);
                index.add(ctrl);
            }
        }

        System.out.println("\nTABELA: Repetição de palavras na frase.\n");
        System.out.printf("%-29s%s\n", "Ocorrência", "Palavra");

        for(int i = 0; i < auxiliar.size(); i++){
            System.out.printf("-> %-26d-> %s\n", index.get(i), auxiliar.get(i));
        }

        System.out.println();
    }
}
