package com.lxgzhw.demo04.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //д���Զ������
        //��Ҫ�õ����� ObjectOutputStream
        //1.����
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("obj.txt"));
        //2.д��
        objectOutputStream.writeObject(new Person("����", 22));
        //3.�ر�
        objectOutputStream.close();
    }
}
