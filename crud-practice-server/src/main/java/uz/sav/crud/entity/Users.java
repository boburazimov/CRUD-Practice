package uz.sav.crud.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.sav.crud.entity.Enum.UserStatusEnum;
import uz.sav.crud.entity.template.TemplateModel;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data // Getter i Setters
@Entity // Table in DB
public class Users extends TemplateModel {

    @Column(nullable = false)
    private String userName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(value = EnumType.STRING)
    private UserStatusEnum status;

}
