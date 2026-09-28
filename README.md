# Advanced Java Engineering Lab

> A hands-on journey from advanced Java syntax to JVM-level thinking, concurrency, performance engineering, and production-grade backend development.

![Java](https://img.shields.io/badge/Java-Advanced-orange?style=for-the-badge\&logo=openjdk)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-purple?style=for-the-badge\&logo=intellijidea)
![Status](https://img.shields.io/badge/Status-In%20Progress-blue?style=for-the-badge)

---

## Why This Repository Exists

Knowing Java syntax is not the same thing as understanding Java.

This repository is my practical laboratory for learning the deeper parts of Java that matter when building backend systems:

* Type systems
* Functional programming
* Data processing
* Concurrency
* I/O
* JVM internals
* Memory management
* Networking
* Performance
* Design patterns
* Framework internals

The goal is not to memorize APIs.

The goal is to understand **what is happening underneath the API** and learn how to make engineering decisions based on that understanding.

---

# The Journey

```mermaid
flowchart LR

    A[Generics] --> B[Functional Programming]
    B --> C[Streams]
    C --> D[Optional]
    D --> E[Date & Time]
    E --> F[I/O & NIO]
    F --> G[Reflection]
    G --> H[Annotations]
    H --> I[Concurrency]
    I --> J[JVM]
    J --> K[Java Memory Model]
    K --> L[Networking]
    L --> M[JDBC]
    M --> N[Design Patterns]
    N --> O[Modern Java]
    O --> P[Performance]
    P --> Q[Bytecode & Compiler]
    Q --> R[Reactive Programming]
    R --> S[Framework Internals]
    S --> T[Capstone Projects]
```

---

# Engineering Progression

The learning path is designed to move through several levels of understanding.

```text
                    JAVA ENGINEERING
                          │
          ┌───────────────┴───────────────┐
          │                               │
     LANGUAGE LEVEL                 RUNTIME LEVEL
          │                               │
    Generics                         JVM
    Lambdas                          Memory
    Streams                          GC
    Optional                         Bytecode
          │                               │
          └───────────────┬───────────────┘
                          │
                    SYSTEM LEVEL
                          │
                Concurrency
                Networking
                I/O
                Databases
                          │
                          ▼
                  ENGINEERING LEVEL
                          │
              Architecture
              Performance
              Patterns
              Frameworks
                          │
                          ▼
                 PRODUCTION SYSTEMS
```

The objective is to move from:

> **"I know how to use Java."**

to:

> **"I understand why this Java code behaves this way."**

and eventually:

> **"I can reason about the trade-offs of this design in a production system."**

---

# Curriculum

## 01 — Generics

### Status: ✅ Completed

Topics studied:

* Generic classes
* Generic interfaces
* Generic methods
* Multiple type parameters
* Type bounds
* Upper bounds
* Lower bounds
* Wildcards
* PECS
* Type inference
* Generic inheritance
* Raw types
* Type erasure
* Heap pollution
* Generic API design

### Engineering value

Generics teach how to build reusable APIs while preserving compile-time type safety.

Backend relevance:

```java
JpaRepository<User, Long>
```

```java
ResponseEntity<User>
```

```java
List<User>
```

Generics are everywhere in modern Java backend development.

---

# 02 — Functional Programming

### Status: 🔄 Current

Topics:

* Functional interfaces
* `Function<T, R>`
* `Consumer<T>`
* `Supplier<T>`
* `Predicate<T>`
* Lambda expressions
* Method references
* Function composition
* Higher-order functions
* `UnaryOperator`
* `BinaryOperator`
* Capturing variables
* Effectively final variables
* Side effects
* Pure functions
* Immutability
* Referential transparency

### Engineering value

Functional programming changes how you think about behavior.

Instead of only passing:

```text
DATA
```

you can pass:

```text
DATA + BEHAVIOR
```

This becomes extremely important when working with:

* Streams
* Callbacks
* Event processing
* Asynchronous programming
* Spring APIs
* Collections
* Data pipelines

---

# 03 — Stream API

### Status: ⏳ Upcoming

Topics:

* Stream creation
* `map`
* `filter`
* `flatMap`
* `reduce`
* `collect`
* `groupingBy`
* `partitioningBy`
* `distinct`
* `sorted`
* `limit`
* `skip`
* Lazy evaluation
* Intermediate operations
* Terminal operations
* Parallel streams
* Stream performance

### Engineering value

Learn to process collections as data pipelines rather than manually managing loops.

```text
DATA
  ↓
FILTER
  ↓
TRANSFORM
  ↓
GROUP
  ↓
REDUCE
  ↓
RESULT
```

---

# 04 — Optional

Topics:

* `Optional<T>`
* `map`
* `flatMap`
* `filter`
* `orElse`
* `orElseGet`
* `orElseThrow`
* `ifPresent`
* `ifPresentOrElse`
* Optional composition
* Proper API design
* Common Optional mistakes

### Engineering value

Learn how to model the absence of a value explicitly instead of scattering null checks throughout your backend code.

---

# 05 — Date & Time

Topics:

* `LocalDate`
* `LocalTime`
* `LocalDateTime`
* `Instant`
* `ZonedDateTime`
* `ZoneId`
* `Duration`
* `Period`
* Formatting
* Parsing
* Time zones
* UTC
* Database timestamps

### Engineering value

Time bugs are some of the nastiest production bugs.

This module teaches you to reason correctly about:

```text
UTC
  ↓
Instant
  ↓
Time Zone
  ↓
Local Representation
```

---

# 06 — I/O & NIO

Topics:

* Input streams
* Output streams
* Readers
* Writers
* Buffered I/O
* `Path`
* `Files`
* NIO
* Channels
* Buffers
* File traversal
* Memory-mapped files
* File watching
* Large-file processing

### Engineering value

Understand how applications interact with the outside world efficiently.

---

# 07 — Reflection

Topics:

* `Class<T>`
* Runtime type information
* Fields
* Methods
* Constructors
* Dynamic invocation
* Access control
* Reflection performance
* Reflection limitations

### Engineering value

Understand how frameworks discover and manipulate classes at runtime.

---

# 08 — Annotations

Topics:

* Built-in annotations
* Custom annotations
* Retention policies
* Targets
* Runtime annotations
* Annotation processing
* Metadata

### Engineering value

This is the bridge toward understanding how Spring uses annotations such as:

```java
@Component
@Service
@Repository
@Transactional
@Autowired
```

---

# 09 — Concurrency

Topics:

* Threads
* Thread lifecycle
* Race conditions
* Critical sections
* `synchronized`
* Locks
* `ReentrantLock`
* Atomic classes
* Concurrent collections
* `ExecutorService`
* Thread pools
* Futures
* `CompletableFuture`
* Virtual threads
* Deadlocks
* Starvation
* Thread contention

### Engineering value

Backend servers handle many requests simultaneously.

Concurrency determines whether your application:

```text
handles 10 requests
```

or:

```text
handles 10,000 requests
```

without destroying correctness.

---

# 10 — JVM Internals

Topics:

* JVM architecture
* Class loading
* Bytecode
* Heap
* Stack
* Metaspace
* JIT compilation
* Runtime execution
* Object allocation
* Escape analysis
* JVM monitoring

### Engineering value

Stop treating the JVM as a black box.

Start understanding what happens after:

```java
java MyApplication
```

---

# 11 — Java Memory Model

Topics:

* Visibility
* Atomicity
* Ordering
* Happens-before
* `volatile`
* Reordering
* CPU caches
* Cache coherence
* False sharing

### Engineering value

Understand why concurrent code can be incorrect even when it looks logically correct.

---

# 12 — Networking

Topics:

* TCP
* UDP
* Sockets
* Server sockets
* HTTP
* HTTPS
* TLS
* Connection lifecycle
* Blocking vs non-blocking networking

### Engineering value

Understand what actually happens between:

```text
Browser
   ↓
Network
   ↓
Server
   ↓
Spring Boot
   ↓
Controller
```

---

# 13 — JDBC

Topics:

* JDBC architecture
* Connections
* Statements
* Prepared statements
* Result sets
* Transactions
* Connection pools
* Batch operations
* SQL injection prevention

### Engineering value

Understand the database layer beneath Spring Data JPA.

---

# 14 — Design Patterns

Topics:

* Factory
* Builder
* Strategy
* Observer
* Adapter
* Decorator
* Proxy
* Command
* Template Method
* Dependency Injection

### Engineering value

Learn recurring solutions to recurring software design problems.

---

# 15 — Modern Java

Topics:

* Records
* Sealed classes
* Pattern matching
* Switch expressions
* Text blocks
* Enhanced `instanceof`
* Modern collection APIs
* Virtual threads
* Newer JVM features

### Engineering value

Write modern Java rather than writing Java as if it were 2014.

---

# 16 — Performance Engineering

Topics:

* Profiling
* CPU profiling
* Memory profiling
* Allocation analysis
* JMH
* Benchmarking
* Latency
* Throughput
* Garbage collection analysis
* Thread contention
* Database bottlenecks
* Caching

### Engineering value

Learn the difference between:

> "I think this is faster."

and:

> "I measured it, identified the bottleneck, changed it, and measured again."

That distinction matters.

---

# 17 — Bytecode & Compiler Concepts

Topics:

* `.java`
* `.class`
* Bytecode
* JVM instructions
* `javap`
* Compilation
* JIT
* Runtime optimization
* Constant pool

### Engineering value

Understand the transformation:

```text
Java Source
     ↓
Compiler
     ↓
Bytecode
     ↓
JVM
     ↓
JIT
     ↓
Machine Code
```

---

# 18 — Reactive Programming

Topics:

* Reactive streams
* Publishers
* Subscribers
* Backpressure
* Non-blocking pipelines
* Reactor
* WebFlux concepts

### Engineering value

Understand architectures designed for high concurrency and non-blocking workloads.

---

# 19 — Advanced JVM / Native Concepts

Topics:

* Unsafe concepts
* Native memory
* JNI concepts
* Off-heap memory
* Memory layout
* Low-level performance
* JVM diagnostics

### Engineering value

This is where Java starts getting very close to the underlying machine.

---

# 20 — Framework Internals

Topics:

* Dependency injection
* Bean lifecycle
* Proxies
* AOP
* Transaction interception
* Reflection
* Classpath scanning
* Auto-configuration
* Application context

### Engineering value

Instead of memorizing:

```java
@Service
@Transactional
@Autowired
```

understand what the framework actually does with them.

---

# 21 — Capstone Projects

Everything eventually has to leave the textbook.

Projects will combine:

```text
Java
 +
Concurrency
 +
I/O
 +
Networking
 +
Database
 +
Performance
 +
Design
 +
Testing
```

Possible project categories:

* High-concurrency API
* File processing system
* Job processing engine
* Event-driven backend
* URL shortener
* Distributed task system
* Production-style Spring Boot backend

---

# Learning Method

Every topic follows this cycle:

```text
       CONCEPT
          ↓
    MENTAL MODEL
          ↓
      CODE IT
          ↓
      BREAK IT
          ↓
     DEBUG IT
          ↓
     OPTIMIZE IT
          ↓
    MINI PROJECT
          ↓
   ENGINEERING QUESTIONS
```

The important part is **BREAK IT**.

I don't want this repository to contain only successful programs.

It should contain experiments demonstrating:

* What happens when things go wrong?
* Why do they go wrong?
* What does the compiler detect?
* What only appears at runtime?
* What happens under concurrency?
* What happens when data becomes large?
* What happens when performance matters?

---

# Definition of Mastery

I will not consider a topic complete merely because I can write its syntax.

A topic is complete when I can:

* Explain the underlying concept.
* Implement it without copying.
* Predict its behavior.
* Break it intentionally.
* Debug the failure.
* Explain the trade-offs.
* Identify inappropriate use cases.
* Apply it to a realistic backend problem.

---

# The Goal

The final objective is not simply:

```text
                    "Learn Java"
```

It is:

```text
                 JAVA ENGINEER
                      │
        ┌─────────────┼─────────────┐
        ↓             ↓             ↓
     CORRECT       FAST          SCALABLE
        │             │             │
        └─────────────┼─────────────┘
                      ↓
                PRODUCTION CODE
                      │
                      ↓
              BACKEND ENGINEERING
```

I want to move from:

**syntax → concepts → implementation → runtime → performance → architecture.**

That is the progression this repository documents.

---

## Current Progress

```text
Generics              ████████████████████ 100% ✅
Functional Programming░░░░░░░░░░░░░░░░░░░░   0% 🔄
Streams               ░░░░░░░░░░░░░░░░░░░░   0%
Optional              ░░░░░░░░░░░░░░░░░░░░   0%
Date & Time           ░░░░░░░░░░░░░░░░░░░░   0%
I/O & NIO             ░░░░░░░░░░░░░░░░░░░░   0%
Reflection            ░░░░░░░░░░░░░░░░░░░░   0%
Annotations            ░░░░░░░░░░░░░░░░░░░░   0%
Concurrency           ░░░░░░░░░░░░░░░░░░░░   0%
JVM                   ░░░░░░░░░░░░░░░░░░░░   0%
Memory Model          ░░░░░░░░░░░░░░░░░░░░   0%
Networking            ░░░░░░░░░░░░░░░░░░░░   0%
JDBC                  ░░░░░░░░░░░░░░░░░░░░   0%
Design Patterns       ░░░░░░░░░░░░░░░░░░░░   0%
Modern Java           ░░░░░░░░░░░░░░░░░░░░   0%
Performance           ░░░░░░░░░░░░░░░░░░░░   0%
Bytecode              ░░░░░░░░░░░░░░░░░░░░   0%
Reactive              ░░░░░░░░░░░░░░░░░░░░   0%
JVM / Native          ░░░░░░░░░░░░░░░░░░░░   0%
Framework Internals   ░░░░░░░░░░░░░░░░░░░░   0%
Capstone              ░░░░░░░░░░░░░░░░░░░░   0%
```

---

## Repository Philosophy

> **Don't just make the code work. Understand why it works.**

> **Don't optimize what you haven't measured.**

> **Don't memorize what you can derive.**

> **Don't hide from difficult concepts. Investigate them.**

> **Build. Break. Measure. Understand. Repeat.**
