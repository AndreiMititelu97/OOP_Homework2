import poo.test2.Pine;
import poo.test2.formal.Tree;


public class Tests {
    public static void main(String[] args) {
        Tree[] trees = new Tree[6];
        TestsUtil.generatePines(trees);

        TestsUtil.printTrees(trees);

        TestsUtil.sort(trees);
        Tree biggestTree = trees[trees.length - 1];

        biggestTree.display();

        System.out.print("Difference between biggest and second biggest tree: ");
        Tree secondBiggestTree = trees[trees.length - 2];
        System.out.println(((Pine) biggestTree).numberOfLeaves() - ((Pine) secondBiggestTree).numberOfLeaves());

        int biggestTreeIndex = TestsUtil.findBiggestTreeIndex(trees, biggestTree);
        System.out.println("Biggest tree info: Index: " + biggestTreeIndex + ", " + biggestTree);
    }
}
