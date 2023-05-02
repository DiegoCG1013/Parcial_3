# Parcial_3

# Repositorio: https://github.com/DiegoCG1013/Parcial_3

### Implementar un grafo no dirigido que permita cargar puertos y las aristas que conecten dichos
puertos, que permita resolver las siguientes tareas:

> a. cada arista debe tener la distancia que separa dichos puertos; 
>
> b. realizar un barrido en profundidad desde el primer puerto en el grafo; 
>
> c. determinar el camino más corto desde puerto Madero al puerto de Rodas; 
>
> d. determinar el puerto con mayor número de aristas y eliminarlo.

#### MI RESULTADO:

> No entendi muy bien el enunciado, asi que he hecho un grafo representado con una matriz de adyacencia, la cual tiene n2 espacios para n vertices.

* a) Cada espacio del array, si en este existe una arista, este contiene el peso de la arista ('Weight').

* b) Para hacer el 'barrido' he hecho el algoritmo de dijkstra, para que poniendo el punto de inicio del grafo, la funcion devuelva la distancia hasta cada nodo 
de manera que sabemos la distancia entre cualesquiera nodos

* c) Esto supongo que va incluido con lo anterior, suponiendo que el puerto Madero es el nodo 0 y el de rodas es el 1, para encontrar la distancia entre ambos basta con 
sacar la tabla distancias por ejemplo de el puerto madero y la distancia seria la posicion 1 del array.

* d) He hecho un main donde he intentado hacer eso.
