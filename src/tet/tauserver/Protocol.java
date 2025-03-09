package tet.tauserver;

public enum Protocol {
    TAU_MESSAGE_TRANSFER_PROTOCOL("tauMTP-18"),
    TAU_AUTHENTICATION_PROTOCOL("tauAP-09"),
    TAU_DATABASE_PERSISTENCE_PROTOCOL("tauDPP-22"),
    TAU_FILE_SYSTEM_PERSISTENCE_PROTOCOL("tauFSPP-13"),
    TAU_SNELL_COMMAND_LINE_CONNECTION_PROTOCOL("tauSCLCP-03"),
    TAU_MEZHDA_PROTOCOL("tauMP-25"),
    TAU_MATH_COMMUNICATION_PROTOCOL("tauMCP-77"),
    PHI_SUITE_UNIVERSAL_DATA_TRANSFER_PROTOCOL("phiSUDTP-57");

    private final String abbreviation;

    Protocol(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static Protocol knownAs(String abbreviation) {
        for (var protocol : Protocol.values()) {
            if (protocol.getAbbreviation().equals(abbreviation)) {
                return protocol;
            }
        }
        return null;
    }
}