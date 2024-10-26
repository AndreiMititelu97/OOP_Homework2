package poo.test2.formal;

public abstract class Tree {
    protected int age;

    public Tree(int age) {
        this.age = age;
    }

    public abstract int compareWith(Tree tree);

    public abstract void display();
}
