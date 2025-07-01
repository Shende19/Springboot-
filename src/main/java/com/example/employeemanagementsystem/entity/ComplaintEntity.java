package com.example.employeemanagementsystem.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Data
public class ComplaintEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complaintId;
    private String customerName;
    private String issueDescription;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getRaisedOn() {
        return raisedOn;
    }

    public void setRaisedOn(LocalDateTime raisedOn) {
        this.raisedOn = raisedOn;
    }

    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime raisedOn;

    public LocalDateTime getResolvedOn() {
        return ResolvedOn;
    }

    public void setResolvedOn(LocalDateTime resolvedOn) {
        ResolvedOn = resolvedOn;
    }

    private LocalDateTime ResolvedOn;

    public enum Status {
        OPEN, IN_PROGRESS, RESOLVED
    }


}
