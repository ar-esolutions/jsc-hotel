# Esolutions
## Java Starters Challenge - "_Have a_ nice day Hotel"

PB --> Lobby/Restaurant
1-n habitaciones


### Requerimiento 1
#### GET () -> nro huesped
Un prestigioso hotel que acaba de inaugurarse, se jacta de tener infinita capacidad para húespedes.
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
Con el objetivo de aumentar las ventas, el director del hotel, va a lanzar una nueva campaña para que los huéspedes puedan realizar una reserva mediante la página web del hotel.

Para realizar la reserva, el cliente debe seleccionar _la fecha de entrada_, _la de salida_ y _la habitación_.

Según las fechas de entrada y salida y tipo de habitación el director definió las siguientes reglas:

| Tipo/Fecha    | Lun-Jue   | Vie-Dom   |
| ---           | ---       | ---       |
| **Estandar**  | $150,99   | $191,99   |
| **Suite**     | $187,99   | $202,99   |

En caso de que la habitación esté ocupada, la reserva no se podrá realizar.

#### Ejemplo
_Entrada_: 03/10/2018  
_Salida_: 19/10/2018  
_Tipo habitación_: Estandar

Lun-Jue: 03/10, 04/10, 08/10, 09/10, 10/10, 11/10, 15/10, 16/10, 17/10, 18/10  
> Lun-Jue: 10 * $150,99 = 1.509,90

Vie-Dom: 05/10, 06/10, 07/10, 12/10, 13/10, 14/10    
> Vie-Dom: 6 * $191,99 = 1.151,94  
> Total: $2661,84

#### Endpoint POST /book
##### Request
````json
{
  "check-in": "2018-10-03",
  "check-out": "2018-10-19",
  "kind": "ESTANDAR"
}
````
##### Response
````json
{
  "booked": true,
  "price": 2661.84
}
````

### Requerimiento 3
#### GET (piso, habitacion) -> MAX(cant 0)  
@Nico - Count 0 (nro de habitacion?)

### Requerimiento 4
#### GET (piso, habitacion) --> Pwd habitacion
@Nico - Alpacas

### Requerimiento 5
#### GET () -> Top 10
Top 10 repetidos
