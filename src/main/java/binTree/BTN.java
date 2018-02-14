package binTree;

public class BTN {

    private int val;
    private  BTN left;
    private   BTN right;

    public BTN(int val){
        setVal(val);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BTN getLeft() {
        return left;
    }

    public void setLeft(BTN left) {
        this.left = left;
    }

    public BTN getRight() {
        return right;
    }

    public void setRight(BTN right) {
        this.right = right;
    }


}
