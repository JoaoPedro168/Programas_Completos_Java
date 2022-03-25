/**
 * Precificação
 */
import java.util.Scanner;
public class Precificação {

    public static void main(String[] args) {
        Scanner value1 = new Scanner(System.in);
        Scanner value2 = new Scanner(System.in);
        Scanner value3 = new Scanner(System.in);
        Scanner value4 = new Scanner(System.in);
        Scanner value5 = new Scanner(System.in);
        Scanner value6 = new Scanner(System.in);
        Scanner value7 = new Scanner(System.in);
        Scanner value8 = new Scanner(System.in);



        //Calculando o custo da mão de obra
        System.out.println("Horas trabalhadas em um mês: ");
        double tempoTrabalhadoMes = value1.nextDouble();
        System.out.println("Faturamento pretendido em um mês: ");
        double faturamentoPretendido = value2.nextDouble();
        double custoDaMaoDeObra = faturamentoPretendido/tempoTrabalhadoMes;
        System.out.println("Sua mão de obra custa " + custoDaMaoDeObra + "$ por hora.");

        //Calculando as despesas fixas
        System.out.println("Quais suas despesas fixas mensais: ");
        double despesasFixasMensais = value3.nextDouble();
        despesasFixasMensais=(despesasFixasMensais/tempoTrabalhadoMes);

        //Calculando as despesas variaveis
        System.out.println("Quais as despesas variaveis: ");
        double despesasVariaveisMensais = value4.nextDouble();
        despesasVariaveisMensais=(despesasVariaveisMensais/tempoTrabalhadoMes);

        //Calculando o custo da mão de obra
        System.out.println("Quantas horas foram trabalhadas no doce: ");
        double maoDeObra = value5.nextDouble();
        maoDeObra=(maoDeObra*custoDaMaoDeObra);

        //O custo do produto mais a embalagem
        System.out.println("Qual o custo do produto mais a embalagem: ");
        double produtoEmbalagem = value6.nextDouble();
        
        //Calculo da margem de lucro
        System.out.println("Qual a sua margem de lucro em porcentagem:");
        double margemDeLucro = value7.nextDouble();
        margemDeLucro = (margemDeLucro/100);

        //Conta final do preço do produto "Resultado"
        System.out.println("Quantas fatias tem a torta: ");
        double fatias = value8.nextDouble();
        
        double total = (despesasFixasMensais+
        despesasVariaveisMensais+maoDeObra+
        produtoEmbalagem)*(1+margemDeLucro);
       
        System.out.println("O doce inteiro custa: $" + total);
        System.out.println("A fatia custa: $" + (total/fatias));
        
       value1.close();
       value2.close();
       value3.close();
       value4.close();
       value5.close();
       value6.close();
       value7.close();
       value8.close();
    }
}
