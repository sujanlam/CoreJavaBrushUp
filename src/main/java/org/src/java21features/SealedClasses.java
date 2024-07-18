package org.src.java21features;

sealed class A permits B, C {

}

sealed class B extends A permits D {

}

final class C extends A {

}

non-sealed class D extends B {

}

public class SealedClasses {
}
