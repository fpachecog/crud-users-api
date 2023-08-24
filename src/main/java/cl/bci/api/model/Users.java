package cl.bci.api.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Type;

/**
*
* @author francisco
*/
@Entity
@Table(name = "users")
@XmlRootElement
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Type(type = "uuid-char")
    @Column(name = "user_id")
    private UUID userId;
	@Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "created")
    private Timestamp created;
    @Basic(optional = false)
    @Column(name = "modified")
    private Timestamp modified;
    @Basic(optional = false)
    @Column(name = "last_login")
    private Timestamp lastLogin;
    @Basic(optional = false)
    @Column(name = "token")
    private String token;
    @Basic(optional = false)
    @Column(name = "isactive")
    private Boolean isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Phones> phoneList;
    
    public Users() {}
    
    public Users(UUID userId) {
    	this.userId = userId;
    }
    
	public Users(UUID userId, String name, String email, String password, Timestamp created, Timestamp modified,
			Timestamp lastLogin, String token, Boolean isActive) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.created = created;
		this.modified = modified;
		this.lastLogin = lastLogin;
		this.token = token;
		this.isActive = isActive;
	}

	public UUID getId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getModified() {
		return modified;
	}

	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

	public Timestamp getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public List<Phones> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<Phones> phoneList) {
		this.phoneList = phoneList;
	}
    
    
}
