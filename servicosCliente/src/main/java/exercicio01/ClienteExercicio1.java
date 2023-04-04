/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author SérgioFreireSoares
 */
public class ClienteExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] dados = new byte[4];
            dados[0] = 10;
            dados[1] = 11;
            dados[2] = 12;
            dados[3] = 13;
            InetAddress endereco = InetAddress.getByName("localhost");
            DatagramPacket datagrama = new DatagramPacket(dados, dados.length, endereco, 9500);
            socket.send(datagrama);
            System.out.println("Fim");     
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
