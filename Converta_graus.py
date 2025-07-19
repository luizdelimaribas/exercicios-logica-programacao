#Escreva um algoritmo que converta graus Celsius para Fahrenheit e vice-versa.

graus = float (input(" Quantos graus :"))

convercao = int(input("Qual converção vôce quer  1-Celsius ou 2-Fahrenheit : "))
if convercao == 1:
    celsius = (graus - 32) * 5/9
    print(f"A temperatura esta {celsius} graus Celsius\n")
if convercao == 2:
    fahrenheit =   (graus * 9/5) + 32
    print(f"A temperatura esta {fahrenheit} graus Fahrenheit\n")