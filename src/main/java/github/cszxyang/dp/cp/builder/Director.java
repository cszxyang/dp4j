package github.cszxyang.dp.cp.builder;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartB();
        builder.buildPartA();
        builder.buildPartC();
        builder.buildPartD();
        return builder.getProduct();
    }
}
