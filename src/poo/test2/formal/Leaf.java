package poo.test2.formal;

public class Leaf {
    private final char form;
    private static final char[] formTypes = {'*', '#', '$', '@'};

    public Leaf(char form) {
        this.form = form;
    }

    public char getForm() {
        return form;
    }

    public static char getFormType() {
        return formTypes[(int) (Math.random() * (formTypes.length - 1))];
    }
}
