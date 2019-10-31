package com.usc.csci201x.server;

import com.usc.csci201x.message.Message;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {

    private Vector<ServerThread> threads;

    Server(int port) {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(port);
            threads = new Vector<>();
            while (true) {
                Socket s = ss.accept();
                new ServerThread(s, this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void broadcast(Message m) {
        for (ServerThread st : threads) {
            st.sendMessage(m);
        }
    }

}
