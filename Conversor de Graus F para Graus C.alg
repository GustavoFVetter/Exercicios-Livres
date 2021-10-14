algoritmo "Conversor de Temperatura, de Farenheit para Celsius"
// Função : Converter Temperaturas de Farenheit para Clesius
// Autor : Gustavo F. Vetter
// Data : 14/10/2021
// Seção de Declarações 
var
farenheit : real
celsius : real

inicio
// Seção de Comandos 

Escreval ("Informe a temperatura em Farenheit")
Leia (farenheit)
celsius <- (farenheit -32) * 0.5555

se (celsius) < 15 entao
   Escreval ("Hoje está", celsius, "ºC e", farenheit, "ºF. Está frio. Levou uma blusa, meu bem?")
senao
     se (celsius) < 28 entao
     Escreval ("Hoje está", celsius, "ºC e", farenheit, "ºF. Está um dia agradável. Aproveite-o bem.")
     senao
     Escreval ("Hoje está", celsius, "ºC e", farenheit, "ºF. Está muito quente. Beba bastante água.")

fimse
fimse

fimalgoritmo
