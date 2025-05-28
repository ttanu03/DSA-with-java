import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            String ipAddress = localhost.getHostAddress();

            System.out.println("IP Address of this machine: " + ipAddress);
        } catch (UnknownHostException e) {
            System.out.println("Could not get IP address.");
            e.printStackTrace();
        }
    }
}
