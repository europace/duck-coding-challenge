package de.europace.documentapi.repository;

import de.europace.documentapi.domain.Document;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "document")
@Value
public class DocumentProps {

    List<Document> props;

}
