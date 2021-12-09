package com.dio.accesscontrol.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class WorkingHours {

    @Id
    private Long id;
    private String description;

}
