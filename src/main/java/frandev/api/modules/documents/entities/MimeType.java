package frandev.api.modules.documents.entities;

public enum MimeType {

    PDF("application/pdf"),
    JPEG("image/jpeg"),
    PNG("image/png"),
    WEBP("image/webp"),
    DOC("application/msword"),
    DOCX("application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
    XLS("application/vnd.ms-excel"),
    XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
    CSV("text/csv"),
    TXT("text/plain");

    private final String value;

    MimeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}