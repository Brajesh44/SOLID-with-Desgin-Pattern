
Official Definition (Interview Standard)

# ****[“Clients should not be forced to depend upon interfaces that they do not use.”]()**

**
🎯 Interview-Ready Answer

**___****[Interface Segregation Principle is used to prevent fat interfaces by splitting them into smaller,
role-specific interfaces so that clients depend only on what they actually use.
]()****___**

🤔 WHY Interface Segregation Principle is Used

1️⃣ To avoid fat (bloated) interfaces

A single interface with many unrelated methods causes:

Forced implementation of unused methods

Dummy / empty methods

Runtime exceptions

Tight coupling

❌ Problem Without ISP (Bad Design)

```java
interface Bird {
    void fly();
    void eat();
    void swim();
}

class Ostrich implements Bird {
    public void fly() { 
        throw new UnsupportedOperationException(); // ❌
    }
    public void eat() {}
    public void swim() {
        throw new UnsupportedOperationException(); // ❌
    }
}

```
 **🚨Problems**


Forced behavior

LSP violation

Runtime failures

2️⃣ To support safe substitution (LSP)

* 🟢 <mark>**ISP helps LSP by**:</mark>
1. Ensuring classes only implement what they can actually do
2. Preventing fake or broken behavior

3️⃣ To reduce impact of change

If interface changes:

Fewer classes break

Easier maintenance

Better backward compatibility

✅ WHEN to Use Interface Segregation Principle
✔ Use ISP when:
[
🔹 Interface has too many methods
🔹 Some implementations don’t need all methods
🔹 You see UnsupportedOperationException
🔹 You add empty method bodies
🔹 Different clients use different subsets]()
