package collection;

import java.util.*;

public class CollectionCheck {

      public static Collection<Element> checkElements(Collection<Element> sourceList) {
        Set<Element> elementSet = new HashSet<>();
        if (sourceList==null){
            throw new IllegalArgumentException();

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
