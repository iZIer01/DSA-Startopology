/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaon
 */
import java.util.HashMap;

/**
 * Mock implementation of the ServerNode class for testing purposes.
 */
public class ServerNode {
    private HashMap<String, ClientNode> clients = new HashMap<>();

    // Adding a new client
    public void registerClient(ClientNode client) {
        clients.put(client.getClientID(), client);
    }

    // Remove a client from the network
    public void removeClient(String clientID) {
        clients.remove(clientID);
    }

    /**
     * Simulates sending a message from one client to another.
     * @param senderID The ID of the client sending the message.
     * @param receiverID The ID of the client receiving the message.
     * @param message The message content.
     */
    public void sendMessage(String senderID, String receiverID, String message) {
        ClientNode receiver = clients.get(receiverID);
        if (receiver != null) {
            receiver.receive(senderID, message);
        } else {
            System.out.println("Error: Receiver with ID " + receiverID + " not found.");
        }
    }
}

