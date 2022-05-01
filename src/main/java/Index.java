import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int novaDecisao = 0;
        System.out.println("Bem-vindx ao facilitor de seus calculos e decisões!\n ");
        System.out.println("MENU");
        System.out.println("1 - Créditos " +
                "\n2 - Decisão: Podemos ir à praia?" +
                "\n3 - Cálculo de descontos " +
                "\n4 - Cálculo de IMC" +
                "\n5 - Cálculo de tarifa da conta de luz para grupo normal" +
                "\n6 - Cálculo de tarifa de água e esgoto" +
                "\n7 - Encerrar sessão.");
        System.out.println("Digite um número da opção desejada: ");
        int decisao = sc.nextInt();

        do {
            switch (decisao) {
                case 1:
                    System.out.println("------------CRÉDITOS------------" +
                            "\nSistem criado por:" +
                            "\nAna Carolina Guimarães Sousa;" +
                            "\nBarbara Vitoria da Silva Santos;" +
                            "\nCleiton Ribeiro da Silva;" +
                            "\nDaniel Augusto Magalhães França;" +
                            "\nJenifer Mirela Sousa Alves.");
                    System.out.println("\n");
                    System.out.println("\nMENU");
                    System.out.println("1 - Créditos " +
                            "\n2 - Decisão: Podemos ir à praia?" +
                            "\n3 - Cálculo de descontos " +
                            "\n4 - Cálculo de IMC" +
                            "\n5 - Cálculo de tarifa da conta de luz para grupo normal" +
                            "\n6 - Cálculo de tarifa de água e esgoto" +
                            "\n7 - Encerrar sessão.");
                    System.out.println("Digite um número da opção desejada: ");
                    novaDecisao = sc.nextInt();
                    decisao = novaDecisao;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println("------------CRÉDITOS------------" +
                            "\nSistem criado por:" +
                            "\nAna Carolina Guimarães Sousa;" +
                            "\nBarbara Vitoria da Silva Santos;" +
                            "\nCleiton Ribeiro da Silva;" +
                            "\nDaniel Augusto Magalhães França;" +
                            "\nJenifer Mirela Sousa Alves.");
                    break;
            }
        }while(decisao != 7);
    }
}
