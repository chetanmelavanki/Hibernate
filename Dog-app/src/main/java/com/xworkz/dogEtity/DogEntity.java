package com.xworkz.dogEtity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "dog")
//@NamedQuery(name = "updateDogNameByColor", query = "update DogEntity set name=:x where color=:y")
//@NamedQuery(name = "updateDogWeightByName", query = "update DogEntity set weight=:x where name=:y")
//@NamedQuery(name = "updateDogNameByWeight", query = "update DogEntity set name=:x where weight=:y")
//@NamedQuery(name = "updateDogColorByname", query = "update DogEntity set color=:x where name=:y ")
//@NamedQuery(name = "updateDogIdByName", query = "update DogEntity set id=:x where name=:y ")
//@NamedQuery(name = "updateDogWeightById", query = "update DogEntity set weight=:x where id=:y ")
//@NamedQuery(name = "getAllDogEntity", query = "from DogEntity")
//@NamedQuery(name = "deleteDogEntityByName", query = "delete from DogEntity where name='piNKYA' ")
//@NamedQuery(name = "getDogMinWeight", query = "select min(m.weight)from DogEntity m")
//@NamedQuery(name = "getDogMaxWeight", query = "select max(w.weight)from DogEntity w")
//@NamedQuery(name = "getDogAvgWeight", query = "select avg(a.weight)from DogEntity a ")
//@NamedQuery(name = "getDogSumOfWeight", query = "select sum(weight)from DogEntity ")
//@NamedQuery(name = "getDogNameLikeP", query = "select name from DogEntity where name LIKE 'm%'")
//@NamedQuery(name = "getDogNameEndsWithY", query = "select name from DogEntity where name LIKE '%y'")
//@NamedQuery(name = "getDogWeightBetween10And65", query = "from DogEntity where weight BETWEEN 30 and 65")
//@NamedQuery(name = "getDogByName", query = "froM DogEntity where name='mento'")
//@NamedQuery(name = "getDogDuplicateByColor", query = "SeLecT DisTincT color from DogEntity")
//@NamedQuery(name = "getDogByWeightAndId", query = "from DogEntity wHere weight=37.59 AnD id=7")
//@NamedQuery(name = "getDogByNameOrColour", query = "FRom DogEntity wherE name='PInKy' oR color='pInk'")
//
//@NamedQuery(name = "updateDogNameByColorSQL", query = "update dog set dog_name='GitchiGKK' where dog_color='black'")
//@NamedQuery(name = "getAllDogEntitySQl", query = "select * from dog")

//@NamedQuery(name = "",query = )

public class DogEntity {

	@Id
	@Column(name = "dog_id")
	@GenericGenerator(name = "x", strategy = "increment")
	@GeneratedValue(generator = "x")
	private int id;
	@Column(name = "dog_name")
	private String name;
	@Column(name = "dog_color")
	private String color;
	@Column(name = "dog_weight")
	private double weight;

	public DogEntity() {
		super();
	}

	public DogEntity(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "DogEntity [id=" + id + ", name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

}
