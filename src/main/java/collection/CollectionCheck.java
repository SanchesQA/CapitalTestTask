package collection;

import java.util.*;

public class CollectionCheck {

      public static Collection<Element> checkElements(Collection<Element> sourceList) {
        Set<Element> elementSet = new HashSet<>();
        if (sourceList==null){
            System.out.println("Collection is null");
        }
        for (Element element : sourceList) {
            if (element.age() > 20) {
                elementSet.add(element);
            }
        }
        List<Element> resultList = new ArrayList<>();
        resultList.addAll(elementSet);
        return resultList;
    }
}
