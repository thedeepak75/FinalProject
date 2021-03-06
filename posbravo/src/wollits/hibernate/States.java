package wollits.hibernate;

// Generated Jun 14, 2014 7:45:27 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * States generated by hbm2java
 */
@Entity
@Table(name = "states", catalog = "wollits")
public class States implements java.io.Serializable {

	private int stateId;
	private Countries countries;
	private String name;
	private String abbreviation;
	private String type;
	private Integer sort;
	private Set<PostCodes> postCodeses = new HashSet<PostCodes>(0);

	public States() {
	}

	public States(int stateId, Countries countries, String name, String type) {
		this.stateId = stateId;
		this.countries = countries;
		this.name = name;
		this.type = type;
	}

	public States(int stateId, Countries countries, String name,
			String abbreviation, String type, Integer sort,
			Set<PostCodes> postCodeses) {
		this.stateId = stateId;
		this.countries = countries;
		this.name = name;
		this.abbreviation = abbreviation;
		this.type = type;
		this.sort = sort;
		this.postCodeses = postCodeses;
	}

	@Id
	@Column(name = "state_id", unique = true, nullable = false)
	public int getStateId() {
		return this.stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id", nullable = false)
	public Countries getCountries() {
		return this.countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "abbreviation")
	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@Column(name = "type", nullable = false)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "sort")
	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "states")
	public Set<PostCodes> getPostCodeses() {
		return this.postCodeses;
	}

	public void setPostCodeses(Set<PostCodes> postCodeses) {
		this.postCodeses = postCodeses;
	}

}
