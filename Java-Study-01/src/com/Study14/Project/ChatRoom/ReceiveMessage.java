package com.Study14.Project.ChatRoom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ClassName ReceiveMessage
 *
 * @Date2025/3/199:43
 * @Create bysunlight
 */
public class ReceiveMessage {

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        //接收数据包
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        while (true) {
            ds.receive(dp);

            //解析数据包
            byte[] data = dp.getData();
            int length = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String hostName = dp.getAddress().getHostName();

            System.out.println("ip为 " + ip + ",主机名为: " + hostName + "的人，发送了数据信息： " + data);
        }
    }

}
