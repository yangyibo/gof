package org.yyb.proxy.dynamicproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void teach() {
        System.out.println("老师授课中...");
    }
}
