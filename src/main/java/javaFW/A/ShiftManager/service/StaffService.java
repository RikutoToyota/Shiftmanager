package javaFW.A.ShiftManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javaFW.A.ShiftManager.model.StaffModel;
import javaFW.A.ShiftManager.repository.StaffRepository;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

   
    public void signUp(String namesei, String namemei, String password, Integer post, Integer age, String tell, String address) {
        StaffModel staff = new StaffModel();
        staff.setnamesei(namesei);
        staff.setnamemei(namemei);
        staff.setpassword(password);
        staff.setpostid(post);
        staff.setage(age);
        staff.settell(tell);
        staff.setaddress(address);
        if (staffRepository.existsByAddressOrTell(address, tell)) {
            throw new RuntimeException("このメールアドレス又は電話番号は既に使用されています");
        }
        else {
        	staffRepository.save(staff);
        }
    }
    
//    public boolean authenticateUser(String address, String password) {
//        Optional<StaffModel> Address = staffRepository.findByAddress(address);
//        if (Address != null && passwordEncoder.matches(password, Address.getpassword())) {
//            // ユーザーIDとパスワードが一致する場合はtrueを返す
//            return true;
//        }
//        return false;
//}

	public static Object getUsersList() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


    }

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javaFW.A.ShiftManager.model.StaffModel;
//import javaFW.A.ShiftManager.repository.StaffRepository;
//
//@Service
//public class StaffService {
//
//    @Autowired
//    private StaffRepository staffRepository;
//
//    public List<StaffModel> getAllStaff() {
//        return staffRepository.findAll();
//    }
//
//    public StaffModel getStaffById(String userId) {
//        return staffRepository.findById(userId).orElse(null);
//    }
//
//    public StaffModel createStaff(StaffModel staff) {
//        return staffRepository.save(staff);
//    }
//
//    public StaffModel updateStaff(String userId, StaffModel updatedStaff) {
//        StaffModel existingStaff = staffRepository.findById(userId).orElse(null);
//        
//        if (existingStaff != null) {
//            existingStaff.setNameSei(updatedStaff.getNameSei());
//            existingStaff.setNameMei(updatedStaff.getNameMei());
//            existingStaff.setAge(updatedStaff.getAge());
//            existingStaff.setTell(updatedStaff.getTell());
//            existingStaff.setAddress(updatedStaff.getAddress());
//            existingStaff.setpassword(updatedStaff.getpassword());
//
//            return staffRepository.save(existingStaff);
//        } else {
//            return null;
//        }
//    }
//
//    public void deleteStaff(StaffModel userId) {
//        staffRepository.delete(userId);
//    }
//}
