
package jmdnsfiles;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

// This code is adapted from https://github.com/jmdns/jmdns
public class SmartHomeServiceRegistration {

    public static void main(String[] args) throws InterruptedException {

        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            //ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "example", 8000, "path=index.html");
            //jmdns.registerService(serviceInfo);
            ServiceInfo SmartDoor = ServiceInfo.create("_http._tcp.local.", "com.smartdoor.smarthome", 50055, "SmartDoor Functions");
            jmdns.registerService(SmartDoor);
            ServiceInfo SmartFire = ServiceInfo.create("_http._tcp.local.", "com.smartfire.smarthome", 50052, "SmartFire Functions");
            jmdns.registerService(SmartFire);
            ServiceInfo SmartLight = ServiceInfo.create("_http._tcp.local.", "com.smartlight.smarthome", 50053, "SmartLight Functions");
            jmdns.registerService(SmartLight);
            ServiceInfo SmartPrinter = ServiceInfo.create("_http._tcp.local.", "com.smartprinter.smarthome", 50053, "SmartPrinter Functions");
            jmdns.registerService(SmartPrinter);
            
            // Wait a bit
            Thread.sleep(10000);

            // Unregister all services
            //jmdns.unregisterAllServices();
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
