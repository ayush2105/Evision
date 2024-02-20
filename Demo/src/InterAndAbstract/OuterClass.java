package InterAndAbstract;

public class OuterClass {
    private int outerField;


    interface NestedInterface {
        void nestedMethod();
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        NestedInterface nestedObject = new NestedInterface() {
            @Override
            public void nestedMethod() {
                System.out.println("Nested method implementation");
            }
        };

        nestedObject.nestedMethod();
    }
}

