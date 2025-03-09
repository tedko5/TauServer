package tet.tauserver;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;

public class Packet {

    private Protocol protocol;

    private String sender;
    private String receiver;
    private String contents;

    private Instant timestamp;

    public Packet(String raw) {
        String[] blocks = raw.split(";");
        this.protocol = Protocol.knownAs(blocks[0]);
        this.sender = blocks[1];
        this.receiver = blocks[2];
        this.contents = new String(Base64.getDecoder().decode(blocks[3]), StandardCharsets.UTF_8);
        this.timestamp = Instant.now();
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public String getContents() {
        return contents;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return protocol.getAbbreviation() + ";"
                + sender + ";"
                + receiver + ";"
                + Base64.getEncoder().encodeToString(contents.getBytes(StandardCharsets.UTF_8)) + ";"
                + timestamp;
    }
}