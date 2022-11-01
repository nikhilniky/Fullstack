package com.example.fullstack.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Prdcr implements Serializable {
   private String ACTV_RSTR_IND;
    private String CUST_ID;
    private String DEL_IND;
    private String EXTRCT_RQD_IND;
    private String  FIRM_BRNCH_ID;
    private String INDV_ID;
    private String  INSERT_TMSP;
    private String  INSERT_USER_NAME;
    private String   ORG_ID;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "PRDCR_ID",nullable = false,updatable = false)
    private Long id;
    private String   PRDCR_TYPE_CD;
    private String          PURGE_IND;
    private String   RES_ST_ONE_CD;
    private String          RES_ST_TWO_CD;
    private String  UPDT_TMSP;
    private String          UPDT_USER_NAME;


    public Prdcr() {
    }

    public Prdcr(String ACTV_RSTR_IND, String CUST_ID, String DEL_IND,
                 String EXTRCT_RQD_IND, String FIRM_BRNCH_ID, String INDV_ID,
                 String INSERT_TMSP, String INSERT_USER_NAME, String ORG_ID, Long id,
                 String PRDCR_TYPE_CD, String PURGE_IND, String RES_ST_ONE_CD,
                 String RES_ST_TWO_CD, String UPDT_TMSP, String UPDT_USER_NAME) {
        this.ACTV_RSTR_IND = ACTV_RSTR_IND;
        this.CUST_ID = CUST_ID;
        this.DEL_IND = DEL_IND;
        this.EXTRCT_RQD_IND = EXTRCT_RQD_IND;
        this.FIRM_BRNCH_ID = FIRM_BRNCH_ID;
        this.INDV_ID = INDV_ID;
        this.INSERT_TMSP = INSERT_TMSP;
        this.INSERT_USER_NAME = INSERT_USER_NAME;
        this.ORG_ID = ORG_ID;
        this.id = id;
        this.PRDCR_TYPE_CD = PRDCR_TYPE_CD;
        this.PURGE_IND = PURGE_IND;
        this.RES_ST_ONE_CD = RES_ST_ONE_CD;
        this.RES_ST_TWO_CD = RES_ST_TWO_CD;
        this.UPDT_TMSP = UPDT_TMSP;
        this.UPDT_USER_NAME = UPDT_USER_NAME;
    }

    public String getACTV_RSTR_IND() {
        return ACTV_RSTR_IND;
    }

    public void setACTV_RSTR_IND(String ACTV_RSTR_IND) {
        this.ACTV_RSTR_IND = ACTV_RSTR_IND;
    }

    public String getCUST_ID() {
        return CUST_ID;
    }

    public void setCUST_ID(String CUST_ID) {
        this.CUST_ID = CUST_ID;
    }

    public String getDEL_IND() {
        return DEL_IND;
    }

    public void setDEL_IND(String DEL_IND) {
        this.DEL_IND = DEL_IND;
    }

    public String getEXTRCT_RQD_IND() {
        return EXTRCT_RQD_IND;
    }

    public void setEXTRCT_RQD_IND(String EXTRCT_RQD_IND) {
        this.EXTRCT_RQD_IND = EXTRCT_RQD_IND;
    }

    public String getFIRM_BRNCH_ID() {
        return FIRM_BRNCH_ID;
    }

    public void setFIRM_BRNCH_ID(String FIRM_BRNCH_ID) {
        this.FIRM_BRNCH_ID = FIRM_BRNCH_ID;
    }

    public String getINDV_ID() {
        return INDV_ID;
    }

    public void setINDV_ID(String INDV_ID) {
        this.INDV_ID = INDV_ID;
    }

    public String getINSERT_TMSP() {
        return INSERT_TMSP;
    }

    public void setINSERT_TMSP(String INSERT_TMSP) {
        this.INSERT_TMSP = INSERT_TMSP;
    }

    public String getINSERT_USER_NAME() {
        return INSERT_USER_NAME;
    }

    public void setINSERT_USER_NAME(String INSERT_USER_NAME) {
        this.INSERT_USER_NAME = INSERT_USER_NAME;
    }

    public String getORG_ID() {
        return ORG_ID;
    }

    public void setORG_ID(String ORG_ID) {
        this.ORG_ID = ORG_ID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long PRDCR_ID) {
        this.id = PRDCR_ID;
    }

    public String getPRDCR_TYPE_CD() {
        return PRDCR_TYPE_CD;
    }

    public void setPRDCR_TYPE_CD(String PRDCR_TYPE_CD) {
        this.PRDCR_TYPE_CD = PRDCR_TYPE_CD;
    }

    public String getPURGE_IND() {
        return PURGE_IND;
    }

    public void setPURGE_IND(String PURGE_IND) {
        this.PURGE_IND = PURGE_IND;
    }

    public String getRES_ST_ONE_CD() {
        return RES_ST_ONE_CD;
    }

    public void setRES_ST_ONE_CD(String RES_ST_ONE_CD) {
        this.RES_ST_ONE_CD = RES_ST_ONE_CD;
    }

    public String getRES_ST_TWO_CD() {
        return RES_ST_TWO_CD;
    }

    public void setRES_ST_TWO_CD(String RES_ST_TWO_CD) {
        this.RES_ST_TWO_CD = RES_ST_TWO_CD;
    }

    public String getUPDT_TMSP() {
        return UPDT_TMSP;
    }

    public void setUPDT_TMSP(String UPDT_TMSP) {
        this.UPDT_TMSP = UPDT_TMSP;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "ACTV_RSTR_IND='" + ACTV_RSTR_IND + '\'' +
                ", CUST_ID='" + CUST_ID + '\'' +
                ", DEL_IND='" + DEL_IND + '\'' +
                ", EXTRCT_RQD_IND='" + EXTRCT_RQD_IND + '\'' +
                ", FIRM_BRNCH_ID='" + FIRM_BRNCH_ID + '\'' +
                ", INDV_ID='" + INDV_ID + '\'' +
                ", INSERT_TMSP='" + INSERT_TMSP + '\'' +
                ", INSERT_USER_NAME='" + INSERT_USER_NAME + '\'' +
                ", ORG_ID='" + ORG_ID + '\'' +
                ", PRDCR_ID='" + id + '\'' +
                ", PRDCR_TYPE_CD='" + PRDCR_TYPE_CD + '\'' +
                ", PURGE_IND='" + PURGE_IND + '\'' +
                ", RES_ST_ONE_CD='" + RES_ST_ONE_CD + '\'' +
                ", RES_ST_TWO_CD='" + RES_ST_TWO_CD + '\'' +
                ", UPDT_TMSP='" + UPDT_TMSP + '\'' +
                ", UPDT_USER_NAME='" + UPDT_USER_NAME + '\'' +
                '}';
    }

    public String getUPDT_USER_NAME() {
        return UPDT_USER_NAME;
    }

    public void setUPDT_USER_NAME(String UPDT_USER_NAME) {
        this.UPDT_USER_NAME = UPDT_USER_NAME;
    }
}
