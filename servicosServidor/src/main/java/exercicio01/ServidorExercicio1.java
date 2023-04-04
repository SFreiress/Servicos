/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author SérgioFreireSoares
 */
public class ServidorExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            System.out.println("Servidor em execução....");
            DatagramSocket socket = new DatagramSocket(9500);
            byte[] dados = new byte[4];
            DatagramPacket datagrama = new DatagramPacket(dados, 4);
            socket.receive(datagrama);
             for (int i = 0; i < 4; i++) {
                 System.out.println("Índice = " + i + ", conteúdo recebido: " + datagrama.getData()[i]);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
