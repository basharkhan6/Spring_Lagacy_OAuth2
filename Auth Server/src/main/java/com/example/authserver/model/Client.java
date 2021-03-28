package com.example.authserver.model;

public class Client {

    private int id;
    private String secret;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", secret='" + secret + '\'' +
                '}';
    }
}
