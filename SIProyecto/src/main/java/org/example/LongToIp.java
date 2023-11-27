package org.example;

public class LongToIp {

    public static String longToIP(long ip) {
        long divisor = 256;
        String IPv4 = "";
        for (int i = 0; i < 4; i ++) {
            long temp = ip % divisor;
            ip = ip / divisor;

            if (i < 3) {
                IPv4 = "." + temp + IPv4;
            } else {
                IPv4 = temp + IPv4;
            }
        }
        return IPv4;
    }
}
