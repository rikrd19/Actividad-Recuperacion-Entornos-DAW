"""
Aqui el codigo es dificil de entender porque usa numeros 'magicos'
y nombres de variables pocos claros
"""


def f(r):
    # No se sabe que es 3.14159 ni que es 'a'
    a = 3.14159 * (r**2)
    return a


"""
Se aplico las tecnicas de 'Sustitucion de numeros magicos por 
constantes' y 'Renombrado de variables'.
"""

PI = 3.14159


def calcular_area_circulo(radio):
    area = PI * (radio**2)
    return area
