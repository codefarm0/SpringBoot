package com.gl.springdata.model;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Setter
@Getter
//@NoArgsConstructor
@ToString

@Entity
@Table(name = "Author")
@EntityListeners(AuditingEntityListener.class)
public class Author implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "eval")
    private boolean eval;
    @Column(name = "value")
    private String value;
    @Column(name = "url")
    private String url;
    @Column(name = "additionalInfo")
    private String additionalInfo;
    @Column(name = "description")
    private String description;
    @Column(name = "published")
    private String published;


    public Author() {
        super();
    }

    public Author(boolean eval, String value, String url, String additionalInfo, String description, String published) {
        this.eval = eval;
        this.value = value;
        this.url = url;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.published = published;
    }
}