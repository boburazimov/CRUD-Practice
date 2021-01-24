package uz.sav.crud.entity.template;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class TemplateNameModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

}
