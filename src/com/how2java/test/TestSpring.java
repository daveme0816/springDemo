package com.how2java.test;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class TestSpring {
    @Autowired
    Category c;

    @Test
    public void test(){
        System.out.println(c.getName());
    }


//    public static void main(String[] args) throws InterruptedException {
//        ApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[] { "applicationContext.xml"});
//
//        //AOP 面向切面编程
//        ProductService s = (ProductService) context.getBean("s");
//        s.doSomeService();

        // test注入对象，注解方式
//        Product p = (Product) context.getBean("p");
//        System.out.println(p.getName());
//        System.out.println(p.getCategory().getName());

//    }
}
