package org.yyb.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {

        ITeacherDao teacherDao = new TeacherDao();

        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        teacherDaoProxy.teach();
    }
}
