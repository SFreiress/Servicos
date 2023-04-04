/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clienteudpnumero;

import java.net.DatagramSocket;
import java.net.DatagramPacket;

/**
 *
 * @author SérgioFreireSoares
 */
public class ServidorUDPNumero {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9000);
            byte[] num = new byte[1];
            DatagramPacket datagrama = new DatagramPacket(num, 1);
            socket.receive(datagrama);
            byte[] recebido = datagrama.getData();
            System.out.println("O número recebido:" + recebido[0]);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
