package org.example;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Student s)
    {
        if(this.id == s.id)
        {
            return 0;
        }
        else if(this.id>s.id)
        {
            return 1;
        }
        else{
            return -1;
        }
    }

    public String toString(){
        return "id "+id+
                " name "+name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
