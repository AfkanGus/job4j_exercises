package objectstream;

import java.io.*;

public class ObjectsStream {
    public static void main(String[] args) {
        Car car = new Car("Firma", "Model", 200);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/serialVersionUID.dat"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/serialVersionUID.dat"))
        ) {
            out.writeObject(car);
            Car deserial = (Car) in.readObject();
            System.out.println(deserial.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
