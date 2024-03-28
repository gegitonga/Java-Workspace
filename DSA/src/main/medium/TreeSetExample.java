package main.medium;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<Object> treeSet = new TreeSet<>();

        Employee e1 = new Employee(101, "John");
        Employee e2 = new Employee(102, "Alice");
        Employee e3 = new Employee(103, "Bob");

        Department d1 = new Department(201, "HR");
        Department d2 = new Department(202, "IT");

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(d1);
        treeSet.add(d2);

        System.out.println("Elements in tree set");
        for (Object obj : treeSet){
            System.out.println(obj);
        }
    }
}

class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Employee other){
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString(){
        return "Employee{id=" + id +", name='" + name + "'}";
    }
}

class Department{
    private int deptId;
    private String deptName;

    public Department(int deptId, String deptName){
        this.deptId = deptId;
        this.deptName = deptName;
    }
    @Override
    public String toString(){
        return "Department{deptId="+ deptId +", deptName'" + deptName + "'}";
    }
}



