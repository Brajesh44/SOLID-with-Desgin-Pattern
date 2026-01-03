# Strategy + Observer design pattern combination

### Strategy design pattern
Strategy design pattern is behavioral design pattern.

### GoF Definition:

“Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.”

### <mark>what is meaning of family algorithms <mark>
Same task(goal) but different implementation  and only one implementation is used at a time .

1️⃣ What does “Family of Algorithms” REALLY mean?

It does NOT mean math algorithms.

It means:

A group of interchangeable behaviors that solve the SAME problem in DIFFERENT ways

Formally:

1. Same goal
2. Same interface
3. Different implementation
4. Chosen at runtime

2️⃣ Where is the “Family of Algorithms” in YOUR CODE?
🔑 This interface defines the FAMILY
public interface NotificationStrategy {
void send(String message, Customers customer);
}


This line creates the family boundary.

🔑 Each implementation is ONE algorithm in the family
```java
public class EmailNotification implements NotificationStrategy

public class SmsNotification implements NotificationStrategy


So the family is:

NotificationStrategy family
├── EmailNotification   (algorithm 1)
├── SmsNotification     (algorithm 2)
└── (Future) WhatsAppNotification


✔ SAME method
✔ SAME purpose (send notification)
✔ DIFFERENT internal logic

👉 This is exactly “family of algorithms”
```

###  <mark>❓ Why NOT if-else? (Why Strategy Pattern)<mark>
````java

1️⃣ Short Interview Answer (Use This First)

“Because if-else tightly couples behavior selection with behavior implementation, violating Open–Closed Principle and making the system hard to extend, test, and maintain. Strategy removes this coupling.”

This alone is a strong answer.

2️⃣ What Is the REAL Problem with if-else?
Example (Without Strategy)
if (type == EMAIL) {
    sendEmail();
} else if (type == SMS) {
    sendSms();
} else if (type == WHATSAPP) {
    sendWhatsApp();
}


This looks simple — but it creates hidden long-term problems.

3️⃣ Key Problems with if-else (Interview Critical)
❌ 1. Violates Open–Closed Principle (OCP)

Code must be modified for every new behavior

Adding Push Notification:

else if (type == PUSH) {
    sendPush();
}


❗ Existing code changed
❗ Risk of regression
❗ Requires retesting

❌ 2. Tight Coupling

Client knows all implementations

Business logic + decision logic mixed

Client becomes a God class

❌ 3. Hard to Test

Need to test every branch

Mocking is difficult

Coverage becomes misleading

With Strategy:

Test each strategy independently

❌ 4. Poor Readability & Maintainability

After 2–3 years:

if (a && b || c) { }
else if (x && y && z) { }


No one wants to touch it 😅

❌ 5. No Runtime Flexibility

Behavior selection is static

Cannot dynamically compose behaviors

Strategy allows:

List<NotificationStrategy>

4️⃣ How Strategy FIXES These Problems
Strategy Design
NotificationStrategy
├── EmailNotification
├── SmsNotification
├── WhatsAppNotification


Client:

strategy.send(message);

✔ 1. OCP Compliant

Add new strategy → new class

Zero modification to existing code

✔ 2. Loose Coupling

Client depends on interface

No knowledge of concrete classes

3️⃣ HOW BOTH PATTERNS WORK TOGETHER (RUNTIME FLOW)
🔄 Step-by-step sequence
OSProduct availability changes
        ↓
OSProduct.notifyObservers()
        ↓
Customers.update(message)
        ↓
Loop through NotificationStrategy list
        ↓
EmailNotification.send()
SmsNotification.send()