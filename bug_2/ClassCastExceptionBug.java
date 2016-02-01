package bug_2;

import java.io.IOException;

public class ClassCastExceptionBug {

    public static void main(String[] args) throws IOException {

        A b = new B();

        System.out.println(((B)b).a);


        System.out.println(b.a);
    }
}

//////////////////////////////////////////////////////////////////////////////

class A {

    int a = 10;

    public void doSomething() {
        System.out.println("class A");
    }
}

//////////////////////////////////////////////////////////////////////////////

class B extends A {

    int a = 20;

    public void doSomething() {
        System.out.println("class B");
    }
}

