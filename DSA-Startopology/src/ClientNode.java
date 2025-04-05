/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Represents a client node in a star topology network.
 * Each client communicates with other clients via a central server.
 */
public class ClientNode {

    private String clientID; // Fixed typo: cleintID -> clientID
    private ServerNode server;

    /**
     * Constructor to set up the client and its connection to the server.
     * @param clientID The unique ID of the client.
     * @param server The central server node.
     * @throws IllegalArgumentException if clientID or server is null.
     */
    public ClientNode(String clientID, ServerNode server) {
        if (clientID == null || server == null) {
            throw new IllegalArgumentException("Client ID and Server cannot be null.");
        }
        this.clientID = clientID;
        this.server = server;
    }

    /**
     * Sends a message to another client via the server.
     * @param receiverID The ID of the client to receive the message.
     * @param message The message to be sent.
     */
    public void send(String receiverID, String message) {
        server.sendMessage(this.clientID, receiverID, message);
    }

    /**
     * Receives a message from another client and displays it.
     * @param senderID The ID of the client that sent the message.
     * @param message The message content.
     */
    public void receive(String senderID, String message) {
        System.out.println("Message From: " + senderID + "\n" + message);
    }

    /**
     * Gets the unique ID of this client.
     * @return The client ID.
     */
    public String getClientID() {
        return clientID;
    }
}
