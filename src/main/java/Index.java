import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decisao;
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
            System.out.println("\nDigite um número da opção desejada: ");
            decisao = sc.nextInt();

            switch (decisao) {
                case 1:
                    System.out.println("------------CRÉDITOS------------" +
                            "\nSistema criado por:" +
                            "\nAna Carolina Guimarães Sousa;" +
                            "\nBarbara Vitoria da Silva Santos;" +
                            "\nCleiton Ribeiro da Silva;" +
                            "\nDaniel Augusto Magalhães França;" +
                            "\nJenifer Mirela Sousa Alves.");
                    break;
                case 2:
                    float temperatura, orcamento;
                    System.out.println("->Verificar se podemos ir a praia<-");
                    System.out.println("Digite o numero da opção de como esta o clima: \n\n" +
                            "Opção (1): Ensolarado,  Opção (2): Chovendo,  Opção(3) Nublado, Opção (4) Garoa ");
                    int clima = sc.nextInt();
                    System.out.println("Temperatura: ");
                    temperatura = sc.nextFloat();
                    System.out.println("Orçamento: ");
                    orcamento = sc.nextFloat();

                    switch (clima) {
                        case 1:
                            System.out.println("Sol");
                            break;
                        case 2:
                            System.out.println("Chovendo");
                            break;
                        case 3:
                            System.out.println("Nublado");
                            break;
                        case 4:
                            System.out.println("Garoa");
                            break;
                        default:
                            System.out.println("Número inválido");
                            break;
                    }
                    if (temperatura >= 25 && orcamento >= 2000 && clima == 1) {
                        System.out.println("Sim, pode ir a praia!");
                    } else if (temperatura >= 25 && orcamento >= 2000 && clima == 3){
                        System.out.println("Sim, pode ir a praia!");
                    }else System.out.println("Não ir a praia");

                    break;
                case 3:
                    int produto;
                    double precoUni, valorFinal, desconto;
                    System.out.println("Digite a quantidade de produtos: ");
                    produto = sc.nextInt();
                    System.out.println("Digite o preço unitario: ");
                    precoUni = sc.nextInt();
                    if (produto >= 10) {
                        //desconto de 10%

                        desconto = (produto * precoUni) * 0.10;
                        valorFinal = (produto * precoUni) - desconto;

                        System.out.println("Valor final: " + valorFinal);


                    } else {

                        valorFinal = produto * precoUni;
                        System.out.println("Valor final: " + valorFinal);
                    }

                    break;
                case 4:
                    String nome;
                    float peso, altura, imc;

                    System.out.println("Digite seu nome");
                    nome = sc.next();
                    System.out.println("Digite seu peso: ");
                    peso = sc.nextFloat();
                    System.out.println("Digite sua altura: ");
                    altura = sc.nextFloat();
                    imc = peso / (altura * altura);
                    System.out.printf("Imc = %.1f \n", (imc));

                    if (imc < 18.5) {
                        System.out.println(nome + " seu grau é de Magreza.");
                    } else if (imc >= 18.5 && imc <= 24.9) {
                        System.out.println(nome + " seu grau é Normal.");
                    }
                    if (imc >= 24.9 && imc <= 30) {
                        System.out.println(nome + " seu grau é de Sobrepeso.");
                    } else if (imc > 30) {
                        System.out.println(nome + " seu grau é de Obesidade.");
                    }
                    break;
                case 5:
                    double precoEnergia = 0.28738;
                    double precoUsoSistemaDistribuicao = 0.30711;
                    System.out.println("Digite a quantidade de kWh consumidos: ");
                    double kwhConsumidos = sc.nextDouble();
                    double calculoDeTarifaLuz = kwhConsumidos * precoEnergia + kwhConsumidos * precoUsoSistemaDistribuicao;
                    System.out.printf("Valor calculado com sucesso! Sua tarifa da conta de luz deu: R$%.2f", calculoDeTarifaLuz);
                    break;
                case 6:
                    double consumoAgua, total = 0,
                            tarifa1 = 29.00, tarifa2 = 4.54, tarifa3 = 11.33, tarifa4 = 12.48;
                    System.out.println("\nCalculadora da conta de serviços de abastecimento de \n" +
                            "água e/ou coleta de esgoto, residencial, para o município de SAO PAULO. \n" +
                            "\nLevando em consideração que os valores das tarifas já foram estabelecidos e, " +
                            "será contado o uso do esgoto !\n\n" +
                            "Entre com seu consumo em m3(metros cubicos) do mes:");
                    consumoAgua = sc.nextDouble();
                    if (consumoAgua <= 10) {
                        total = tarifa1 * 2;
                    } else if (consumoAgua > 10 && consumoAgua <= 20) {
                        total = ((tarifa1 + (consumoAgua - 10) * tarifa2)) * 2;
                    } else if (consumoAgua > 20 && consumoAgua <= 50) {
                        total = ((tarifa1 + 10 * tarifa2 + (consumoAgua - 20) * tarifa3)) * 2;
                    }
                    if (consumoAgua > 50) {
                        total = ((tarifa1 + 10 * tarifa2 + 30 * tarifa3 + (consumoAgua - 50) * tarifa4)) * 2;
                    }
                    System.out.printf("____Sua conta de Água/Esgoto será no valor de R$:%.2f____\n", total);
                    break;
                case 7:
                    System.out.println("------------CRÉDITOS------------" +
                            "\nSistema criado por:" +
                            "\nAna Carolina Guimarães Sousa;" +
                            "\nBarbara Vitoria da Silva Santos;" +
                            "\nCleiton Ribeiro da Silva;" +
                            "\nDaniel Augusto Magalhães França;" +
                            "\nJenifer Mirela Sousa Alves.");
                    System.out.println("\n\nSistema encerrado com sucesso!");
                    break;
            }
        }
        while (decisao != 7);
    }
}

