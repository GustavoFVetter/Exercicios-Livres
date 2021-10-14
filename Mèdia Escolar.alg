algoritmo "Entrega de Boletim Escolar"
// Função : Apresentar resultado do rendimento escolar anual
// Autor : Gustavo F. Vetter
// Data : 11/10/2021
// Seção de Declarações 
var
media, desista, reprovado, emexame, aprovado, aprovadissimo : real
inicio
// Seção de Comandos 
// desista <- 3
// reprovado <- 5
// emexame <- 7
// aprovado <- 9.8
// aprovadissimo <- 10

Escreval ("Escreva sua média: ")
Leia (media)

se media <3 entao
   Escreval ("Desista de estudar. Não tire a vaga de quem quer estudar.")
senao
     se media <5 entao
     Escreval("Você foi reprovado.")
senao
     se media <7 entao
     Escreval ("Você está em exame. Estude para passar de ano.")
senao
     se media <=9.8 entao
     Escreval ("Você está aprovado. Boas Férias.")
senao
     se media >= 9.9 entao
     Escreval ("Você foi aprovado com excelente desempenho. PARABÉNS!!!")
fimse
fimse
fimse
fimse
fimse

fimalgoritmo
