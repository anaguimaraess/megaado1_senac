import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decisao ;
        System.out.println("Bem-vindx ao facilitor de seus calculos e decisões!\n ");


        do {
            System.out.println("\nMENU");
            System.out.println("1 - Créditos " +
                    "\n2 - Decisão: Podemos ir à praia?" +
                    "\n3 - Cálculo de descontos " +
                    "\n4 - Cálculo de IMC" +
                    "\n5 - Cálculo de tarifa da conta de luz para grupo normal" +
                    "\n6 - Cálculo de tarifa de água e esgoto" +
                    "\n7 - Encerrar sessão.");
            System.out.println("Digite um número da opção desejada: ");
            decisao = sc.nextInt();

            switch (decisao) {
                case 1:
                    System.out.println("------------CRÉDITOS------------" +
                            "\nSistem criado por:" +
                            "\nAna Carolina Guimarães Sousa;" +
                            "\nBarbara Vitoria da Silva Santos;" +
                            "\nCleiton Ribeiro da Silva;" +
                            "\nDaniel Augusto Magalhães França;" +
                            "\nJenifer Mirela Sousa Alves.");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    double precoEnergia = 0.28738;
                    double precoUsoSistemaDistribuicao =  0.30711;
                    System.out.println("Digite a quantidade de kWh consumidos: ");
                    double kwhConsumidos = sc.nextDouble();
                    double calculoDeTarifaLuz = kwhConsumidos *  precoEnergia + kwhConsumidos * precoUsoSistemaDistribuicao;
                    System.out.printf("Valor calculado com sucesso! Sua tarifa da conta de luz deu: R$%.2f", calculoDeTarifaLuz);
                    break;
                case 6:
                    Scanner input = new Scanner(System.in);
                    double tarifa = 0, consumaagua= 0 ,total=0, tarifa1 = 29.00,tarifa2=4.54,tarifa3=11.33,tarifa4=12.48;
                    System.out.println("Calculadora da tarifas para os serviços de abastecimento de \n" +
                            "água e/ou coleta de esgoto, para o município de SAO PAULO. \n\n " +
                            "Entre com seu consumo em m3(metros cubicos) do mes:\n" );

                    consumaagua = input.nextInt();
                    if(consumaagua<=10){
                        total= consumaagua*tarifa1;
                    }
                case 7:
                    System.out.println("------------CRÉDITOS------------" +
                            "\nSistem criado por:" +
                            "\nAna Carolina Guimarães Sousa;" +
                            "\nBarbara Vitoria da Silva Santos;" +
                            "\nCleiton Ribeiro da Silva;" +
                            "\nDaniel Augusto Magalhães França;" +
                            "\nJenifer Mirela Sousa Alves.");
                    System.out.println("\n\nSistema encerrado com sucesso!");
                    break;
            }
        }while(decisao != 7);
    }
}
