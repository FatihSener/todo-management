package com.Fatih.Todomanagement.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ToDoList_History")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ToDoListHistory extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "ToDoList_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private ToDoList toDoList;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "details", length = 4000)
    private String details;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "ToDoList_Enum")
    @Enumerated(EnumType.STRING)
    private ToDoListEnum toDoListEnum;

    @JoinColumn(name = "assiqnee_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User assiqnee;

}

