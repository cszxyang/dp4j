package github.cszxyang.dp.cp.builder;

public class ConcreteBuilder extends Builder {

    public ConcreteBuilder() {
        super(new Product());
    }

    public void buildPartA() {
        product.setPartA("ConcreteBuilder-style partA");
    }

    public void buildPartB() {
        product.setPartB("ConcreteBuilder-style partB");
    }

    public void buildPartC() {
        product.setPartC("ConcreteBuilder-style partC");
    }

    public void buildPartD() {
        product.setPartD("ConcreteBuilder-style partD");
    }
}
