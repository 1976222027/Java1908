package com.lxgzhw.demo04.ObjectStream;

import java.io.Serializable;

public class Person implements Serializable {
    //��Ҫ��д����Զ������ͱ���ʵ��Serializable�ӿ�
    //��ֹ�޸Ĵ�������ĳ�ͻ����Ľ������
    //дһ���̶������л�id,����ǹ̶�д��
    private static final long serialVersionUID = 1L;
    //�����ʲô���ݲ��뱻���л�,��transient�ؼ���

    //����洢 ����,����
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
