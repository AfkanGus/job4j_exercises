package ru.job4j.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        /*getLocalHost return object type InetAddress that is local host*/
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.youtube.com");
        System.out.println(address);

        InetAddress[] sw = InetAddress.getAllByName("www.pornhub.com");
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }

    }
}
