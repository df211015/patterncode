package com.example.factoryPattern.v2;

public class ConcreteCreator extends Creator {
    /**
     * 建造一个Product的实例
     * T extends Product, 泛型T即为Product本身或继承至Product的实例对像
     *
     * @param c
     * @param <T>
     * @return
     */
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //todo
        }

        return (T) product;
    }
}
