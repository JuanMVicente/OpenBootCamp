
from coche import Coche


def main():
    resultado = suma(1,2,3)
    print(resultado)

    v1 = Coche()
    print(f'Inicialmente el coche tiene {v1.puertas} puertas')
    v1.incrementa_puertas(2)
    print(f'El coche ahora tiene {v1.puertas} puertas')


def suma(a,b,c):
    return a+b+c


if __name__ == "__main__":
    main()