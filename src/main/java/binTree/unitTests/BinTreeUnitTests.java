package binTree.unitTests;

import binTree.BTN;
import binTree.BinTreeCompare;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BinTreeUnitTests {
    @Test
    public void bothAreNull()
    {
        Assert.assertTrue(BinTreeCompare.compareBinTree(null, null));
    }

    @Test
    public void oneIsNull()
    {
        BTN firstBtn = new BTN(1);
        firstBtn.setLeft(new BTN(2));
        firstBtn.setRight(new BTN(3));
        Assert.assertFalse(BinTreeCompare.compareBinTree(firstBtn, null));
    }
    @Test
    public void bothAreEqual(){
        BTN firstBtn = new BTN(1);
        firstBtn.setLeft(new BTN(2));
        firstBtn.setRight(new BTN(3));
        BTN secondBtn = new BTN(1);
        secondBtn.setLeft(new BTN(2));
        secondBtn.setRight(new BTN(3));
        Assert.assertTrue(BinTreeCompare.compareBinTree(firstBtn, secondBtn));
    }

    @Test
    public void differentValuesForWholeTree(){
        BTN firstBtn = new BTN(1);
        firstBtn.setLeft(new BTN(2));
        firstBtn.setRight(new BTN(3));
        BTN secondBtn = new BTN(2);
        secondBtn.setLeft(new BTN(4));
        secondBtn.setRight(new BTN(6));
        Assert.assertFalse(BinTreeCompare.compareBinTree(firstBtn, secondBtn));
    }
    @Test
    public void differentValuesForBothLeafs(){
        BTN firstBtn = new BTN(1);
        firstBtn.setLeft(new BTN(2));
        firstBtn.setRight(new BTN(3));
        BTN secondBtn = new BTN(1);
        secondBtn.setLeft(new BTN(6));
        secondBtn.setRight(new BTN(6));
        Assert.assertFalse(BinTreeCompare.compareBinTree(firstBtn, secondBtn));
    }
    @Test
    public void differentValuesForOneLeaf(){
        BTN firstBtn = new BTN(1);
        firstBtn.setLeft(new BTN(2));
        firstBtn.setRight(new BTN(3));
        BTN secondBtn = new BTN(1);
        secondBtn.setLeft(new BTN(2));
        secondBtn.setRight(new BTN(6));
        Assert.assertFalse(BinTreeCompare.compareBinTree(firstBtn, secondBtn));
    }


}
