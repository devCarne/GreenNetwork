package inetaddress;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressTestApp {

    public static void main(String[] args) throws IOException {
        // 1. InetAddress 객체 생성
        // 1-1. 원격지 IP 객체 생성
        InetAddress googleAddress = InetAddress.getByName("www.google.com");

        InetAddress IPAddress = InetAddress.getByAddress(new byte[]{(byte) 172, (byte) 217, (byte) 161, 36});
        InetAddress googleAndIP = InetAddress.getByAddress("www.google.com",
                new byte[]{(byte) 172, (byte) 217, (byte) 161, 36});
        System.out.println(googleAddress);
        System.out.println(IPAddress);
        System.out.println(googleAndIP);
        System.out.println();

        // 1-2. 로컬/로프백 IP
        InetAddress localHost = InetAddress.getLocalHost();
        InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
        System.out.println(localHost);
        System.out.println(loopbackAddress);
        System.out.println();

        // 1-3. 하나의 호스트가 여러 개의 IP를 가지고 있는 경우
        InetAddress[] naverAddresses = InetAddress.getAllByName("www.naver.com");
        System.out.println(Arrays.toString(naverAddresses));
        System.out.println();

        // 2. InetAddress 메서드
        byte[] address = googleAddress.getAddress();
        System.out.println(Arrays.toString(address));
        System.out.println(googleAddress.getHostAddress());
        System.out.println(googleAddress.getHostName());
        System.out.println();
        System.out.println(googleAddress.isReachable(1000)); // true
        System.out.println(googleAddress.isLoopbackAddress()); // false
        System.out.println(googleAddress.isMulticastAddress()); // false 224-239.0-255.0- 255.0-255
        System.out.println(InetAddress.getByAddress(new byte[]{127, 0, 0, 1}).isLoopbackAddress()); // true
        System.out.println(InetAddress.getByAddress(new byte[]{(byte) 234, (byte) 234, (byte) 234, (byte) 234})
                .isMulticastAddress()); // true
    }
}
