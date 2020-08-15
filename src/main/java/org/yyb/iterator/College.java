package org.yyb.iterator;

import java.util.Iterator;

public interface College {

    String getName();

    void addDepartment(String name, String desc);

    Iterator<Department> createIterator();
}
