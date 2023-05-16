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

## Tema 2: Patrones de Creación

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
-

### Builder
-

### Lazy Init
-

### Prototype
-

## Tema 3: Patrones Estructurales

### Adapter
-

### Bridge
-

### Fachada
-

### Decorator
-

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

