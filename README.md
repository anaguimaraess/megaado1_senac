# megaado1_senac
Projeto desenvolvido para somar na nota semestral da disciplina Projeto Integrador do curso Análise e Desenvolvimento de Sistemas. 
<br />
<br />
ADO's são como atividades que contabilizam nota por colocarmos nossos aprendizados em prática.
<br /><br />
<br />
O projeto utiliza o JDK 11 conforme orientado professor Tsuda. 
<br /><br /><br />
Integrantes:
<br />
Ana Carolina Guimarães Sousa, Bárbara Vitória da Silva Santos, Cleiton Ribeiro da Silva, Daniel Augusto Magalhães França e Jenifer Mirela Sousa Alves.
<br /><br />
<br />
EXERCÍCIO:
<br /><br />
Implementar as 6 funcionalidades abaixo em um único projeto Java / Maven.
Tela de créditos: Mostrar na saída o nome completo de todos os integrantes do grupo
<br /><br />
Será incluido os 5 exercicios abaixo, 1 tela de créditos e o "encerrar" que será a 7 funcionalidade.
<br />

1.Desenvolver um algoritmo para decidir se podermos ir para a praia no final de semana - Considerar como critérios a previsão do tempo (mínimo de 25 graus e sem chuva) e orçamento mínimo de R$ 2000,00.<br />
Para previsão do tempo, considerar, além da temperatura, as seguintes possibilidades de condição do tempo: A) Sol, B) Nublado, C) Garoa, D) Chuva  <br />
Exemplos (em vermelho, as condições que impedem a ida à praia) <br />
Entrada: Temperatura 29 graus, sol, R$ 2200,00 > Saída: Sim, pode ir a praia <br />
Entrada: Temperatura 27 graus, nublado, R$ 2100,00 > Saída: Sim, pode ir a praia <br />
Entrada: Temperatura 21 graus, sol, R$ 3000,00 > Saída: Não ir a praia <br />
Entrada: Temperatura 30 graus, sol, R$ 1000,00 > Saída: Não ir a praia <br />
<br />
<br /> <br /> 
2.Desenvolver um algoritmo para calcular 10% de desconto no preço total de um protudo ao comprar 10 ou mais unidades, ou o preço cheio se tiver menos de 10 unidades <br />
Exemplos <br />
Entrada: 8 produtos, valor unitário de R$ 100,00 > Saída: Total R$ 800,00 <br />
Entrada: 12 produtos, valor unitário de R$ 100,00 > Saída: Total R$ 1080,00 (desconto de R$ 120,00) <br />
<br /><br /> 
<br />
3.Calcular o IMC (Índice de massa corpórea) de uma determinada pessoa a partir do peso (em Kg) e da altura (em m). Cálculo usual para adultos: IMC = peso / (altura * altura)<br />
Adotar os critérios abaixo: <br />
Magreza: resultado do cálculo é menor que 18,5 Kg/m2 <br />
Normal: resultado do cálculo está entre 18,5 Kg/m2 e 24,9Kg/m2 <br />
Sobrepeso: resultado do cáculo está entre 24,9 Kg/m2 e 30 Kg/m2 <br />
Obesidade: resultado é maior que 30 Kg/m2 <br />
Exemplos <br />
Peso 54 e altura 1,75 > Saída arredondada: 17,7 Kg/m2 - Magreza <br />
Peso 75 e altura 1,78 > Saída arredondada: 23,7 Kg/m2 - Normal <br />
Peso 90 e altura 1,80 > Saída arredondada: 27,8 Kg/m2 - Sobrepeso <br />
Peso 105 e altura 1,75 > Saída arredondada: 34,3 Kg/m2 - Obesidade <br />
<br /><br />
<br />
4.Dado a quantidade de kWh consumidos, o preço unitário por kWh e o preço do uso do sistema de distribuição da Enel/SP, calcular a tarifa da conta de luz para grupo normal (desconsiderar impostos e taxas extras)<br />
Tarifas da Enel/SP em abril/20220 para Grupo B/Classe B1 residencial (informado em https://www.enel.com.br/pt-saopaulo/Para_Voce/tarifa-de-energia-eletrica.html)<br />
ATENÇÃO: Na parte da descrição do faturamento na conta de luz, os valores indicados na conta possuem ICMS já embutido. Nesta atividade, usar as tarifas aplicadas sem impostos.<br />
Preço da energia (TE): R$ 0,28738 por kWh <br /> 
Preço do uso do sistema de distribuição (TUSD): R$ 0,30711 por kWh <br />
Exemplos <br />
Entrada: 190 kWh > 190 * 0,28738 + 190 * 0,30711 = R$ 112,95 <br />
Entrada: 350 kWh > 350 * 0,28738 + 350 * 0,30711 = R$ 208,07 <br />
<br />
<br />
<br />
5.Dado o volume de água consumido e as faixas de tarifa por m3 (Sabesp/SP), calcular a tarifa de água e esgoto (desconsiderar impostos e taxas extras)
Tarifas de água e esgoto para São Paulo/SP e uso Residencial Normal (obtida em https://agenciavirtual.sabesp.com.br/web/guest/tarifas)<br />
De 0 a 10 - Água R$ 29,00 / Esgoto R$29,00 (valor mínimo) <br />
De 11 a 20 - Água R$ 4,54 por m3 / Esgoto R$ 4,54 por m3 <br />
De 21 a 50 - Água R$ 11,33 por m3 / Esgoto R$ 11,33 por m3 <br />
Acima de 50 - Água R$ 12,48 por m3 / Esgoto R$ 12,48 por m3 <br />
Exemplos:<br /><br />
Entrada: 5 m3 > 29,00 + 29,00 = R$ 58,00 <br />
Entrada: 9 m3 > 29,00 + 29,00 = R$ 58,00 <br />
Entrada: 15 m3 > (29,00 + (10 - 5) * 4,54) + (29,00 + (10 - 5) * 4,54) = R$ 103,40 <br />
Entrada: 27 m3 > (29,00 + 10 * 4,54 + (27 - 20) * 11,33) + (29,00 + 10 * 4,54 + (27 - 20) * 11,33) = R$ 307,42 <br />
Entrada: 55 m3 > (29,00 + 10 * 4,54 + 30 * 11,33 + (55 - 50) * 12,48) + (29,00 + 10 * 4,54 + 30 * 11,33 + (55 - 50) * 12,48) = R$ 953,40 <br />
As funcionalidades acima deverão ser implementadas em um único arquivo Java e deverão ser acessadas a partir de um menu textual contendo opções de 1 a 7, onde cada número corresponde a cada uma das funcionalidades acima e a opção 7 deve ser usada para sair do programa. Após a execução de cada funcionalidade, o menu de opções deve ser reapresentado.
