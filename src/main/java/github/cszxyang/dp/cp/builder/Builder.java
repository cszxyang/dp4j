package github.cszxyang.dp.cp.builder;

public abstract class Builder {

    protected Product product;

    public Builder() {
    }

    public Builder(Product product) {
        this.product = product;
    }

    abstract void buildPartA();

    abstract void buildPartB();

    abstract void buildPartC();

    abstract void buildPartD();

    public Product getProduct() {
        return product;
    }
}
