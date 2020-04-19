package kr.co.fastcampus.cli.DI;

public class A {
    private B b = new B();

    public void print() {
        System.out.println(b.clac());
    }
}
