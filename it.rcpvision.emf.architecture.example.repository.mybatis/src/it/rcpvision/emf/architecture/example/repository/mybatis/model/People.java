package it.rcpvision.emf.architecture.example.repository.mybatis.model;

public class People {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER1.PEOPLE.ID
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	private Short id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER1.PEOPLE.NAME
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column USER1.PEOPLE.SURNAME
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	private String surname;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER1.PEOPLE.ID
	 * @return  the value of USER1.PEOPLE.ID
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	public Short getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER1.PEOPLE.ID
	 * @param id  the value for USER1.PEOPLE.ID
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	public void setId(Short id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER1.PEOPLE.NAME
	 * @return  the value of USER1.PEOPLE.NAME
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER1.PEOPLE.NAME
	 * @param name  the value for USER1.PEOPLE.NAME
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column USER1.PEOPLE.SURNAME
	 * @return  the value of USER1.PEOPLE.SURNAME
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column USER1.PEOPLE.SURNAME
	 * @param surname  the value for USER1.PEOPLE.SURNAME
	 * @mbg.generated  Sat Jun 17 15:42:45 CEST 2017
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
}