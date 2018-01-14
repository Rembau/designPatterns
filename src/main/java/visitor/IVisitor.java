package visitor;

interface IVisitor {
    public void visit(A a);

    public void visit(B b);
}

class Visitor implements IVisitor {

    public void visit(A a) {
        System.out.println(a);
    }

    public void visit(B b) {
        System.out.println(b);
    }
}

class VisitorV2 implements IVisitor {

    public void visit(A a) {
        System.out.println("v2" + a);
    }

    public void visit(B b) {
        System.out.println("v2" + b);
    }
}

class A {
    void accept(IVisitor v) {
        v.visit(this);
    }
}

class B {
    void accept(IVisitor v) {
        v.visit(this);
    }
}