package it.rcpvision.emf.architecture.example.repository.mybatis.model;

public class Reservation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.RESERVATION.CAR
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    private Short car;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.RESERVATION.PEOPLE
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    private Short people;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER1.RESERVATION.STATE
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    private Short state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.RESERVATION.CAR
     *
     * @return the value of USER1.RESERVATION.CAR
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    public Short getCar() {
        return car;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.RESERVATION.CAR
     *
     * @param car the value for USER1.RESERVATION.CAR
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    public void setCar(Short car) {
        this.car = car;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.RESERVATION.PEOPLE
     *
     * @return the value of USER1.RESERVATION.PEOPLE
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    public Short getPeople() {
        return people;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.RESERVATION.PEOPLE
     *
     * @param people the value for USER1.RESERVATION.PEOPLE
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    public void setPeople(Short people) {
        this.people = people;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER1.RESERVATION.STATE
     *
     * @return the value of USER1.RESERVATION.STATE
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    public Short getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER1.RESERVATION.STATE
     *
     * @param state the value for USER1.RESERVATION.STATE
     *
     * @mbg.generated Sat Jun 17 15:42:45 CEST 2017
     */
    public void setState(Short state) {
        this.state = state;
    }
}