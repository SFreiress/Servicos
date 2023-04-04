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
public class ServidorExercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Executando Servidor...");
            DatagramSocket socket = new DatagramSocket(9501);
            String sigla = "Parana";
            byte[] desc = new byte[10];
            //byte[] desc = new byte[1];
            
            DatagramPacket datagrama = new DatagramPacket(desc, desc.length);
            socket.receive(datagrama);
            String descricao = new String(datagrama.getData());
            System.out.println("Conteúdo recebido: " + descricao);
            InetAddress endereco = InetAddress.getByName("localhost");
            DatagramPacket datagrama1 = new DatagramPacket(desc, desc.length, endereco, 9501);
            socket.send(datagrama1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
