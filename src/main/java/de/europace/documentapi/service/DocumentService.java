package de.europace.documentapi.service;

import de.europace.documentapi.domain.Document;
import de.europace.documentapi.repository.DocumentProps;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DocumentService {

    private final DocumentProps documents;

    public List<Document> getDocuments() {
        return documents.getProps();
    }

}
