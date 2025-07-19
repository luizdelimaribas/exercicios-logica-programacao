#pedir uma lista de numeros interos e verificar qual é o maior e o menor
maior = None
menor = None
lista = []

while True:
    entrada = input("\nDigite os numneros ou stop para finalizar: \n")
 
    if entrada.lower() == "stop":
      break
     
 
    try :
      numero = int(entrada)
      
    except ValueError:
       print("Por favor, digite um número inteiro válido.\n")
       continue
    
 
    lista.append(numero)

    if maior is None or numero > maior:
            maior = numero    
            
    if menor is None or numero < menor:
            menor = numero   
                       
           
      
if lista:
   print(f"\nO maior numero é: {maior}")
   print(f"\nO menor numero é: {menor}")
else:
      print("\nNenhum numero digitado")              


     
 
