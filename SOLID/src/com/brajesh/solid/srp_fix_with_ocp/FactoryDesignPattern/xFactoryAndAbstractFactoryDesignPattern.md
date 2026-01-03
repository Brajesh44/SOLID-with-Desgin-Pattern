# Factory + Abstract Factory Design Pattern

## Factory design pattern — Object Creation Variation

**“Factory Pattern is a creational pattern because it abstracts and centralizes object creation,
decoupling clients from concrete implementations.”**

***“Factory Pattern encapsulates object creation logic and 
returns objects through a common interface, 
allowing the system to be open for extension while closed for modification.”***

What it solves

Object creation is complex

Many implementations exist

Client should not use new

✅ Key Points (Remember These)

Focus: Object creation

Changes WHAT object is created

Hides new

Creation happens before usage

Centralizes instantiation logic

## Abstract Factory design pattern — Family of Objects Variation

**“Abstract Factory is a creational pattern because 
it encapsulates the creation of multiple related objects
while hiding their concrete classes from the client.”**

_**Abstract Factory provides an interface to create families of related or 
dependent objects without specifying their concrete classes.**_

What it solves

Multiple related objects

Objects must work together

Platform / vendor / theme consistency

✅ Key Points (Remember These)

Focus: Object families

Changes WHAT SET of objects is created

Factory of factories

Ensures compatibility

Used in frameworks & SDKs


## Strategy Pattern — Behavior Variation
“Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently of clients that use it.”

🏭 FACTORY vs 🏭🏭 ABSTRACT FACTORY vs STRATEGY 

🔑 ONE-LINE MEMORY RULE (READ THIS FIRST)
1. **Factory         → WHAT to create**
2. **AbstractFactory → WHAT SET to create**
3. **Strategy        → HOW to do**

Keep this line in mind while reading everything below.