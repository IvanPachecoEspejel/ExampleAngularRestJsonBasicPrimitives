package ivan.example.bean;

import java.util.Date;

public class BeanEmployee {

    private Integer intId;
    private String strName;
    private Date dateBirth;
    private BeanEmployee beanBoss;
    
    public BeanEmployee(){}

    public BeanEmployee(Integer identifier, 
            String employeeName, 
            Date birthDate, 
            BeanEmployee boos){

        this.intId = identifier;
        this.strName = employeeName;
        this.dateBirth = birthDate;
        this.beanBoss = boos;
    }

    public BeanEmployee(Integer identifier, 
            String employeeName, 
            Date birthDate){

        this.intId = identifier;
        this.strName = employeeName;
        this.dateBirth = birthDate;
        this.beanBoss = null;
    }

    /**
     * @return the intId
     */
    public Integer getIntId() {
        return intId;
    }
    /**
     * @param intId the intId to set
     */
    public void setIntId(Integer intId) {
        this.intId = intId;
    }
    /**
     * @return the strName
     */
    public String getStrName() {
        return strName;
    }
    /**
     * @param strName the strName to set
     */
    public void setStrName(String strName) {
        this.strName = strName;
    }
    /**
     * @return the dateBirth
     */
    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * @param dateBirth the dateBirth to set
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /**
     * @return the beanBoss
     */
    public BeanEmployee getBeanBoss() {
        return beanBoss;
    }
    /**
     * @param beanBoss the beanBoss to set
     */
    public void setBeanBoss(BeanEmployee beanBoss) {
        this.beanBoss = beanBoss;
    }

}
