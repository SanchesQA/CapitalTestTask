package collection;


public class Element {
    private int num;
    private String name;
    private int age;


    public int age() {
        return age;
    }

    public Element(int num, String name, int age) {
        this.num=num;
        this.age =age;
        this.name=name;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element)) return false;

        Element element = (Element) o;

        return num == element.num;
    }

    @Override
    public int hashCode() {
        return num;
    }

    }
