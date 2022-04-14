package de.europace.documentapi.api;

import de.europace.documentapi.domain.Document;
import de.europace.documentapi.service.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/documents")
@AllArgsConstructor
public class DocumentController {

    private final DocumentService service;

    @GetMapping
    public ResponseEntity<List<Document>> getDocuments() {
        return ResponseEntity.ok(service.getDocuments());
    }

}
