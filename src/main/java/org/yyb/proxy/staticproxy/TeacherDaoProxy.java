package org.yyb.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao {

    private final ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("开始代理...");
        target.teach();
        System.out.println("提交...");
    }
}
