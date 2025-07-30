idade = int(input("Qual a idade: "))
nome = str(input("qual o nome: "))

print(" O {} tem a idade de {} anos.".format(nome, idade))

if idade < 18:
     print("E menor de idade " )

else:
     print("E maior de idade " )
