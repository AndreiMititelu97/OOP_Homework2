package poo.test2;

import poo.test2.formal.Leaf;
import poo.test2.formal.Tree;

import static poo.test2.formal.Leaf.getFormType;

public class Pine extends Tree {
    private final char[] trunk = {'X', 'X', 'X'};
    private final int crownHeight;
    private final Leaf[] leaves;

    public Pine(int crownHeight, int age) {
        super(age);
        this.crownHeight = crownHeight;
        this.leaves = generateLeaves(crownHeight);
    }

    private Leaf[] generateLeaves(int crownHeight) {
        if (crownHeight < 2) {
            return null;
        }
        Leaf[] leaves = new Leaf[(int)Math.pow(crownHeight, 2)];

        for (int i = 0; i < leaves.length; i++) {
            leaves[i] = new Leaf(getFormType());
        }
        return leaves;
    }

    @Override
    public String toString() {
        return "CrownHeight: " + crownHeight + ", Age: " + this.age + ", Number of leaves: " + leaves.length;
    }

    @Override
    public void display() {
        //Print crown
        int leavesCounter = 0;
        int spaces = 2 * crownHeight - 2;

        for (int level = 0; level < crownHeight; level++) {
            int numberOfLeaves = 2 * level + 1;

            // Print spaces
            StringBuilder row = new StringBuilder();
            for (int i = 0; i < spaces; i++) {
                row.append(" ");
            }
            spaces -= 2;

            //Print leaves
            for (int i = 0; i < numberOfLeaves; i++) {
                row.append(leaves[leavesCounter++].getForm() + " ");
            }
            System.out.println(row);
        }
        //Print trunk
        printTrunk();
    }

    @Override
    public int compareWith(Tree tree) {
        if (tree instanceof Pine) {
            Pine pine = (Pine) tree;
            return this.leaves.length - pine.leaves.length;
        } else {
            throw new RuntimeException("Not a valid tree object");
        }
    }

    private void printTrunk() {
        int spaces = (2 * crownHeight - 1) / 2;

        for (int i = 0; i < trunk.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < spaces; j++) {
                row.append("  ");
            }
            row.append(trunk[i]);
            System.out.println(row);
        }
    }

    public int numberOfLeaves() {
        return leaves.length;
    }
}
