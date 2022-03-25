import java.util.ArrayList;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> picks = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean condition = true;
        while (condition == true) {
            // Fazendo a seleçao dos numeros da loterica
            int n = getRandomNumber(1, 60);
            picks.add(n);
            while (picks.size() < 6) {
                n = getRandomNumber(1, 60);
                if (!picks.contains(n)) {
                    picks.add(n);
                }
            }

            // Escolhendo os seus numeros
            System.out.println("Escolha 6 numeros entre 1 e 60: MEGA SENA");
            for (int i = 0; i < 6; i++) {
                int numero = scanner.nextInt();
                numeros.add(numero);
            }

            System.out.println("Estes são os numeros que você jogou");
            System.out.println(numeros);
            numeros.clear();
            System.out.println("Este é são os numeros selecionados pela loterica");
            System.out.println(picks);
            picks.clear();

            System.out.println("Quer jogar de novo: Sim ou Nao");
            String resposta = scanner.next();
            boolean chave = true;
            while (chave == true) {
                if (resposta.toUpperCase().equals("SIM")) {
                    condition = true;
                    chave=false;
                } else if (resposta.toUpperCase().equals("NAO")) {
                    condition = false;
                    chave=false;
                } else {
                    System.out.println("Tente outra resposta(Sim ou Nao como resposta)");
                    chave=true;
                }
            }
        }
        scanner.close();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
