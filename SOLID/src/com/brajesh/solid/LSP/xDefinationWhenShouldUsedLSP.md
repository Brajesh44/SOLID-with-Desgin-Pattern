Official Definition (MUST remember for interview)

“Objects of a superclass should be replaceable with objects of its subclasses without breaking the correctness of the program.”
— Barbara Liskov
🧠 Simple Meaning (Plain English)

If class B extends class A, then:

-> Wherever A is expected

-> You should be able to use B

-> Without unexpected behavior or errors
class Bird {
void fly() {
System.out.println("Bird is flying");
}
}
class Ostrich extends Bird {
@Override
void fly() {
throw new UnsupportedOperationException("Ostrich cannot fly");
}
}
public class Client {
public static void makeBirdFly(Bird bird) {
bird.fly();   // client expects ALL birds to fly
}
public static void main(String[] args) {
Bird sparrow = new Bird();
Bird ostrich = new Ostrich();

        makeBirdFly(sparrow);   // ✅ works
        makeBirdFly(ostrich);   // ❌ runtime exception
    }
}
Here:

Bird is expected

Ostrich is used

❌ Program crashes → unexpected behavior   makeBirdFly(ostrich);   // ❌ runtime exception

👉 LSP is violated
✅ Correct LSP-Compliant Design (FIX)


