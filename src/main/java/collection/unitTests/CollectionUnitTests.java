package collection.unitTests;

import collection.Element;
import org.testng.Assert;
import org.testng.annotations.Test;
import collection.CollectionCheck;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionUnitTests {

    @Test
    public void numIsDuplicated(){
        Collection<Element> elementList = new ArrayList<>();
        elementList.add(new Element(1,"Anna", 19));
        elementList.add(new Element(1,"James", 22));
        elementList.add(new Element(2,"James", 23));
        CollectionCheck collect = new CollectionCheck();
        collect.checkElements(elementList);

        Collection<Element> expectedElementList = new ArrayList<>();
        expectedElementList.add(new Element(1,"James", 22));
        expectedElementList.add(new Element(2,"James", 23));
        Assert.assertEquals(collect.checkElements(elementList), expectedElementList);

    }

    @Test
    public void numIsDuplicatedAndAgeIsMoreThan20(){
        Collection<Element> elementList = new ArrayList<>();
        elementList.add(new Element(1,"Anna", 19));
        elementList.add(new Element(1,"James", 22));
        elementList.add(new Element(1,"James", 23));
        CollectionCheck collect = new CollectionCheck();
        collect.checkElements(elementList);

        Collection<Element> expectedElementList = new ArrayList<>();
        expectedElementList.add(new Element(1,"James", 22));
        Assert.assertEquals(collect.checkElements(elementList), expectedElementList);

    }




}
