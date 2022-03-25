import java.util.Random;
import java.util.Scanner;

public class Arrs {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] cartas = { "Ace", "Jack", "Queen", "King", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        String[] naipes = { "Diamond", "Heart", "Spades", "Tree" };
        
        Scanner value = new Scanner(System.in);
            System.out.println("Gostaria de receber uma mão(sim/nao): ");
            String resposta1 = value.nextLine();
            if(resposta1.equals("nao")){
                System.out.println("Obrigado por jogar!");
            }
        
        Scanner value1 = new Scanner(System.in);
        while (resposta1.equals("sim")) {
            
            String carta = cartas[rand.nextInt(13)];
            String naipe = naipes[rand.nextInt(4)];
            System.out.println("Estas são suas cartas: ");
            System.out.print(carta + " " + naipe);
            for (int i = 0; i < 3; i++) {
                String naipeLoop = naipes[rand.nextInt(4)];
                String cartaLoop = cartas[rand.nextInt(13)];
                while (naipeLoop.equals(naipe) & cartaLoop.equals(carta)) {
                    naipeLoop = naipes[rand.nextInt(4)];
                    cartaLoop = cartas[rand.nextInt(13)];
                }
                System.out.print(" ");
                System.out.print(cartaLoop + " " + naipeLoop);
            }
            System.out.println(" ");
            System.out.println("Gostaria de receber mais uma mão(Sim/não):");
            resposta1=value1.nextLine();
            if(resposta1.equals("nao")){
                System.out.println("Obrigado por jogar!");
            }
        }
        value.close();
        value1.close();
    }
}
