package at.ac.hcw.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class GameServer {
    static final int MIN_PLAYERS = 2;

    private List<ClientHandler> lobby = new ArrayList<>();
    private boolean started = false;

    public synchronized void Start(){
        new GameServer().run(1234);

    }

    private synchronized void run(int port){

        try(ServerSocket ss = new ServerSocket(port)){
            while (started) {
                Socket s = ss.accept();
                //new Thread(new ClientHandler(s, this)).start(); idfk why this shit is underfined imma be honest
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }

    //most basic ass join and leave, this needs serious remodeling btw
    public synchronized void join(ClientHandler c){
        lobby.add(c);
    }
    public synchronized void leave(ClientHandler c){
        lobby.remove(c);
    }

    public synchronized void broadcast(String msg){
        for(ClientHandler c : lobby){
            //c.send(msg)
            
        }
    }

}





