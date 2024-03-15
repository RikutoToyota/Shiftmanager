package javaFW.A.ShiftManager.model; 
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 
@Entity 
@Table(name="shifts") 
public class ShiftModel{ 
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column private long ShiftId; 
	@Column(length = 16, nullable = false) 
	private String ShiftStart; 
	@Column(length = 16, nullable = false) 
	private String ShiftEnd; 
	@Column(length = 32, nullable = false)
	private String UserId;
	@Column(nullable = false) 
	private Date Date;
	

	
	public long getShiftId() { return ShiftId; } 
	public void setShiftId(long ShiftId) { this.ShiftId = ShiftId; } 
	
	public String getShiftStart() { return ShiftStart; } 
	public void setShiftStart(String PostName) { this.ShiftStart = PostName; } 
	
	public String getShiftEnd() { return ShiftEnd; } 
	public void setShiftEnd(String ShiftEnd) { this.ShiftEnd = ShiftEnd; } 
	
	public String getUserId() {return UserId; }
	public void setUserId(String UserId) {this.UserId = UserId; }
	
	public Date getDate() {return Date; }
	public void setDate(Date Date) {this.Date = Date; }
	public void addAttribute(String string, String string2) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}