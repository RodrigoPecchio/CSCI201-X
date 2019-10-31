package com.usc.csci201x.server;

import com.usc.csci201x.message.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread implements Runnable {

    public String username;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private Server s;

    ServerThread(Socket socket, Server server) throws IOException {
        s = server;
        ois = new ObjectInputStream(socket.getInputStream());
        oos = new ObjectOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        while (true) {
            try {
                Message m = (Message) ois.readObject();
                s.broadcast(m);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(Message m) {
        try {
            oos.writeObject(m);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
