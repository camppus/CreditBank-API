package frandev.api.modules.documents.entities;

public enum DocumentType {
    BI("BI"),
    PASSPORT("PASSPORT"),
    DRIVER_LICENSE("DRIVER_LICENSE"),
    TAX_ID("TAX_ID"),
    PROOF_OF_ADDRESS("PROOF_OF_ADDRESS"),
    BANK_STATEMENT("BANK_STATEMENT"),
    EMPLOYMENT_PROOF("EMPLOYMENT_PROOF"),
    PAYSLIP("PAYSLIP"),
    COLLATERAL_DOCUMENT("COLLATERAL_DOCUMENT"),
    LOAN_CONTRACT("LOAN_CONTRACT");

    private final String value;

    DocumentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}