package javaFW.A.ShiftManager.model; 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "staffs")
public class StaffModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int userId;

    @Column(name = "PostId")
    private int postId;

    @Column(name = "NameSei")
    private String namesei;

    @Column(name = "NameMei")
    private String namemei;

    @Column(name = "Age")
    private int age;

    @Column(name = "Tell", unique = true)
    private String tell;

    @Column(name = "Address", unique = true)
    private String address;

    @Column(name = "password")
    private String password;
    
	public String getpassword() {return password;}
	public void setpassword(String password) {this.password = password;}
	public static void addAttribute(String string, Object usersList) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public void setnamesei(String namesei) {
		// TODO 自動生成されたメソッド・スタブ
		this.namesei = namesei;
		
	}
	public void setnamemei(String namemei) {
		// TODO 自動生成されたメソッド・スタブ
		this.namemei = namemei;
	}
	public void setage(int age) {
		// TODO 自動生成されたメソッド・スタブ
		this.age = age;
	}
	public void settell(String tell) {
		// TODO 自動生成されたメソッド・スタブ
		this.tell = tell;
	}
	public void setaddress(String address) {
		// TODO 自動生成されたメソッド・スタブ
		this.address = address;
	}
	public void setpostid(int post) {
		// TODO 自動生成されたメソッド・スタブ
		this.postId = post;
	}




    // Getter and Setter methods
}


//@Entity 
//@Table(name="staff_table") 
//public class StaffModel{ 
//	@Id 
//	@GeneratedValue(strategy = GenerationType.AUTO) 
//	@Column(length = 32, nullable = false) 
//	private String NameSei; 
//	@Column(length = 32, nullable = false) 
//	private String NameMei;
//	@Column(length = 11, nullable = false)
//	private Integer Age;
//	@Column(length = 1024, nullable = false) 
//	private String Address; 
//	@Column(length = 16, nullable = true) 
//	private String Tell; 
//	@Column(length = 11 ,nullable = true) 
//	private Integer post;
//	@Column(length = 255 ,nullable = false)
//	private String password;
//		
//	public String getNameSei() { return NameSei; } 
//	public void setNameSei(String NameSei) { this.NameSei = NameSei; } 
//	
//	public String getNameMei() { return NameMei; } 
//	public void setNameMei(String NameMei) { this.NameMei = NameMei; } 
//	
//	public String getAddress() { return Address; } 
//	public void setAddress(String Address) { this.Address = Address; } 
//
//	public String getTell() { return Tell; } 
//	public void setTell(String Tell) {
//		this.Tell = Tell;
//	}
//	
//	public Integer getpost() {return post; }
//	public void setpost(Integer post) {this.post = post; }
//	
//	public Integer getAge() {return Age; }
//	public void setAge(Integer Age) {this.Age = Age; }
//	
//	public String getpassword() {return password;}
//	public void setpassword(String password) {this.password = password;}
//}