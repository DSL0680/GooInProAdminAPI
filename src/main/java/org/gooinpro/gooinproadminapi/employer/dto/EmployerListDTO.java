package org.gooinpro.gooinproadminapi.employer.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class EmployerListDTO {

    private String ename;

    private Date ebirth;

    private boolean egender;

    private Timestamp eregdate;
}