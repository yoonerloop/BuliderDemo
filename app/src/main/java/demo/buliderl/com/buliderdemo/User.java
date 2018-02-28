package demo.buliderl.com.buliderdemo;

/**
 * date：2018/2/9 on 16:02
 * description:
 */

public class User {
    private String id;
    private String age;
    private String weight;
    private String name;

    public User(String id, String age, String weight, String name) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
