package binTree;

public class BinTreeCompare {

    public static boolean compareBinTree(BTN tree1, BTN tree2){
        if (tree1 == null && tree2 == null){
            return true;
        }
        if(tree1 != null && tree2 != null) {

            return ((tree1.getVal() == tree2.getVal())
                    && compareBinTree(tree1.getLeft(), tree2.getLeft())
                    && compareBinTree(tree1.getRight(), tree2.getRight()));
        }
        return false;
    }
}
