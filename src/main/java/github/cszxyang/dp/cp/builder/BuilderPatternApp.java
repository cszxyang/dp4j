package github.cszxyang.dp.cp.builder;

public class BuilderPatternApp {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director  director = new Director();
        director.setBuilder(builder);
        Product product =  director.construct();
        System.out.println(product);
    }
}
