package com.ruanyun.web.model;

// Generated 2016-1-7 13:36:20 by Hibernate Tools 3.2.2.GA

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUserApp generated by hbm2java
 */
@Entity
@Table(name = "t_user_app")
public class TUserApp implements java.io.Serializable {

	private static final long serialVersionUID = 7438608815308884833L;
	
	private Integer userAppId;
	private String userNum;
	private String userNick;//真实姓名
	private String birthday;
	private String sex;
	private String headImg;
	private String loginName;
	private String loginPwd;
	private String flag1;
	private String flag2;
	private String flag3;
	private String flag4;
	private String flag5;
	private String flag6;
	private String phoneSerialNumber;//手机序列号
	private String phoneNum;//手机号码
    private String zhifubao;
    private String weixin;
    private String zhifubaoName;
	private String invitationCode;//邀请码
	private Integer taskNewStatus;//新手任务完成状态
	private Integer userApppType;  //用户类型1-普通用户 2-学生
	private String loginControl;//登录控制
	private String excludeAdverId;//不允许做任务的广告ID
	private String idfa;
	
	private String appStore;
	private Date createDate;
	private TUserScore userScore;
	
	public TUserApp() {
	}

	public TUserApp(String userNum, String userNick, String birthday,
			String sex, String headImg, String loginName, String loginPwd,
			String flag1, String flag2, String flag3, String flag4,
			String flag5, String flag6) {
		this.userNum = userNum;
		this.userNick = userNick;
		this.birthday = birthday;
		this.sex = sex;
		this.headImg = headImg;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.flag1 = flag1;
		this.flag2 = flag2;
		this.flag3 = flag3;
		this.flag4 = flag4;
		this.flag5 = flag5;
		this.flag6 = flag6;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_app_id", unique = true, nullable = false)
	public Integer getUserAppId() {
		return userAppId;
	}

	public void setUserAppId(Integer userAppId) {
		this.userAppId = userAppId;
	}

	@Column(name = "user_num", length = 50)
	public String getUserNum() {
		return this.userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	@Column(name = "user_nick", length = 0)
	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	@Column(name = "birthday", length = 30)
	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Column(name = "sex", length = 2)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "head_img", length = 200)
	public String getHeadImg() {
		return this.headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	@Column(name = "login_name", length = 100)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "login_pwd", length = 100)
	public String getLoginPwd() {
		return this.loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	@Column(name = "flag1", length = 100)
	public String getFlag1() {
		return this.flag1;
	}

	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	@Column(name = "flag2", length = 100)
	public String getFlag2() {
		return this.flag2;
	}

	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	@Column(name = "flag3", length = 100)
	public String getFlag3() {
		return this.flag3;
	}

	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}

	@Column(name = "flag4", length = 100)
	public String getFlag4() {
		return this.flag4;
	}

	public void setFlag4(String flag4) {
		this.flag4 = flag4;
	}

	@Column(name = "flag5", length = 100)
	public String getFlag5() {
		return this.flag5;
	}

	public void setFlag5(String flag5) {
		this.flag5 = flag5;
	}

	@Column(name = "flag6", length = 100)
	public String getFlag6() {
		return this.flag6;
	}

	public void setFlag6(String flag6) {
		this.flag6 = flag6;
	}
	
	@Column(name = "phone_serial_number", length = 100)
	public String getPhoneSerialNumber() {
		return phoneSerialNumber;
	}
	public void setPhoneSerialNumber(String phoneSerialNumber) {
		this.phoneSerialNumber = phoneSerialNumber;
	}

	@Column(name = "phone_num")
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name="create_date", length=19)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Column(name = "invitation_code")
	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}
	
	@Column(name = "task_new_status")
	public Integer getTaskNewStatus() {
		return taskNewStatus;
	}

	public void setTaskNewStatus(Integer taskNewStatus) {
		this.taskNewStatus = taskNewStatus;
	}
	
	@Column(name="zhifubao", length=200)
	public String getZhifubao() {
		return zhifubao;
	}
	public void setZhifubao(String zhifubao) {
		this.zhifubao = zhifubao;
	}
	@Column(name="weixin", length=200)
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	@Column(name="zhifubao_name")
	public String getZhifubaoName() {
		return zhifubaoName;
	}

	public void setZhifubaoName(String zhifubaoName) {
		this.zhifubaoName = zhifubaoName;
	}
	@Column(name="user_appp_type")
	public Integer getUserApppType() {
		return userApppType;
	}

	public void setUserApppType(Integer userApppType) {
		this.userApppType = userApppType;
	}
	
	@Column(name="app_store")
	public String getAppStore() {
		return appStore;
	}
	public void setAppStore(String appStore) {
		this.appStore = appStore;
	}

	@Transient
	public TUserScore getUserScore() {
		return userScore;
	}
	public void setUserScore(TUserScore userScore) {
		this.userScore = userScore;
	}

	@Column(name="login_control")
	public String getLoginControl() {
		return loginControl;
	}

	public void setLoginControl(String loginControl) {
		this.loginControl = loginControl;
	}

	@Column(name="exclude_adver_id")
	public String getExcludeAdverId() {
		return excludeAdverId;
	}

	public void setExcludeAdverId(String excludeAdverId) {
		this.excludeAdverId = excludeAdverId;
	}

	@Column(name="idfa")
	public String getIdfa() {
		return idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}
	
}