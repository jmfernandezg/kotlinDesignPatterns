# Kotlin Design Patterns

Patrones de diseño para Kotlin

## Tipos de Patrones de Diseño

- Creación
  - Manejan creación de objeto
  - Como se crea una instancia una clase
- Estructural
  - Como los objetos y componentes de la aplicación se relacionan
  - Como se estructura el código para lograr
    - Separación de responsabilidades
    - Escalabilidad
    - Testability
- Comportamiento
  - Como los objetos funcionan dentro del código
  - Como la estrategia afecta la estructura de la app
  - Como los objetos se comunican

---

## Patrones de Creación

### Singleton

- Cuando se necesita solo una instancia de la clase
  - Punto de acceso único (red, bases de datos, etc)
  - Clases de utilería
- Se declara la clase como `object`

```kotlin

object Singleton {
  init {
    // lógica de inicialización
  }
}
```

### Factory

- Provee el acceso a funcionalidad sin preocuparse por la implementación
- Separación de responsabilidades
- Mejora la testability

### Abstract Factory

- Un nivel arriba de factory
- Funcionalidad sin preocuparse de la implementación
- Separación de responsabilidades

### Builder

- Usado cuando se tienen varios parámetros de inicialización
  - Es mejor que hacer un constructor si hay parámetros opcionales
  - 5 parámetros en combinación es mas de 100 constructores
- Usado en Android
  - Kotlin usa parámetros que se pueden referir por nombre

### Lazy Init

- Es usado para el manejo de memoria
- Se evitan tener objetos grandes en memoria si no son utilizados
- Inicializa el recurso cuando es utilizado, no cuando es declarado
- Kotlin tiene dos maneras de hacer inicialización diferida
  - `by lazy` que solo puede ser usado con `val`
  - `lateinit` que solo puede ser usado con `var`

### Prototype

- Permite hacer una copia del objeto
- El objeto provee la funcionalidad de copia

---

## Patrones Estructurales

### Adapter

- Convierte la interfaz de una clase en una que el cliente espera
- Convierte datos de un formato a otro
- Es usado en Android con frecuencia

```mermaid

flowchart LR
  Cliente -->|call| Destino
  Destino --> |call-to-specific|Adaptador
  Adaptador --> |specificCall|Adaptado

```

### Bridge

- Clases con multiples propiedades ortogonales incrementan exponencialmente el arbol de herencia
- Se divide la estructura en varias interfaces o clases
- Se asocian por medio de un puente

```mermaid

flowchart TB
  subgraph puente
  Figura -->Circulo
  Figura -->Cuadrado
  end
  Figura -->|contiene| Color
  Color --> Rojo
  Color --> Azul

```

### Facade

- Provee una interface simple para funcionalidad compleja
- Simplifica la implementacion de clientes

### Decorator

- Pone nuevo comportamiento o funcionalidad a un objeto existe
- Cambia el comportamiento existente
- No se cambia el codigo original

```mermaid

stateDiagram-v2
    state ApiService {
      retrieveAPI
        state NetworkComm {
                sendNetworkMsg
            state TCP/IP {
                sendPacket
            }
        }
    }
```

### Composite

- Compone objetos en estructuras de arbol
- La funcionalidad puede ser representada por un arbol
- Se manipulan los componentes como uno solo

### Proxy

- Provee de funcionalidad antes y/o despues de llamar al objeto
- Similar a facade, excepto que proxy tiene la misma interfaz del backend
- Similar a decorador, excepto que proxy maneja el ciclo de vida de su objeto

```mermaid

flowchart LR
  Cliente1-->|read| Proxy
  Cliente2 -->|read| Proxy
  Cliente3 -->|read| Proxy
  Proxy --> |cache|Disco

```

## Tema 4: Patrones de Comportamiento

### Observer

- Notifica a suscriptores de que un evento ha sucedido
- Notifica a multiples objetos simultaneamente
- Es una relacion uno a muchos 


```mermaid

flowchart TB
  EventGenerador-->|generate| EventManager
  EventManager -->|notify| SuscriberInterface
  Suscriber1 -->|notify| SuscriberInterface
  Suscriber2 -->|notify| SuscriberInterface
  Suscriber3 -->|notify| SuscriberInterface

```

### Chain of Responsibility

- Define una cadena de manejadores para procesar una peticion
- Cada manejador necesita una referencia al siguiente manejador en la cadena
- Cada manejador procesa la peitcion y pasa al siguiente manejador
- Las peticiones pueden ser de diferentes tipos

```mermaid

flowchart LR
  Request --> Handler1
  Handler1 --> Handler2
  Handler2 --> result
 
```

### Command

- Una peticion esta envuelta en un objeto que tiene toda la informacion para procesarla
- El objeto es pasado al manejador correcto, o despachador

### Strategy
 
- Describe un algoritmo que puede ser cambiado en ejecucion
- El objeto contiene la logica algoritmica
- El objeto de contexto puede manejar el objeto algoritmico

```mermaid

flowchart TB
  Cliente --> Ejecutor
  Estrategia1 --> Ejecutor
  Estrategia2 --> Ejecutor
  Estrategia3 --> Ejecutor
 
```

### State

- Un objeto cambia su comportamiento de acuerdo al estado interno
- En cada momento en particular, hay un numero finito de estados 
- El estado puede ser encapsulado en un objeto

### Visitor

-

### Mediator

-

### Memento

-
