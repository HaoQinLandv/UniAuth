package com.dianrong.common.auth.server.data.entity;

public class SlActorWithBLOBs extends SlActor {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SL$ACTOR.CREDENTIAL
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    private byte[] credential;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SL$ACTOR.PAYMENT_PASSWORD
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    private byte[] paymentPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SL$ACTOR.CREDENTIAL_SALT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    private byte[] credentialSalt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SL$ACTOR.PAYMENT_PASSWORD_SALT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    private byte[] paymentPasswordSalt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SL$ACTOR.CREDENTIAL
     *
     * @return the value of SL$ACTOR.CREDENTIAL
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public byte[] getCredential() {
        return credential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SL$ACTOR.CREDENTIAL
     *
     * @param credential the value for SL$ACTOR.CREDENTIAL
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void setCredential(byte[] credential) {
        this.credential = credential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SL$ACTOR.PAYMENT_PASSWORD
     *
     * @return the value of SL$ACTOR.PAYMENT_PASSWORD
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public byte[] getPaymentPassword() {
        return paymentPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SL$ACTOR.PAYMENT_PASSWORD
     *
     * @param paymentPassword the value for SL$ACTOR.PAYMENT_PASSWORD
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void setPaymentPassword(byte[] paymentPassword) {
        this.paymentPassword = paymentPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SL$ACTOR.CREDENTIAL_SALT
     *
     * @return the value of SL$ACTOR.CREDENTIAL_SALT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public byte[] getCredentialSalt() {
        return credentialSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SL$ACTOR.CREDENTIAL_SALT
     *
     * @param credentialSalt the value for SL$ACTOR.CREDENTIAL_SALT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void setCredentialSalt(byte[] credentialSalt) {
        this.credentialSalt = credentialSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SL$ACTOR.PAYMENT_PASSWORD_SALT
     *
     * @return the value of SL$ACTOR.PAYMENT_PASSWORD_SALT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public byte[] getPaymentPasswordSalt() {
        return paymentPasswordSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SL$ACTOR.PAYMENT_PASSWORD_SALT
     *
     * @param paymentPasswordSalt the value for SL$ACTOR.PAYMENT_PASSWORD_SALT
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void setPaymentPasswordSalt(byte[] paymentPasswordSalt) {
        this.paymentPasswordSalt = paymentPasswordSalt;
    }
}