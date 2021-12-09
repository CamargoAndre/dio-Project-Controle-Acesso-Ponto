package com.dio.accesscontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BankHours {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BankHoursId implements Serializable{
        private Long idBankHours;
        private Long idMovement;
        private Long idUser;

    }

    @Id
    @EmbeddedId
    private BankHoursId id;
    private LocalDateTime workingDate;
    private BigDecimal amountHours;
    private BigDecimal timeBalance;

}
