package CollectionFramework;

public class comparator {
    public int age;
    public String name;
    public int weight;

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public comparator(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;

    }
}


