package com.lxgzhw.demo04.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        ������:
            ObjectInputStream
        ��ȡ����:
            readObject()
        ע��:
            1.������ڸö�����ֽ����ļ�.class
            2.�������ʵ��Serializable�ӿ�
         */
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("obj.txt"));
        Object o = objectInputStream.readObject();
        System.out.println(o);
        Person o1 = (Person) o;
        System.out.println(o1.getName() + ":" + o1.getAge());
    }
}
