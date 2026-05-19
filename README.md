# Juego de Lucha - Patrones de Diseno

![Java CI](https://github.com/Sebasu187/juego-lucha-patrones/actions/workflows/ci.yml/badge.svg)

## Descripcion
Juego de lucha por turnos en Java, implementando patrones de diseno creacionales y estructurales.

## Patrones Implementados
- **Factory Method**: Crea diferentes tipos de personajes (Guerrero, Mago)
- **Decorator**: Agrega armas y habilidades a los personajes (Espada Magica)

## Estructura del Proyecto

    src/
    main/java/com/juego/
        model/          -> Personaje, Guerrero, Mago
        patrones/
            factory/    -> PersonajeFactory
            decorator/  -> PersonajeDecorador, PersonajeConEspada
        juego/          -> JuegoLucha
    test/java/com/juego/
        model/          -> PersonajeTest, PersonajeFactoryTest, DecoratorTest

## Como correr el juego

### 1. Clonar el repositorio
    git clone https://github.com/Sebasu187/juego-lucha-patrones.git
    cd juego-lucha-patrones

### 2. Compilar
    mvn clean compile

### 3. Correr el juego
    mvn exec:java -Dexec.mainClass="com.juego.juego.JuegoLucha"

### 4. Ejemplo de uso
    Tipo del jugador 1 (guerrero/mago): guerrero
    Nombre del jugador 1: Thor
    Tipo del jugador 2 (guerrero/mago): mago
    Nombre del jugador 2: Gandalf

    === LA PELEA COMIENZA ===
    Thor VS Gandalf
    Thor [Guerrero] golpea a Gandalf causando 22 puntos.
    Thor causa +10 puntos extra con su Espada Magica!
    ...
    Gandalf ha ganado la pelea!

## Como ejecutar las pruebas
    mvn clean test

## Reporte de cobertura
    mvn jacoco:report

El reporte queda en target/site/jacoco/index.html

## Tecnologias usadas
- Java 17
- Maven
- JUnit 5
- Mockito
- JaCoCo
- GitHub Actions
