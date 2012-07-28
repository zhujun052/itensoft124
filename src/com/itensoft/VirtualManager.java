package com.itensoft;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * VirtualManager entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "VirtualManager", schema = "dbo", catalog = "phoenix")
public class VirtualManager implements java.io.Serializable
{

	// Fields

	private String name;
	private String user1;
	private Integer priority1;
	private String user2;
	private Integer priority2;
	private String user3;
	private Integer priority3;
	private String user4;
	private Integer priority4;
	private String user5;
	private Integer priority5;
	private String user6;
	private Integer priority6;
	private String user7;
	private Integer priority7;
	private String user8;
	private Integer priority8;

	// Constructors

	/** default constructor */
	public VirtualManager()
	{
	}

	/** minimal constructor */
	public VirtualManager(String name)
	{
		this.name = name;
	}

	/** full constructor */
	public VirtualManager(String name, String user1, Integer priority1,
			String user2, Integer priority2, String user3, Integer priority3,
			String user4, Integer priority4, String user5, Integer priority5,
			String user6, Integer priority6, String user7, Integer priority7,
			String user8, Integer priority8)
	{
		this.name = name;
		this.user1 = user1;
		this.priority1 = priority1;
		this.user2 = user2;
		this.priority2 = priority2;
		this.user3 = user3;
		this.priority3 = priority3;
		this.user4 = user4;
		this.priority4 = priority4;
		this.user5 = user5;
		this.priority5 = priority5;
		this.user6 = user6;
		this.priority6 = priority6;
		this.user7 = user7;
		this.priority7 = priority7;
		this.user8 = user8;
		this.priority8 = priority8;
	}

	// Property accessors
	@Id
	@Column(name = "Name", unique = true, nullable = false, length = 50)
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "User1", length = 50)
	public String getUser1()
	{
		return this.user1;
	}

	public void setUser1(String user1)
	{
		this.user1 = user1;
	}

	@Column(name = "Priority1")
	public Integer getPriority1()
	{
		return this.priority1;
	}

	public void setPriority1(Integer priority1)
	{
		this.priority1 = priority1;
	}

	@Column(name = "User2", length = 50)
	public String getUser2()
	{
		return this.user2;
	}

	public void setUser2(String user2)
	{
		this.user2 = user2;
	}

	@Column(name = "Priority2")
	public Integer getPriority2()
	{
		return this.priority2;
	}

	public void setPriority2(Integer priority2)
	{
		this.priority2 = priority2;
	}

	@Column(name = "User3", length = 50)
	public String getUser3()
	{
		return this.user3;
	}

	public void setUser3(String user3)
	{
		this.user3 = user3;
	}

	@Column(name = "Priority3")
	public Integer getPriority3()
	{
		return this.priority3;
	}

	public void setPriority3(Integer priority3)
	{
		this.priority3 = priority3;
	}

	@Column(name = "User4", length = 50)
	public String getUser4()
	{
		return this.user4;
	}

	public void setUser4(String user4)
	{
		this.user4 = user4;
	}

	@Column(name = "Priority4")
	public Integer getPriority4()
	{
		return this.priority4;
	}

	public void setPriority4(Integer priority4)
	{
		this.priority4 = priority4;
	}

	@Column(name = "User5", length = 50)
	public String getUser5()
	{
		return this.user5;
	}

	public void setUser5(String user5)
	{
		this.user5 = user5;
	}

	@Column(name = "Priority5")
	public Integer getPriority5()
	{
		return this.priority5;
	}

	public void setPriority5(Integer priority5)
	{
		this.priority5 = priority5;
	}

	@Column(name = "User6", length = 50)
	public String getUser6()
	{
		return this.user6;
	}

	public void setUser6(String user6)
	{
		this.user6 = user6;
	}

	@Column(name = "Priority6")
	public Integer getPriority6()
	{
		return this.priority6;
	}

	public void setPriority6(Integer priority6)
	{
		this.priority6 = priority6;
	}

	@Column(name = "User7", length = 50)
	public String getUser7()
	{
		return this.user7;
	}

	public void setUser7(String user7)
	{
		this.user7 = user7;
	}

	@Column(name = "Priority7")
	public Integer getPriority7()
	{
		return this.priority7;
	}

	public void setPriority7(Integer priority7)
	{
		this.priority7 = priority7;
	}

	@Column(name = "User8", length = 50)
	public String getUser8()
	{
		return this.user8;
	}

	public void setUser8(String user8)
	{
		this.user8 = user8;
	}

	@Column(name = "Priority8")
	public Integer getPriority8()
	{
		return this.priority8;
	}

	public void setPriority8(Integer priority8)
	{
		this.priority8 = priority8;
	}

}