package uz.sav.crud.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.sav.crud.entity.template.TemplateModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class OrganizationEntity extends TemplateModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer inn;

    @Column(nullable = false)
    private String mail;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

}

