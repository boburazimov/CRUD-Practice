package uz.sav.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.sav.crud.entity.Enum.UserStatusEnum;
import uz.sav.crud.entity.template.TemplateModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@EqualsAndHashCode(callSuper = true)
@Data // Getter i Setters
@AllArgsConstructor
@NoArgsConstructor
@Entity // Table in DB
public class UserEntity extends TemplateModel {

    @Column(nullable = false)
    private String userName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(value = EnumType.STRING)
    private UserStatusEnum status;

}
