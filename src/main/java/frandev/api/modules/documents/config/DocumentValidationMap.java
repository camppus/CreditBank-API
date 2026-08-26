package frandev.api.modules.documents.config;

import frandev.api.modules.documents.entities.DocumentType;
import frandev.api.modules.documents.entities.DocumentVerificationCheck;
import java.util.List;
import java.util.Map;

import static frandev.api.modules.documents.entities.DocumentVerificationCheck.CheckType.*;

public final class DocumentValidationMap {

    private DocumentValidationMap() {
    }

    public record FileDefinition(
            String type,
            boolean required,
            List<DocumentVerificationCheck.CheckType> checks
    ) {
    }

    public static final Map<DocumentType, List<FileDefinition>> RULES = Map.of(

            DocumentType.BI, List.of(

                    new FileDefinition(
                            "FRONT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING,
                                    DOCUMENT_NUMBER_VALIDATION
                            )
                    ),

                    new FileDefinition(
                            "BACK",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING
                            )
                    )
            ),

            DocumentType.PASSPORT, List.of(
                    new FileDefinition(
                            "DATA_PAGE",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING,
                                    DOCUMENT_NUMBER_VALIDATION
                            )
                    )
            ),

            DocumentType.DRIVER_LICENSE, List.of(

                    new FileDefinition(
                            "FRONT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING,
                                    DOCUMENT_NUMBER_VALIDATION
                            )
                    ),

                    new FileDefinition(
                            "BACK",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING
                            )
                    )
            ),

            DocumentType.TAX_ID, List.of(

                    new FileDefinition(
                            "DOCUMENT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING,
                                    DOCUMENT_NUMBER_VALIDATION
                            )
                    )
            ),

            DocumentType.PROOF_OF_ADDRESS, List.of(

                    new FileDefinition(
                            "DOCUMENT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_EXPIRATION,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING
                            )
                    )
            ),

            DocumentType.BANK_STATEMENT, List.of(

                    new FileDefinition(
                            "DOCUMENT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_EXPIRATION,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING
                            )
                    )
            ),

            DocumentType.EMPLOYMENT_PROOF, List.of(

                    new FileDefinition(
                            "DOCUMENT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_EXPIRATION,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING
                            )
                    )
            ),

            DocumentType.PAYSLIP, List.of(

                    new FileDefinition(
                            "DOCUMENT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_EXPIRATION,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING
                            )
                    )
            ),

            DocumentType.COLLATERAL_DOCUMENT, List.of(

                    new FileDefinition(
                            "DOCUMENT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING,
                                    DOCUMENT_NUMBER_VALIDATION
                            )
                    )
            ),

            DocumentType.LOAN_CONTRACT, List.of(

                    new FileDefinition(
                            "DOCUMENT",
                            true,
                            List.of(
                                    DOCUMENT_QUALITY,
                                    DOCUMENT_CLASSIFICATION,
                                    DOCUMENT_FORMAT,
                                    DOCUMENT_READABILITY,
                                    OCR,
                                    DOCUMENT_STRUCTURE,
                                    DOCUMENT_AUTHENTICITY,
                                    DOCUMENT_TAMPERING
                            )
                    )
            )
    );
}