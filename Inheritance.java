class Example {

    private int myVariable1;
    private String name;

    public Example(String name) {
        this.name = name;
        myVariable1 = 100;
        printValues();
    }

    public void printValues() {
        String textToPrint = "Values from ExampleClass: "
                + "name=" + name + ",  var1=" + myVariable1;
        System.out.println(textToPrint);
    }
}
class DerivedClass extends Example {

    String typeName = null;

    public DerivedClass(String name, String typeName) {
        super(name);
        this.typeName = typeName;
        printValues();
    }

    public void printValues() {
        super.printValues();
        String typeUpper = typeName.toUpperCase();
        String textToPrint = "Values of DerivedClass: " + " typeName=" + typeUpper;
        System.out.println(textToPrint);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass("A name", "SpecializedType");
        derivedClass.printValues();
    }
} 
