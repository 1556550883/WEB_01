package com.ruanyun.web.model.sys;
// Generated 2013-11-22 9:55:13 by Hibernate Tools 3.2.2.GA


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAuthority generated by hbm2java
 */
@Entity
@Table(name="t_authority"
)
public class TAuthority  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer authId;
     private String authCode;
     private String parentAuthCode;
     private String authName;
     private String authUrl;
     private String authType;
     private Integer authOrderby;
     private Date createdate;
     private String requestType;
     
     /**
      * 角色ID 修改权限时表示是否选择了权限
      */
     private Integer roleId;
     /**
      * 子类
      */
     private List<TAuthority> childAuthority=new ArrayList<TAuthority>(0);

    public TAuthority() {
    }

    public TAuthority(String authCode, String parentAuthCode, String authName, String authUrl, String authType, Integer authOrderby, Date createdate, String requestType) {
       this.authCode = authCode;
       this.parentAuthCode = parentAuthCode;
       this.authName = authName;
       this.authUrl = authUrl;
       this.authType = authType;
       this.authOrderby = authOrderby;
       this.createdate = createdate;
       this.requestType = requestType;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="auth_id", unique=true, nullable=false)
    public Integer getAuthId() {
        return this.authId;
    }
    
    public void setAuthId(Integer authId) {
        this.authId = authId;
    }
    
    @Column(name="auth_code", length=100)
    public String getAuthCode() {
        return this.authCode;
    }
    
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
    
    @Column(name="parent_auth_code", length=100)
    public String getParentAuthCode() {
        return this.parentAuthCode;
    }
    
    public void setParentAuthCode(String parentAuthCode) {
        this.parentAuthCode = parentAuthCode;
    }
    
    @Column(name="auth_name", length=100)
    public String getAuthName() {
        return this.authName;
    }
    
    public void setAuthName(String authName) {
        this.authName = authName;
    }
    
    @Column(name="auth_url", length=100)
    public String getAuthUrl() {
        return this.authUrl;
    }
    
    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }
    
    @Column(name="auth_type", length=100)
    public String getAuthType() {
        return this.authType;
    }
    
    public void setAuthType(String authType) {
        this.authType = authType;
    }
    
    @Column(name="auth_orderby")
    public Integer getAuthOrderby() {
        return this.authOrderby;
    }
    
    public void setAuthOrderby(Integer authOrderby) {
        this.authOrderby = authOrderby;
    }
    
    @Column(name="createdate", length=10)
    public Date getCreatedate() {
        return this.createdate;
    }
    
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    
    @Column(name="request_type", length=100)
    public String getRequestType() {
        return this.requestType;
    }
    
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    @Transient
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	@Transient
	public List<TAuthority> getChildAuthority() {
		return childAuthority;
	}

	public void setChildAuthority(List<TAuthority> childAuthority) {
		this.childAuthority = childAuthority;
	}




}


