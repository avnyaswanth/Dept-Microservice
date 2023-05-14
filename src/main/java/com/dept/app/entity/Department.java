package com.dept.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("DEPT-ID")
    private int deptid;
    @JsonProperty("DEPT-NAME")
    private String deptname;

    public Department(int deptid, String deptname) {
    }
}
