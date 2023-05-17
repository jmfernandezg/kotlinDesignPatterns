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

-

### Proxy

-

## Tema 4: Patrones de Comportamiento

### Observer

-

### Chain of Responsibility

-

### Command

-

### Strategy

-

### State

-

### Visitor

-

### Mediator

-

### Memento

-
