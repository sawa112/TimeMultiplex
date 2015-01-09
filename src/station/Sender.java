package station;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Sender extends Thread{

    private static final int BYTE_LENGTH = 34;
    private MulticastSocket multicastSocket;
    private long waitTime;
    private DatagramPacket datagramPacket;

    public Sender(MulticastSocket multicastSocket, long waitTime, String multicastaddress, int port) {
        try {
            this.waitTime = waitTime;
            this.multicastSocket = multicastSocket;
            this.datagramPacket = new DatagramPacket(new byte[BYTE_LENGTH], BYTE_LENGTH, InetAddress.getByName(multicastaddress),port);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(waitTime);
            //**************************
            // EXAMPLE PACKAGE
            byte[] data = new byte[BYTE_LENGTH];
            for (int i = 0; i < data.length; i++)
                data[i] = (byte) i;
            //**************************
            datagramPacket.setData(data);
            multicastSocket.send(datagramPacket);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}