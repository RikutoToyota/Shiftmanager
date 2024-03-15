package javaFW.A.ShiftManager.model; 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 
@Entity 
@Table(name="people") 
public class PostModel{ 
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column private long PostId; 
	@Column(length = 64, nullable = false) 
	private String PostName; 
	@Column(length = 1024, nullable = false) 
	private String Authority; 

	
	public long getId() { return PostId; } 
	public void setId(long PostId) { this.PostId = PostId; } 
	
	public String getNameSei() { return PostName; } 
	public void setNameSei(String PostName) { this.PostName = PostName; } 
	
	public String getNameMei() { return Authority; } 
	public void setNameMei(String Authority) { this.Authority = Authority; }
	public Object getPostName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	public void setPostName(Object postName2) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public Object getHourlyWage() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	public void setHourlyWage(Object hourlyWage) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	public Object getAuthority() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	public void setAuthority(Object authority2) {
		// TODO 自動生成されたメソッド・スタブ
		
	} 
	

}