

def main():

    print(signo(2))
    print(signo(-2))
    print(signo(0))

    contador = 0
    while(contador<3):
        print(contador)
        contador+=1

    '''Lo dejo comentado por limitaciones en el lenguaje Python
    función Java o C
    contador=4
    do{
        contador += 1
        print(contador)
    }while(contador<3)'''

    for contador in range(0,3):
        print(contador)

    print(nombre_estacion(2))
    print(nombre_estacion(0))
    

    
def signo(numero):
    if numero>0:
        return "positivo"
    elif numero<0:
        return "negativo"
    return "cero"

def nombre_estacion(num): # orden de estaciones en España
    estacion = {
        1: "Invieron",
        2: "Primavera",
        3: "Verano",
        4: "Otoño"
    }

    return estacion.get(num, "Numero de estación no válido")



if __name__ == "__main__":
    main()