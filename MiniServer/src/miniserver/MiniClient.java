/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniserver;

import java.io.*;
import java.net.*;

/**
 *
 * @author Utente
 */
public final class MiniClient {

    /**
     * @param args the command line arguments
     */
    Socket mioSocket;
    BufferedReader tastiera;//buffer input tastiera,
    BufferedReader inputServer;// stream di input
    DataOutputStream outVersoServer; //stream output
    String stringaUtente;//stringa inserita dall'utente
    String stringaDalServer;//stringa ricevuta dal server
    InetAddress nomeServer = InetAddress.getLocalHost();//indico che il server è in localhost
    int portaServer = 6000;//porta del server

    public MiniClient() throws IOException {
        connetti();
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public final Socket connetti() throws IOException {
        System.out.println("Client partito");
        //input tastiera
        tastiera = new BufferedReader(new InputStreamReader(System.in));
        //creo il socket
        mioSocket = new Socket("localhost", 6000);
        //associo due oggetti al socket per effettuare scrittura e lettura
        outVersoServer = new DataOutputStream(mioSocket.getOutputStream());
        inputServer = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
        return mioSocket;
    }
}
