import poo.test2.Pine;
import poo.test2.formal.Tree;

public class TestsUtil {
    static void generatePines(Tree[] trees) {
        int counter = 0;
        while(counter < trees.length) {
            int crownHeight = (int) (Math.random() * (10 - 2) + 2);
            int age = (int) (Math.random() * (200 - 1) + 1);

            trees[counter] = new Pine(crownHeight, age);
            counter++;
        }
    }

    static void printTrees(Tree[] trees) {
        for(int i = 0; i < trees.length; i++) {
            System.out.print("index: " + i + ", ");
            System.out.println(trees[i].toString());
        }
    }

    static int findBiggestTreeIndex(Tree[] trees, Tree biggestTree) {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i].equals(biggestTree)) {
                return i;
            }
        }
        return -1;
    }

    static void sort (Tree[] trees) {
        for(int i = 0; i < trees.length; i++) {
            for (int j = 0; j < trees.length - 1 - i; j++) {
                if (trees[j].compareWith(trees[j + 1]) > 0) {
                    Tree tempTree = trees[j];
                    trees[j] = trees[j + 1];
                    trees[j + 1] = tempTree;
                }
            }
        }
    }
}
