package com.localaccount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "account",schema="localaccount")
public class Account {

	@Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id",strategy="uuid")
    @Column(name="id")
    private String id;
	
	@Column(name="active_money")
	private Double activeMoney;
	
	@Column(name="create_time")
	private String createTime;

    @Column(name="name")
	private String name;
    
    @Column(name="identity")
	private String identity;
    
    @Column(name="accountno")
    private String accountno;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getActiveMoney() {
		return activeMoney;
	}

	public void setActiveMoney(Double activeMoney) {
		this.activeMoney = activeMoney;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
    
    
}
