package com.ruanyun.web.model;
// Generated 2016-3-2 10:52:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TRedPackage generated by hbm2java
 */
@Entity
@Table(name="t_red_package"
)
public class TRedPackage  implements java.io.Serializable {


     private Integer packageId;
     private String redPackageNum;
     private Integer redPackageCountDay;
     private Integer orderby;
     private Integer status;//当前用户是否已猜

    public TRedPackage() {
    }

    public TRedPackage(String redPackageNum, Integer redPackageCountDay, Integer orderby) {
       this.redPackageNum = redPackageNum;
       this.redPackageCountDay = redPackageCountDay;
       this.orderby = orderby;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="package_id", unique=true, nullable=false)
    public Integer getPackageId() {
        return this.packageId;
    }
    
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }
    
    @Column(name="red_package_num", length=100)
    public String getRedPackageNum() {
        return this.redPackageNum;
    }
    
    public void setRedPackageNum(String redPackageNum) {
        this.redPackageNum = redPackageNum;
    }
    
    @Column(name="red_package_count_day")
    public Integer getRedPackageCountDay() {
        return this.redPackageCountDay;
    }
    
    public void setRedPackageCountDay(Integer redPackageCountDay) {
        this.redPackageCountDay = redPackageCountDay;
    }
    
    @Column(name="orderby")
    public Integer getOrderby() {
        return this.orderby;
    }
    
    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    @Transient
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}




}


