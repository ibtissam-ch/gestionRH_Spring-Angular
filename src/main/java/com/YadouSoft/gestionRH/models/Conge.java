package com.YadouSoft.gestionRH.models;

import com.YadouSoft.gestionRH.enums.Statut;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Conge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "date_debut")
    private String from;
    @Column(name = "date_fin")
    private String leaveTo;
    @Column(name = "date_demande")
    private String applyDate;// LocalDateTime now = LocalDateTime.now();

    @Column(name = "demi_journee")
    private String noOfDays;
    @Column(name = "type")
    private String type;
    @Column(name = "motif")
    private String reason;
    @Column(name = "status")
    private Statut status;
    @Column(name = "sold")
    private String sold;
    // Pending or Approved or Rejected

    @ToString.Exclude @EqualsAndHashCode.Exclude
    @ManyToOne
    private Salarie salarie;

    public Conge(String from, String leaveTo, String applyDate, String noOfDays, String type, String reason, Statut status, String sold, Salarie salarie) {
        this.from = from;
        this.leaveTo = leaveTo;
        this.applyDate = applyDate;
        this.noOfDays = noOfDays;
        this.type = type;
        this.reason = reason;
        this.status = status;
        this.sold = sold;
        this.salarie = salarie;
    }
}
