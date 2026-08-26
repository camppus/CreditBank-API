package frandev.api.modules.documents.entities;

public enum DocumentStatus {
    PENDING("PENDING"),
    VERIFIED("VERIFIED"),
    REJECTED("REJECTED"),
    EXPIRED("REJECTED"),
    REPLACED("REPLACED");
    private final String value;
    DocumentStatus(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}