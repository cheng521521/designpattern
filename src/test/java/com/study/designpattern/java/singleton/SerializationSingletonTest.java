package com.study.designpattern.java.singleton;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class SerializationSingletonTest {

    @Test
    void test() throws IOException, ClassNotFoundException {
        SerializationSingleton instanceOne = SerializationSingleton.getInstance();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserialized from file to object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializationSingleton instanceTwo = (SerializationSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
    }
}