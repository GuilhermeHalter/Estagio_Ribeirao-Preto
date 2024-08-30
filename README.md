# Questões do Estagio

1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

4) Descubra a lógica e complete o próximo elemento:<br>
a) 1, 3, 5, 7, ___<br>
b) 2, 4, 8, 16, 32, 64, ____<br>
c) 0, 1, 4, 9, 16, 25, 36, ____<br>
d) 4, 16, 36, 64, ____<br>
e) 1, 1, 2, 3, 5, 8, ____<br>
f) 2,10, 12, 16, 17, 18, 19, ____


5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

--------

## Respostas

1) Resposta no Exercicio01 -> Fibonacci.java
2) Resposta no Exercicio02 -> VerificarString.java
3) Resposta no Exercicio03 -> ValorSoma.java   /  SOMA = 55
4) a) 1, 3, 5, 7, 9, 11, 13<br>
b) 2, 4, 8, 16, 32, 64, 128, 256, 512<br>
c) 0, 1, 4, 9, 16, 25, 36, 49, 64, 81 <br>
d) 4, 16, 36, 64, 100, 144, 196<br>
e) 1, 1, 2, 3, 5, 8, 13, 21, 34<br>
f) 2,10, 12, 16, 17, 18, 19, 20, 23, 25

5)Ligue o primeiro interruptor por 10 minutos, depois desligue-o e ligue o segundo; ao visitar as salas, a lâmpada acesa é do segundo interruptor, a quente e desligada é do primeiro, e a fria e desligada é do terceiro.
