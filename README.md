# Esolutions
## Java Starters Challenge - "_Have a_ nice day Hotel"

PB --> Lobby/Restaurant
1-n habitaciones


### Requerimiento 1
#### GET () -> nro huesped
EDEN es un prestigioso hotel que acaba de inaugurarse, se jacta de tener infinita capacidad para húespedes.
 El hotel tiene un número infinito de pisos, los cuales tienen un número infinito de habitaciones individuales (sólo puede haber un húesped por habitación)
 Para mantener un orden en la asignación de habitaciones, el conserje confeccionó un sistema de asignación de habitaciones. El conserje decidió que cada húesped debe alojarse en la primer habitación libre del piso más bajo que cumpla estas condiciones:

 1) El piso está vacío
O 2) El piso NO está vacío, y se cumple que la sumatoria de el número del último húesped alojado, más el número del nuevo húesped es un cuadrado perfecto, es decir, su raíz cuadrada da como resultado un número entero. (si el nuevo húesped es el número m, y el alojado en la última habitación de ese piso, es n, entonces n+m es un cuadrado perfecto)

 Ejemplo :
   - El primer húesped en alojarse consigue la habitación 1 en el 1er piso, ya que el piso 1 está vacío.
   - El huésped número 2, no puede alojarse en la habitación 2 del piso 1 ya que  1 + 2 = 3 , y no es un cuadrado perfecto, entonces el húesped 2 consigue la habitación 1 en el piso 2, ya que el piso 2 está vacío.
   - El húesped número 3, consigue la habitación  2 en el piso 1 ya que 1 + 3 = 4 , y es un cuadrado perfecto.
   - El huésped número 4, no puede ir al piso 1, ya que 3+4=7 no es un cuadrado perfecto. El huésped 4 tampoco puede ir al piso 2, ya que 2+4=6 y no es un cuadrado perfecto. En consecuencia, el huésped 4 va a la habitación 1 del piso 3 porque esté vacío. 

 La apertura del hotel fue un éxito, y en su día de apertura, el hotel recibió a 5000 húespedes.
 Desafortunadamente, el conserje recibe una llamada de la habitación 11 del piso 60, de un húesped quejándose de que en su habitación el aire acondicionado no funciona.
 El conserje debe buscar en su sistema el número de húesped, para registrar el incidente.
 
### Requerimiento 2
#### POST
@Piano - Polimorfismo

### Requerimiento 3
El hotel cuenta con un excelente servicio de internet, y para evitar congestiones, cada habitación cuenta con su propia red WiFi.

El técnico del hotel ha desarrollado una ingenioso sistema para definir el nombre de red de cada habitación. Para obtener el nombre correcto, a partir de la combinación de las representaciones binarias del número de piso y el numero de habitación, se debe identificar la secuencia más larga de ceros que comienza y termina con un 1.
Así, el nombre de la red se define como **Eden-P-H-C**, dónde:
 * P = Número de piso
 * H = Número de habitación
 * C = La cantidad de ceros en la secuencia más larga obtenida.

Cabe aclarar que en caso de no haber ninguna secuencia del tipo, el nombre de red se compone como **Eden-P-H**

> **Limitación**: Tanto para  el número de piso como de habitación, se concidera los numeros enteros sin ceros por delante (Ejemplo: Habitacion 01, piso 05 no son valores correctos)

#### Ejemplo 1
Dado el piso **216** y la habitación **5**, obtenemos la combinación binaria **11011000101**.
Dentro de la misma, obtenemos las secuencias **_101_**, **_1001_**, **_10001_**
Dado que la secuencia más larga cotinene 3 ceros, el nombre de red será **_Eden-216-5-3_**.

#### Ejemplo 2
Dado el piso **7** y la habitación **6**, obtenemos la combinación binaria **111110**.
Dentro de la misma, no existen secuencias válidas, por lo que el nombre de red será **_Eden-7-6_**.

Se solicita desarrollar la lógica asociada a la definición del nombre de red.

##### Endpoint _GET_ /floor/{floor}/room/{room}/wifi/ssid
````json
{
    "floor": 216, 
    "room": 5, 
    "ssid": "Eden-216-5"
}
````

### Requerimiento 4
Tal como lo hizo para el nombre de red, el conserje también definió un sistema para el armado de la contraseña.
Partiendo de la letra **E**, la secuencia que describe la complejidad de la contraseña puede generarse aplicando N veces el siguiente conjunto de reglas en forma simultanea:
* Reemplazar cada ocurrencia de la letra **E** por **ED**
* Reemplazar cada ocurrencia de la letra **D** por **EN**
* Reemplazar cada ocurrencia de la letra **N** por **ND**

**N** se obtiene de la sumatoria dle numero de piso y habitación.

Una vez obtenida la secuencia, la contraseña se compondrá como "Eden-P-H-C" dónde:
* P = Número de piso
* H = Número de habitación
* C = La cantidad de veces que la palabra "EDEN" aparece sobre la secuencia.
 
> **Limitación**: Tanto para  el número de piso como de habitación, se concidera los numeros enteros sin ceros por delante (Ejemplo: Habitacion 01, piso 05 no son valores correctos)
 
#### Ejemplo 1
Dado el piso **1** y la habitación **2**, obtenemos **N=3**.
La secuencia entonces será:

| Iteración | Salida |
| :---: | :---------: |
| 0 | E |
| 1 | ED |
| 2 | EDEN |
| 3 | EDENEDND |

Dada una sola ocurrencia de la palabra EDEN, la contraseña de red será **_Eden-1-2-1_**.
 
 #### Ejemplo 2
Dado el piso **4** y la habitación **2**, obtenemos **N=6**.
 La secuencia entonces será:
    
| Iteración | Salida |
| :---: | :---------: |
| 0 | E |
| 1 | ED |
| 2 | EDEN |
| 3 | EDENEDND |
| 4 | EDENEDNDEDENNDED|
| 5 | EDENEDNDEDENNDENEDENEDNDNDENEDEN|
| 6 | EDENEDNDEDENNDENEDENEDNDNDENEDNDEDENEDNDEDENNDENNDENEDNDEDENEDND|

Dadas 5 ocurrencias de la palabra EDEN, la contraseña de red será **_Eden-4-2-5_**.
  
 Se solicita desarrollar la lógica asociada a la definición de la contraseña de red.
 
 ##### Endpoint _GET_ /floor/{floor}/room/{room}/wifi/password
 ````json
 {
     "floor": 4, 
     "room": 2, 
     "password": "Eden-4-2-6"
 }
 ````

### Requerimiento 5
#### GET () -> Top 10
Top 10 repetidos
