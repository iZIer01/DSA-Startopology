public class ClientNodeTest {

    public static void main(String[] args) {
        // Create a mock server
        ServerNode server = new ServerNode();

        // Create two client nodes
        ClientNode client1 = new ClientNode("Client1", server);
        ClientNode client2 = new ClientNode("Client2", server);

        // Test sending a message from client1 to client2
        System.out.println("Testing message sending...");
        client1.send("Client2", "Hello, Client2!");

        // Simulate client2 receiving the message
        System.out.println("\nTesting message receiving...");
        client2.receive("Client1", "Hello, Client2!");
    }
}