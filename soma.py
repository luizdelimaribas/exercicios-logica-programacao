
numero1 = int(input("digite o primeiro número: "))
numero2 = int(input("digite o segundo número: "))

soma = numero1 + numero2
menos = numero1 - numero2
divisao = numero1 / numero2
multiplicacao = numero1 * numero2

operacao = input("Digite a operação desejada (soma, menos, divisao, multiplicacao): ")
if operacao == "soma":
         print("A soma dos números é:", soma)
elif operacao == "menos":
         print("A subtração dos números é:", menos)
elif operacao == "divisao":
         print("A divisão dos números é:", divisao)
elif operacao == "multiplicacao":
         print("A multiplicação dos números é:", multiplicacao)
else:
         print("Operação inválida.")
         
         