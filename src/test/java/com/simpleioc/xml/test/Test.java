package com.simpleioc.xml.test;


import com.simpleioc.ContainerXML;
import com.simpleioc.util.ClassPathXmlApplicationContext;


/**
 * Created by Blemrr on 2018/7/21.
 */
public class Test {

    public static void main(String[] args) throws Exception {

        //加载配置文件
        ContainerXML f = new ClassPathXmlApplicationContext("applicationContext.xml");

        //英格兰
        Object oe = f.getBean("E");
        Team e = (Team)oe;
        e.say();


    }

}
