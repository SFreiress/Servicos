/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clienteudpnumero;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author SérgioFreireSoares
 */
public class ClienteUDPNumero {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            
            InetAddress endereco = InetAddress.getByName("localhost");
            int porta = 9000;
            byte[] num = new byte[1];
            num[0] = 12;
            
            DatagramPacket datagrama = new DatagramPacket(num, 1, endereco, porta);
            socket.send(datagrama);
            
            System.out.println("Datagrama UDP enviado com sucesso!\nEnviado o número: " + num[0]);
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
}
