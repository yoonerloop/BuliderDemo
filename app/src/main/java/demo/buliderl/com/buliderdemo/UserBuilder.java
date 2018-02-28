package demo.buliderl.com.buliderdemo;

/**
 * date：2018/2/9 on 16:40
 * description:
 */

public class UserBuilder {
    private String id;
    private String age;
    private String weight;
    private String name;

    private UserBuilder(Builder builder) {
        this.id = builder.id;
        this.age = builder.age;
        this.weight = builder.weight;
        this.name = builder.name;
    }

    public static class Builder {
        private String id;
        private String age;
        private String weight;
        private String name;

        public Builder name(String name) {
            this.name = name;
            return Builder.this;
        }

        public Builder id(String id) {
            this.id = id;
            return Builder.this;
        }

        public Builder age(String age) {
            this.age = age;
            return Builder.this;
        }

        public Builder weight(String weight) {
            this.weight = weight;
            return Builder.this;
        }

        public Builder build() {
            return Builder.this;
        }

        @Override
        public String toString() {
            return "UserBuilder{" +
                    "id='" + id + '\'' +
                    ", age='" + age + '\'' +
                    ", weight='" + weight + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
