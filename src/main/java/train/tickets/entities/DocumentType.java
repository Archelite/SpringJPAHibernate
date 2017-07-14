package train.tickets.entities;

import javax.persistence.*;

/**
 * Created by Archelite on 12.07.2017.
 */

@Entity
@Table(name = "document_types", schema = "javastudy")

public class DocumentType {

    private int document_id;
    private String document_type_name;

    @Id
    @Column(name = "document_id", nullable = false)
    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    @Basic
    @Column(name = "document_type_name", nullable = false)
    public String getDocument_type_name() {
        return document_type_name;
    }

    public void setDocument_type_name(String document_type_name) {
        this.document_type_name = document_type_name;
    }
}
