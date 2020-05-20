# Desafio proposto pela Neomind

Desafio de Lógica e Programação
Objetivo: O objetivo desse desafio é demonstrar sua habilidade e conhecimento em lógica de programação. Assim saberemos como você pensa e como resolve problemas cotidianos.

O Problema: Escreva um programa onde, dado um determinado horário, ele seja capaz de calcular o ângulo entre os 2 ponteiros do relógio.

Premissas:

1. Considere:

•          00:00h possui um ângulo de 0

•          00:15h possui um ângulo de 45

•          00:30h possui um ângulo de 180

2. Construtor do método:

public long retornaAnguloRelogio(GregorianCalendar horario);

3. O desafio deve ser entregue escrito em Java ou linguagem natural.

4. Não deverá ser utilizada qualquer biblioteca de terceiros para execução do projeto.

5. Caso tenhas alguma dúvida, tome a decisão que julgar ser a melhor e encaminhe junto com a solução do desafio dizendo qual era sua dúvida, qual foi a decisão tomada e defenda a posição tomada.


# Dúvidas:

Unica duvida foi em relação ao pedido de considerar 45 no angulo das 00:15h sendo que o correto seria um angulo de 90 graus. Considerando o pedido, o programa mostra angulo de 45 gaus quando verifica o horario 00:15h, mesmo não sendo o angulo correto.

# Lógica utilizada:

Comecei separando o relógio em 360 partes, dai cheguei a conclusão que a cada hora o ponteiro da hora "andava" 30 dessas partes e o ponteiro dos minutos "andava" 6 partes por minuto. Diante disso eu criei o algoritimo pedindo a hora e o minuto desejado, verificando e passando esses dados para um objeto da classe GregorianCalendar que era pedido como parametro do método retornaAnguloRelogio. Na classe do relógio eu apenas criei o metodo retornaAnguloRelogio, verificando qual ponteiro tinha "andado mais" baseado na hora e minuto informados e subtraindo o menor do maior para obter a diferença entre os ponteiros, assim retornando o angulo e exibindo ele logo em seguida.
