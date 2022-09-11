package equals_hashcode;


public class Cat {
    /*
    Override methods equals() and hashCode() that it took @name and @age
    Create several object with the same names and ages and different and print the result of comparing
    Override toString method - when we call System.out.println(cat) -> it should print: "Cat name: Tom, age: 5, weight: 3"
     */

    private final String name;
    private final int age;
    private final int weight;

    public Cat(String name,int age,int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Markiz",14,8);
        Cat cat2 = new Cat("Markiz",14,2);
        Cat cat3 = new Cat("Marecy",5,3);

        System.out.println(cat1.equals(cat2));
        System.out.println(cat2.equals(cat3));

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());

        System.out.println(cat2);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name);
    }


    public int hashCode() {
        return  (int) age * name.hashCode() ;
    }


    public String toString() {
        return "Cat name: " + name + ", age: " + age + ", weight: " + weight;
    }
}
