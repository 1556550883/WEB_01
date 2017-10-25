package com.ruanyun.web.model;
// Generated 2016-12-17 12:17:24 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ruanyun.web.model.sys.TCity;
import com.ruanyun.web.model.sys.TProvince;

/**
 * TSchool generated by hbm2java
 */
@Entity
@Table(name="t_school"
)
public class TSchool  implements java.io.Serializable {


     private Integer schoolId;
     private String schoolName;
     private String flag1;
     private String flag2;
     private String province;
     private String city;
     private Integer education;
     
     private String commonNumName;//传值
     private String schoolIds;//传值
     private TProvince tProvince;
     private TCity tCity;
    public TSchool() {
    }

    public TSchool(String schoolName, String flag1, String flag2) {
       this.schoolName = schoolName;
       this.flag1 = flag1;
       this.flag2 = flag2;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="school_id", unique=true, nullable=false)
    public Integer getSchoolId() {
        return this.schoolId;
    }
    
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }
    
    @Column(name="school_name", length=100)
    public String getSchoolName() {
        return this.schoolName;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    @Column(name="flag1", length=100)
    public String getFlag1() {
        return this.flag1;
    }
    
    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }
    
    @Column(name="flag2", length=100)
    public String getFlag2() {
        return this.flag2;
    }
    
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }
    @Column(name="province")
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	@Column(name="city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="education")
	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	@Transient
	public String getCommonNumName() {
		return commonNumName;
	}
	public void setCommonNumName(String commonNumName) {
		this.commonNumName = commonNumName;
	}

	@Transient
	public TCity gettCity() {
		return tCity;
	}
	public void settCity(TCity tCity) {
		this.tCity = tCity;
	}
	
	@Transient
	public TProvince gettProvince() {
		return tProvince;
	}
	public void settProvince(TProvince tProvince) {
		this.tProvince = tProvince;
	}

	@Transient
	public String getSchoolIds() {
		return schoolIds;
	}
	public void setSchoolIds(String schoolIds) {
		this.schoolIds = schoolIds;
	}
}


