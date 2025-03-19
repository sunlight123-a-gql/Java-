package com.Study14.Project.ChatRoom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * ClassName SendMessage
 *
 * @Date2025/3/199:43
 * @Create bysunlight
 */
public class SendMessage {

    public static void main(String[] args) throws IOException {


        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("请输入您要说的话： ");
            String str = sc.nextLine();
            if ("886".equals(str))
            {
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            //发送数据
            ds.send(dp);

            //释放资源
            ds.close();
        }
    }



}
