package com.nttdatabootcamp.springdatajpaexample.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="T1_CUSTOMER")
public class Customer {
    @Id
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="apellidoMaterno")
    private String sApellidoMaterno;

    @Column(name="apellidoPaterno")
    private String sApellidoPaterno;

    @Column(name="edad")
    private int iEdad;

    @Column(name="direccion")
    private String sDireccion;

    @Column(name="distrito")
    private String sDistrito;

    @Column(name="telefono")
    private String sTelefono;

    @Column(name="documentType")
    private String sDocumentType;

    @Column(name="documentNumber")
    private String sDocumentNumber;

    @Column(name="estado")
    private String sEstado;

    @Column(name="enable")
    private Boolean bEnable;
}
