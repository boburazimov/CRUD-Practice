package uz.sav.crud.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import uz.sav.crud.entity.template.TemplateModel;

import javax.persistence.*;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(uniqueConstraints ={@UniqueConstraint(columnNames = {"fullName", "phoneNumber"})})
public class Employee extends TemplateModel {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phoneNumber;

    @ManyToOne
    private Position position;
}
