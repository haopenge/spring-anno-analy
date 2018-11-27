package com.uu.anhusky.test;

import com.uu.anhusky.bean.Boss;
import com.uu.anhusky.config.MainConifgOfAutowired;
import com.uu.anhusky.dao.BookDao;
import com.uu.anhusky.service.BookService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class IOCTest_Autowired {
    private AnnotationConfigApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);

    }

    @After
    public void after() {
        applicationContext.close();
    }


    /**
     * 使用Red 进行测试
     * 自动装配底层原理，实现xxxAware 接口
     */
    @Test
    public void test04() {

    }


    /**
     * @AutoWird 构造方法自动注入
     */
    @Test
    public void test03() {
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss.toString());
    }

    /**
     * @Qualifer ：指定需要装配的组件id,不使用类型装配
     */
    @Test
    public void test02() {
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService.toString());

        System.out.println("------------------------");
        Map<String, BookDao> map = applicationContext.getBeansOfType(BookDao.class);
        map.forEach((key, value) -> {
            System.out.println(key + " " + value.toString());
        });
    }

    /**
     * @Primary 让Spring进行自动装配的时候，默认使用首选的bean；
     * 也可以继续使用@Qualifier指定需要装配的bean的名字
     */
    @Test
    public void test01() {
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao.toString());
        //直接打印报错 expected single matching bean but found 2: bookDao,bookDao2

        Map<String, BookDao> map = applicationContext.getBeansOfType(BookDao.class);
        map.forEach((key, value) -> {
            System.out.println(key + " " + value.toString());
        });

    }

}
