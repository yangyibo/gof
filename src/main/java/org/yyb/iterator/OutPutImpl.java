package org.yyb.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {

    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege() {
        for (College college : collegeList) {
            System.out.println("======" + college.getName() + "=====");
            printDepartment(college.createIterator());
        }
    }

    private void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            Department department = iterator.next();
            System.out.println(department.getName());
        }
    }
}
