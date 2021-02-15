package uz.sav.crud.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.sav.crud.entity.template.TemplateNameModel;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class PositionEntity extends TemplateNameModel {



}
