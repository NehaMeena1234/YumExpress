/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.pojo;

/**
 *
 * @author Neha Meena
 */
public class StaffPojo {

    public StaffPojo(String staffId, String companyId, String emailId, String password, String staffName) {
        this.staffId = staffId;
        this.companyId = companyId;
        this.emailId = emailId;
        this.password = password;
        this.staffName = staffName;
    }
    public StaffPojo(){
        
    }

    @Override
    public String toString() {
        return "StaffPojo{" + "staffId=" + staffId + ", companyId=" + companyId + ", emailId=" + emailId + ", password=" + password + ", staffName=" + staffName + '}';
    }

    public String getStaffId() {
        return staffId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    private String staffId;
    private String companyId;
    private String emailId;
    private String password;
    private String staffName ;
  
}