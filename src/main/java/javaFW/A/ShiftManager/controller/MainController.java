package javaFW.A.ShiftManager.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javaFW.A.ShiftManager.model.ShiftModel;
import javaFW.A.ShiftManager.model.StaffModel;
import javaFW.A.ShiftManager.repository.ShiftRepository;
import javaFW.A.ShiftManager.service.ShiftService;
import javaFW.A.ShiftManager.service.StaffService;

@Controller
public class MainController {
	
    @Autowired
    private StaffService staffService;
  
    
    @Autowired
    private ShiftService shiftService;
    
	@GetMapping("/")
	public String getlogin(Model model){
    return "login";
  }
	
	@PostMapping("/")
	public String postlogin(@RequestParam String address, @RequestParam String password, ShiftModel model){
//		// ログイン処理を実装
//        if (staffService.authenticateUser(address, password)) {
//            // ログイン成功時の処理
            return "home"; // ダッシュボードページにリダイレクト
//        } else {
//            // ログイン失敗時の処理
//            model.addAttribute("error", "ユーザーIDまたはパスワードが正しくありません");
//	    return "login";
//	}
	}
	@GetMapping("/shift")
	public String index(Model model) {
		
		return "home";
	}
	
	@RequestMapping("/shift")
	public ModelAndView index(ModelAndView model) {
		model.setViewName("home");
		List<ShiftModel>list = shiftService.getAllShifts();
		model.addObject("list",list);
		return model;
	}
	
	
	@GetMapping("/shiftform")
	public String shiftform(Model model) {
		return "shiftform";
	}
	
	@GetMapping("/jikyu")
	public String jikyu(Model model) {
		return "calculation";
	}
	

	@GetMapping("/signup")
	public String getsignup(StaffModel user) {
		
		return "signup";
	}
	@PostMapping("/signup")
	public String processSignUp(
			@RequestParam("namesei") String namesei,
			@RequestParam("namemei") String namemei,
			@RequestParam("password") String password,
			@RequestParam("postid") Integer postid,
			@RequestParam("age") Integer age,
			@RequestParam("tell") String tell,
			@RequestParam("addres") String address,
			RedirectAttributes redirectAttributes) {
 
		try {
			staffService.signUp(namesei, namemei, password, postid, age, tell, address);
			return "redirect:/";
		} catch (RuntimeException e) {
			redirectAttributes.addFlashAttribute("error", e.getMessage());
			return "redirect:/signup";
		}
 
	}
	@GetMapping("/staff")
	public String staff(@AuthenticationPrincipal StaffModel user) {
		StaffModel.addAttribute("userList", StaffService.getUsersList());
		return "staff";
	}
//	@PostMapping("/save")
//	public String saveUser(@RequestParam("password") String password,
//	                       @RequestParam("NameSei") String namesei,
//	                       @RequestParam("NameMei") String namemei,
//	                       @RequestParam("Age") int age,
//	                       @RequestParam("PostId")int post,
//	                       @RequestParam("Tell") String tell,
//	                       @RequestParam("Address") String address) {
//	    StaffModel user = new StaffModel();
//	    user.setpassword(password);
//	    user.setLastName(namesei);
//	    user.setFirstName(namemei);
//	    user.setAge(age);
//	    user.setPostId(post);
//	    user.setPhoneNumber(tell);
//	    user.setEmailAddress(address);
//	    
//	    staffService.createUser(user);
//	    
//	    return "home"; // 保存後に遷移するページを指定します
//	}
	   @Autowired
	    private ShiftRepository shiftRepository;

	    @PostMapping("/shiftform")
	    public String shiftform(@RequestParam String shiftStart,
	                            @RequestParam String shiftEnd,
	                            @RequestParam String userId,
	                            @RequestParam String date,
	                            ShiftModel model) {
	        // シフトを保存するためのShiftオブジェクトを作成
	        ShiftModel shift = new ShiftModel();
	        shift.setShiftStart(shiftStart);
	        shift.setShiftEnd(shiftEnd);
	        shift.setUserId(userId);
	        // Date型に変換して設定
	        shift.setDate(Date.valueOf(date));

	        // シフトをデータベースに保存
	        shiftRepository.save(shift);

	        // 保存が完了したら成功メッセージを表示する
	        model.addAttribute("message", "Shift saved successfully.");

	        // 成功メッセージを含むページにリダイレクト
	        return "redirect:/shift";
	    }
	}


	

