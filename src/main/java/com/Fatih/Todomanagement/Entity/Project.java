package com.Fatih.Todomanagement.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "projectName",unique = true)
    private String projectName;

    @Column(name = "projectCode",unique = true)
    private String projectCode;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User manager;
}
