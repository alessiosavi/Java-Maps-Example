/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Utente
 */
public class MiniServer {

    ServerSocket server;
    Socket client;
    BufferedReader inDalClient;
    DataOutputStream outVersoClient;

    public MiniServer() throws IOException {
        attendi();
    }

    public void comunica() throws IOException {

        System.out.println("Inserire frase");
        String stringaRicevuta = inDalClient.readLine();
        System.out.println("Stringa Ricevuta: " + stringaRicevuta);
        String stringaModificata;
        stringaModificata = stringaRicevuta.toUpperCase();
        outVersoClient.writeBytes(stringaModificata + '\n');
        System.out.println("SPENGO SERVER");
        client.close();

    }

    public Socket attendi() throws IOException {
        server = new ServerSocket(6789);
        System.out.println("Il server è in attesa sulla porta: 1234");
        client = server.accept();
        server.close();
        inDalClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
        outVersoClient = new DataOutputStream(client.getOutputStream());
        return client;
    }

    public static void main(String argv[]) throws IOException {
        
        MiniServer server=new MiniServer();
        server.attendi();
        server.comunica();
    }

}
