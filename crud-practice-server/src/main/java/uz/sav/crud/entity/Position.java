package uz.sav.crud.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.sav.crud.entity.template.TemplateNameModel;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "position")
public class Position extends TemplateNameModel {

    @OneToOne(mappedBy = "employee")
    private Employee employee;

}
