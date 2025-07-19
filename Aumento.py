#um algoritmo que leia um valor de salario e mostre-o com um aumento em porcetagem

salario = float(input("\nQual o salario: \n"))

aumento_porcetagem = float(input("\nqual a porcetangem do aumento do salario: \n"))

aumento = salario * aumento_porcetagem / 100

novo_salario = aumento + salario

print(f"\nSeu novo salario vai ser: \nR${novo_salario}")