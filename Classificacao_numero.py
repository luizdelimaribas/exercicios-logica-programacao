# um algoritmo que leia uma lista de números e classifique-os em ordem crescente.
lista = []

while True:
    entrada = input("Digite um numero ou stop para encerrar: \n")
    if entrada.lower() == "stop":
        break
    try:
        numero = int (entrada)
    
    except ValueError:
       print("Por favor, digite um número inteiro válido.\n")
       continue
      
    lista.append(numero)
    
print("\nOs numeros são: ")
print(lista)    
