package com.codersdesks.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

    @Id
    private Long id;
    private String first_name;
    private String last_name;
    private String country_code;
    private String mobile;
    private String email;
    private String password;

}
