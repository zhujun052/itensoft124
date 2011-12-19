package com.itensoft;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
/**
 * Group entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "[Group]", schema = "dbo", catalog = "phoenix", uniqueConstraints = @UniqueConstraint(columnNames = "Id"))
public class Group implements java.io.Serializable {

	// Fields

	private Integer code;
	private Integer parentCode;
	private String id;
	private String name;
	private Integer level;
	private String inheritSet;
	private String inheritPlainProgram;
	private String inheritBlackProgram;
	private String inheritRcv;
	private String inheritIdentity;
	private String inheritVirtualManager;
	private String actived;
	private Policy policy;
	//private Integer policyCode;
	private String hostName;
	private String userName;
	private String audited;
	private Integer refreshId;
	private String hardId;	

	/** default constructor */
	public Group() {
	}

	/** minimal constructor */
	public Group(Integer code) {
		this.code = code;
	}

	// Property accessors
	@Id
	@Column(name = "Code", unique = true, nullable = false)
	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Column(name = "ParentCode")
	public Integer getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(Integer parentCode) {
		this.parentCode = parentCode;
	}

	@Column(name = "Id", unique = true, length = 50)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "Name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "[Level]")
	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Column(name = "InheritSet", length = 1)
	public String getInheritSet() {
		return this.inheritSet;
	}

	public void setInheritSet(String inheritSet) {
		this.inheritSet = inheritSet;
	}

	@Column(name = "InheritPlainProgram", length = 1)
	public String getInheritPlainProgram() {
		return this.inheritPlainProgram;
	}

	public void setInheritPlainProgram(String inheritPlainProgram) {
		this.inheritPlainProgram = inheritPlainProgram;
	}

	@Column(name = "InheritBlackProgram", length = 1)
	public String getInheritBlackProgram() {
		return this.inheritBlackProgram;
	}

	public void setInheritBlackProgram(String inheritBlackProgram) {
		this.inheritBlackProgram = inheritBlackProgram;
	}

	@Column(name = "InheritRcv", length = 1)
	public String getInheritRcv() {
		return this.inheritRcv;
	}

	public void setInheritRcv(String inheritRcv) {
		this.inheritRcv = inheritRcv;
	}

	@Column(name = "InheritIdentity", length = 1)
	public String getInheritIdentity() {
		return this.inheritIdentity;
	}

	public void setInheritIdentity(String inheritIdentity) {
		this.inheritIdentity = inheritIdentity;
	}

	@Column(name = "InheritVirtualManager", length = 1)
	public String getInheritVirtualManager() {
		return this.inheritVirtualManager;
	}

	public void setInheritVirtualManager(String inheritVirtualManager) {
		this.inheritVirtualManager = inheritVirtualManager;
	}

	@Column(name = "Actived", length = 1)
	public String getActived() {
		return this.actived;
	}

	public void setActived(String actived) {
		this.actived = actived;
	}


	@OneToOne(fetch=FetchType.LAZY,optional=false, cascade = CascadeType.ALL)
	@JoinColumn(name = "PolicyCode")
	public Policy getPolicy(){
		return this.policy;
	}
	
	public void setPolicy(Policy policy){
		this.policy = policy;
	}
	
/*	@Column(name="PolicyCode")
	public Integer getPolicyCode()
	{
		return this.policyCode;
	}
	
	public void setPolicyCode(Integer policyCode)
	{
		this.policyCode = policyCode;
	}*/

	@Column(name = "HostName", length = 32)
	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	@Column(name = "UserName", length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "Audited", length = 1)
	public String getAudited() {
		return this.audited;
	}

	public void setAudited(String audited) {
		this.audited = audited;
	}

	@Column(name = "RefreshId")
	public Integer getRefreshId() {
		return this.refreshId;
	}

	public void setRefreshId(Integer refreshId) {
		this.refreshId = refreshId;
	}

	@Column(name = "HardId", length = 50)
	public String getHardId() {
		return this.hardId;
	}

	public void setHardId(String hardId) {
		this.hardId = hardId;
	}

}