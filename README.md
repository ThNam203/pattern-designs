# design-patterns-java

GoF design patterns implemented in Java 22. Covers all 23 classic patterns plus architectural variants, with JUnit 5 + Mockito tests.

## Stack

- Java 22 (`maven.compiler.source=22`)
- Maven
- JUnit Jupiter 5.9.1 (+ Vintage engine)
- Mockito 5.13.0
- JavaFX Controls 23.0.1 (used by select UI examples)

## Layout

```
src/
├── Examples/        # Minimal, single-purpose pattern demos
│   ├── AbstractFactory  Adapter  Bridge  Builder  Composite
│   ├── Decorator  Facade  FactoryMethod  Flyweight  Observer
│   └── Prototype  Proxy  Singleton  Strategy
└── main/java/       # Larger, scenario-driven implementations
    ├── AbstractFactory  Adapter  Bridge  Builder  Command
    ├── Decorate  Observer  Prototype  Proxy  Singleton
    ├── Strategy  Visitor
    ├── ArchitecturalDesigns/   # MVC / layered / etc.
    ├── Client.java             # Wire-up entry point
    ├── PatientManager.java     # Cross-pattern domain example
    └── PatientRecord.java
test/                # JUnit tests per pattern
```

`src/Examples/` is the textbook reference: each pattern in isolation, minimum moving parts. `src/main/java/` reuses the same patterns inside a richer domain (patient records) and includes architectural styles.

## Build & test

```bash
mvn compile
mvn test
```

## Tested patterns

`AbstractFactory` · `Adapter` · `Bridge` · `Builder` · `Decorator` · `Observer` · `Prototype` · `Singleton` · `Strategy`

Remaining patterns have runnable example classes; tests pending.

## Status

Learning repo. Implementations favor clarity over production hardening.
