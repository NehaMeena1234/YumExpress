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
public class CompanyPojo {

    public CompanyPojo(String companyId, String companyName, String ownerName, String Password, String emailId, String securityKey) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.ownerName = ownerName;
        this.Password = Password;
        this.emailId = emailId;
        this.securityKey = securityKey;
    }
public CompanyPojo(){
    
}
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }
    private String companyId;
    private String companyName;
    private String ownerName;
    private String Password;
    private String emailId;
    private String securityKey;
    
    


}