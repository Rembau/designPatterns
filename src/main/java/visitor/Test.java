package visitor;

public class Test {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();

        a.accept(new VisitorV2());
        b.accept(new VisitorV2());
    }
}
