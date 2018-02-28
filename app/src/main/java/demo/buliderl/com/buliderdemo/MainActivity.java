package demo.buliderl.com.buliderdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 建造者设计模式
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 测试一：构造方法传递
         */
        User user = new User("1", "20", "60", "张三");
        System.out.println(user.toString());
        System.out.println("---------------------------------------------------------------");

        /**
         * 测试二：javabean传值
         */
        UserBean userBean = new UserBean();
        userBean.setId("1");
        userBean.setAge("20");
        userBean.setWeight("60");
        userBean.setName("张三");
        System.out.println(userBean.toString());
        System.out.println("---------------------------------------------------------------");

        /**
         * 测试三：建造者设计模式 : Retrofit就是基于此设计的
         */
        UserBuilder.Builder builder = new UserBuilder.Builder()
                .age("20")
                .id("1")
                .name("张三")
                .weight("60")
                .build();
        System.out.println(builder.toString());
        System.out.println("---------------------------------------------------------------");
    }
}
