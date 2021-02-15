package uz.sav.crud.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.sav.crud.entity.Enum.TaskStatusEnum;
import uz.sav.crud.entity.template.TemplateModel;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class TaskEntity extends TemplateModel {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private OrganizationEntity organizationEntity;

    @Column(nullable = false)
    private Timestamp inboxDate;

    @Column(nullable = false)
    private String inboxNumber;

    @Column(nullable = false)
    private String deliveryType;

    @Column(nullable = false)
    private String littleContent;

    @OneToMany
    private List<EmployeeEntity> leaderShip;

    @ManyToMany
    //@JoinTable(name = "employee_tasks", joinColumns = @JoinColumn(name = "task_id"), inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private List<EmployeeEntity> executor;

    @ManyToOne
    private EmployeeEntity mainExecutor;

    @Column(nullable = false)
    private Timestamp expireDate;

    @Enumerated(value = EnumType.STRING)
    private TaskStatusEnum status;

    @Column(nullable = false)
    private boolean isExpired;

    @Column(nullable = false)
    private boolean isFamiliarized;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private Timestamp completeDate;

    @Column(nullable = false)
    private boolean isConfirmed;


}
