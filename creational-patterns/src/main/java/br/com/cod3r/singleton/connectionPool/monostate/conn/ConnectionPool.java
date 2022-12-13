package br.com.cod3r.singleton.connectionPool.monostate.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private final static int POOL_SIZE = 2;

    public static int getPoolSize() {
        return POOL_SIZE;
    }

    private static List<Connection> connectionsPool;

    static {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<Connection>();
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public ConnectionPool() {
        System.out.println("New instance of Connection Pool");
    }

    public Connection getConnection() {
        Connection available = null;
        for (Connection connection : connectionsPool) {
            if (!connection.isInUse()) {
                available = connection;
                System.out.println("Connection established");
                break;
            }
        }
        if (available == null) {
            System.out.println("No Connections available");
            return null;
        }

        available.setInUse(true);
        return available;
    }

    public void leaveConnection(Connection connection) {
        connection.setInUse(false);
        System.out.println("End of Connection");
    }
}
