package com.ssh_news.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import com.ssh_news.util.commons.NewsConstants;

/**
 * topic entity class
 **/
@Entity
@Table(name = "tb_topic", catalog = NewsConstants.CATALOG_NAME)
public class Topic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String titleName;
	private Set<Newsinfo> newsinfos = new HashSet<>(); // newsinfos

	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Topic(String titleName) {
		super();
		this.titleName = titleName;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "generator", strategy = "native")
	@Id
	@Column(name = "topicId", length = 11, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "titleName", nullable = false, length = 50)
	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "topic")
	@Cascade(CascadeType.DELETE)
	public Set<Newsinfo> getNewsinfos() {
		return newsinfos;
	}

	public void setNewsinfos(Set<Newsinfo> newsinfos) {
		this.newsinfos = newsinfos;
	}

}
