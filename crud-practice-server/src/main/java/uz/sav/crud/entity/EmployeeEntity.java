package uz.sav.crud.entity;

import lombok.*;
import uz.sav.crud.entity.template.TemplateModel;

import javax.persistence.*;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints ={@UniqueConstraint(columnNames = {"fullName", "phoneNumber"})})
public class EmployeeEntity extends TemplateModel {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phoneNumber;

    @ManyToOne
    private PositionEntity position;
}
