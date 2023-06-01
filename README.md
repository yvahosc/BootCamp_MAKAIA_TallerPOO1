# Taller POO 1
## Desarrollo del primer taller de programación orientada a objetos dentro del desarrollo del BootCamp de desarrollo web BackEnd de MAKAIA. Cuyos puntos a desarrollar son:

## 1. Crea una clase llamada "Carro" que represente un automóvil. La clase debe tener los siguientes requisitos:
### Atributos:
  * marca: una cadena de caracteres que representa la marca del carro.
  * modelo: una cadena de caracteres que representa el modelo del carro.
  * anio: un número entero que indica el año de fabricación del carro.
  * color: una cadena de caracteres que especifica el color del carro.

### Constructor:
  Un constructor de la clase que reciba los siguientes parámetros:
    * marca: la marca del carro.
    * modelo: el modelo del carro.
    * anio: el año de fabricación del carro.
    * color: el color del carro.
    
### Métodos:
  * acelerar(): un método que imprima un mensaje indicando que el carro está acelerando.
  * frenar(): un método que imprima un mensaje indicando que el carro está frenando.
  * girar(String direccion): un método que reciba un parámetro de tipo cadena de caracteres que indique la dirección a la que el carro está girando, y que imprima un mensaje correspondiente.
  * mostrarInformacion(): un método que imprima la información del carro, mostrando la marca, el modelo, el año y el color.
  * Ademas de esto agregale todos sus getters y setters

### Implementación:
  Implementa la clase "Carro" de acuerdo a los requisitos mencionados. Luego, en el método main, crea al menos dos instancias de la clase "Carro" con diferentes parámetros y realiza las siguientes acciones:
  * Llama a los métodos acelerar(), frenar() y girar() en cada instancia.
  * Llama al método mostrarInformacion() para mostrar la información de cada carro en la consola.

## 2. Crea una clase llamada "EquipoFutbol" que represente un equipo de fútbol. La clase debe tener los siguientes requisitos:
### Atributos:
  * nombre: una cadena de caracteres que representa el nombre del equipo.
  * ciudad: una cadena de caracteres que indica la ciudad de origen del equipo.
  * jugadores: un arreglo o lista de objetos de la clase "Jugador" que representan los jugadores del equipo.

### Constructor:
  Un constructor de la clase que reciba los siguientes parámetros:
    * nombre: el nombre del equipo.
    * ciudad: la ciudad de origen del equipo.
    * jugadores: un arreglo o lista de objetos de la clase "Jugador" que representan los jugadores del equipo.
    
### Métodos:
  * agregarJugador(Jugador jugador): un método que reciba un objeto de la clase "Jugador" y lo agregue al arreglo o lista de jugadores del equipo.
  * mostrarInformacion(): un método que imprima la información del equipo, mostrando el nombre, la ciudad y la lista de jugadores.
  * Ademas de esto agregale todos sus getters y setters

### Implementación:
  Implementa la clase "EquipoFutbol" de acuerdo a los requisitos mencionados. Luego, en el método main, crea una instancia de la clase "EquipoFutbol" y realiza las siguientes acciones:
  * Crea varios objetos de la clase "Jugador" con diferentes atributos.
  * Utiliza el método agregarJugador() para agregar los jugadores al equipo.
  * Llama al método mostrarInformacion() para mostrar la información del equipo en la consola.

## A cada punto hazle su diagrama uml.
