package org.com.zhump.mssp.entity;

public class MsspUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mssp_user.ID
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mssp_user.NAME
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mssp_user.ACCOUNT_NAME
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    private String accountName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mssp_user.PASSWORD
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mssp_user.PHONE
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mssp_user.EMAIL
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mssp_user.LOCKED
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    private Integer locked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mssp_user.SEX
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    private Integer sex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mssp_user.ID
     *
     * @return the value of mssp_user.ID
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mssp_user.ID
     *
     * @param id the value for mssp_user.ID
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mssp_user.NAME
     *
     * @return the value of mssp_user.NAME
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mssp_user.NAME
     *
     * @param name the value for mssp_user.NAME
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mssp_user.ACCOUNT_NAME
     *
     * @return the value of mssp_user.ACCOUNT_NAME
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mssp_user.ACCOUNT_NAME
     *
     * @param accountName the value for mssp_user.ACCOUNT_NAME
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mssp_user.PASSWORD
     *
     * @return the value of mssp_user.PASSWORD
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mssp_user.PASSWORD
     *
     * @param password the value for mssp_user.PASSWORD
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mssp_user.PHONE
     *
     * @return the value of mssp_user.PHONE
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mssp_user.PHONE
     *
     * @param phone the value for mssp_user.PHONE
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mssp_user.EMAIL
     *
     * @return the value of mssp_user.EMAIL
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mssp_user.EMAIL
     *
     * @param email the value for mssp_user.EMAIL
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mssp_user.LOCKED
     *
     * @return the value of mssp_user.LOCKED
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public Integer getLocked() {
        return locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mssp_user.LOCKED
     *
     * @param locked the value for mssp_user.LOCKED
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mssp_user.SEX
     *
     * @return the value of mssp_user.SEX
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mssp_user.SEX
     *
     * @param sex the value for mssp_user.SEX
     *
     * @mbggenerated Wed Aug 05 17:13:02 CST 2020
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }
}