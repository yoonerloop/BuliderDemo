# BuliderDemo
建造者设计模式案例Demo<br/>
```
/**
 * 测试：建造者设计模式 : Retrofit就是基于此设计的
 */
UserBuilder.Builder builder = new UserBuilder.Builder()
        .age("20")
        .id("1")
        .name("张三")
        .weight("60")
        .build();
System.out.println(builder.toString());
```
