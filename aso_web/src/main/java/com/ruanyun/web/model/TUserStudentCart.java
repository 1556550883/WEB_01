package com.ruanyun.web.model;
// Generated 2016-12-17 12:17:24 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUserStudentCart generated by hbm2java
 */
@Entity
@Table(name="t_user_student_cart"
)
public class TUserStudentCart  implements java.io.Serializable {


     private Integer studentCartId;
     private Integer schoolId;
     private String schoolName;
     private String departmentName;
     private String className;
     private String studentCar;
     private String userAppNum;
     private Integer cartStatus;
     private String flag1;
     private String flag2;

    public TUserStudentCart() {
    }

    public TUserStudentCart(Integer schoolId, String schoolName, String departmentName, String className, String studentCar, String userAppNum, Integer cartStatus, String flag1, String flag2) {
       this.schoolId = schoolId;
       this.schoolName = schoolName;
       this.departmentName = departmentName;
       this.className = className;
       this.studentCar = studentCar;
       this.userAppNum = userAppNum;
       this.cartStatus = cartStatus;
       this.flag1 = flag1;
       this.flag2 = flag2;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="student_cart_id", unique=true, nullable=false)
    public Integer getStudentCartId() {
        return this.studentCartId;
    }
    
    public void setStudentCartId(Integer studentCartId) {
        this.studentCartId = studentCartId;
    }
    
    @Column(name="school_id")
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
    
    @Column(name="department_name", length=100)
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    @Column(name="class_name", length=100)
    public String getClassName() {
        return this.className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }
    
    @Column(name="student_car", length=100)
    public String getStudentCar() {
        return this.studentCar;
    }
    
    public void setStudentCar(String studentCar) {
        this.studentCar = studentCar;
    }
    
    @Column(name="user_app_num", length=100)
    public String getUserAppNum() {
        return this.userAppNum;
    }
    
    public void setUserAppNum(String userAppNum) {
        this.userAppNum = userAppNum;
    }
    
    @Column(name="cart_status")
    public Integer getCartStatus() {
        return this.cartStatus;
    }
    
    public void setCartStatus(Integer cartStatus) {
        this.cartStatus = cartStatus;
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




}


