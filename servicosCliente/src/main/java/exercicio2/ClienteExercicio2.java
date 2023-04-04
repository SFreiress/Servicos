/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author SérgioFreireSoares
 */
public class ClienteExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            String sigla = "PR";
            byte[] desc = sigla.getBytes();
            InetAddress endereco = InetAddress.getByName("localhost");
            DatagramPacket datagrama = new DatagramPacket(desc, desc.length, endereco, 9501);
            socket.send(datagrama);
            System.out.println("Fim");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
