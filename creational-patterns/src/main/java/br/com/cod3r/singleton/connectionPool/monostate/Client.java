package br.com.cod3r.singleton.connectionPool.monostate;

import br.com.cod3r.singleton.connectionPool.monostate.conn.Connection;
import br.com.cod3r.singleton.connectionPool.monostate.conn.ConnectionPool;

public class Client {

    public static void doQuery1() {
        System.out.println("\n############ Executing Query 1");
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();

        if (connection != null) {
            connection.query("SELECT * FROM A1");
        }

        pool.leaveConnection(connection);
    }

    public static void doQuery2() {
        System.out.println("\n############ Executing Query 2");
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();

        if (connection != null) {
            connection.query("SELECT * FROM A2");
        }

        pool.leaveConnection(connection);
    }

    public static void doQuery3() {
        System.out.println("\n############ Executing Query 3");
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();

        if (connection != null) {
            connection.query("SELECT * FROM A3");
        }

        pool.leaveConnection(connection);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Connection Pool Size: " + ConnectionPool.getPoolSize());
        doQuery1();
        doQuery2();
        doQuery3();
    }
}
