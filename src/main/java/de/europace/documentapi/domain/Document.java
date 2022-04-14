package de.europace.documentapi.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Document {

    private String id;
    private String name;
    private Long size;
    private Type type;
    private List<String> categories;
    private Boolean deleted;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime modifiedAt;

    public enum Type {
        PDF, IMAGE
    }

}
