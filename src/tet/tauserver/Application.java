package tet.tauserver;

import java.util.Base64;

public class Application {
    public static void main(String[] args) {
        Packet packet = new Packet("tMTP-18;Tedko;Petko;" + Base64.getEncoder().encodeToString("Hello!".getBytes()));
        System.out.println(packet);
        System.out.println("contents: " + packet.getContents());
    }
}