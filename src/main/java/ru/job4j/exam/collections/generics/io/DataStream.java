package ru.job4j.exam.collections.generics.io;

import java.io.*;

/**
 * массивы запишем в файл в двоичном формате,
 */
public class DataStream {
    public static void main(String[] args) throws Exception {
        String path = "data/dataOutput.txt";
        String[] names = {"unit1", "unit2", "unit3"};
        int[] amounts = {5, 7, 2};
        boolean[] checked = {true, false, true};
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(path));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path))) {
            for (int i = 0; i < names.length; i++) {
                outputStream.writeUTF(names[i]); /*переводит строковое значение в двоичный формат */
                outputStream.writeInt(amounts[i]);
                outputStream.writeBoolean(checked[i]);
            }
            while (true) {
                String name = dataInputStream.readUTF();
                int amount = dataInputStream.readInt();
                boolean chcked = dataInputStream.readBoolean();
                System.out.printf(name, amount, chcked);
            }
        } catch (IOException e) {
            System.out.println("and");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
