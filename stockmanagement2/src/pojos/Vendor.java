package pojos;
// Generated Aug 7, 2022 2:45:21 PM by Hibernate Tools 4.3.1



/**
 * Vendor generated by hbm2java
 */
public class Vendor  implements java.io.Serializable {


     private String id;
     private String name;
     private String phone;
     private String email;
     private String address;

    public Vendor() {
    }

    public Vendor(String id, String name, String phone, String email, String address) {
       this.id = id;
       this.name = name;
       this.phone = phone;
       this.email = email;
       this.address = address;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }




}


