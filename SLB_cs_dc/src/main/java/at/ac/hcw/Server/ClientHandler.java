package at.ac.hcw.Server;

import java.net.Socket;

public class ClientHandler {
    private final Socket socket;
    private final GameServer server;
    public String Name;

    public ClientHandler(Socket s, GameServer server){
        this.socket = s;
        this.server = server;
    }

    public void send(String msg){
        //connect this fucker to the announcer in ui and GG
    }

}
