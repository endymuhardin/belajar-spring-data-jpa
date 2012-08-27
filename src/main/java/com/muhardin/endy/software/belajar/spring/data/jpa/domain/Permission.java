package com.muhardin.endy.software.belajar.spring.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;


@Entity @Table(name="t_permission")
public class Permission {
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid2")
	private String id;
	
	@NotNull
	@Column(nullable=false, unique=true)
	private String kode;
	
	@NotNull
	@Column(nullable=false)
	private String nama;
}
