public class ClientNodeTest {

    public static void main(String[] args) {
        // Create a ServerNode instance
        ServerNode server = new ServerNode();

        // Create and register two clients
        ClientNode client1 = new ClientNode("Client1", server);
        ClientNode client2 = new ClientNode("Client2", server);
        server.registerClient(client1);
        server.registerClient(client2);

        // Test sending a message from client1 to client2
        System.out.println("Testing message sending...");
        client1.send("Client2", "Hello, Client2!");

        // Test removing a client and sending a message to it
        System.out.println("\nTesting client removal...");
        server.removeClient("Client2");
        client1.send("Client2", "Are you still there?");

        // Test sending a message to a non-existent client
        System.out.println("\nTesting message to non-existent client...");
        client1.send("Client3", "Hello, Client3!");
    }
}