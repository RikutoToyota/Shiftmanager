package javaFW.A.ShiftManager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.httpBasic(
			(basic) ->
			basic.disable()
		);
		return http.build();
	}
}

//package javaFW.A.ShiftManager.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    private UserDetailsService userDetailsService;
//	private UserDetailsService userService;
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http
//				.httpBasic(
//						(basic) -> basic.disable())
//				.authorizeHttpRequests(request -> {
//					request
//							.requestMatchers("/").permitAll()     // ログインページは全許可
//							.requestMatchers("/signup").permitAll()  // 新規登録ページは全許可
//							.requestMatchers("/js/**").permitAll()      // JSのstaticファイル
//							.requestMatchers("/css/**").permitAll()     // CSSのstaticファイル
//							.requestMatchers("/images/**").permitAll()  // 画像のstaticファイル
//							.anyRequest().authenticated();              // それ以外は認証必須
//				})
//				.formLogin(form -> {
//					form
//							.loginPage("/")             // ログインページのURI
//							.loginProcessingUrl("/")    // ログインを実施するページのURI
//							.defaultSuccessUrl("/shift")           // ログイン完了後の遷移先
//							.failureUrl("/?error=true") // ログインエラーページのURI
//							.usernameParameter("Address") // ログインユーザのname属性
//							.passwordParameter("password");   // ログインパスワードのname属性
//				})
//				.userDetailsService(this.userService)
//				.logout(logout -> {
//					logout
//							.logoutUrl("/logout")
//							.logoutSuccessUrl("/login")
//							.deleteCookies("JSESSIONID")
//							.invalidateHttpSession(true);
//				});
//		return http.build();
//	}
//    
//    public InMemoryUserDetailsManager userDetailsManager() {
//    	String username = "user";
//    	String password = "pass";
//    	
//    	UserDetails user = User.withUsername(username)
//    			.password(
//    					PasswordEncoderFactories
//    					.createDelegatingPasswordEncoder()
//    					.encode(password))
//    			.roles("USER")
//    			.build();
//    	return new InMemoryUserDetailsManager(user);
//    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
// }    

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	private final UserDetailsService userService = null;
//
//	@Bean
//	public UserDetailsManager userDetailsManager() {
//		JdbcUserDetailsManager jdbcManager = new JdbcUserDetailsManager();
//		return jdbcManager;
//	}
//
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		return bCryptPasswordEncoder;
//	}
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http
//				.httpBasic(
//						(basic) -> basic.disable())
//				.authorizeHttpRequests(request -> {
//					request
//							.requestMatchers("/").permitAll()     // ログインページは全許可
//							.requestMatchers("/signup").permitAll()  // 新規登録ページは全許可
//							.requestMatchers("/webjars/**").permitAll() // webjarsのパスは全許可
//							.requestMatchers("/js/**").permitAll()      // JSのstaticファイル
//							.requestMatchers("/css/**").permitAll()     // CSSのstaticファイル
//							.requestMatchers("/images/**").permitAll()  // 画像のstaticファイル
//							.anyRequest().authenticated();              // それ以外は認証必須
//				})
//				.formLogin(form -> {
//					form
//							.loginPage("/")             // ログインページのURI
//							.loginProcessingUrl("/")    // ログインを実施するページのURI
//							.defaultSuccessUrl("/shift")           // ログイン完了後の遷移先
//							.failureUrl("/?error=true") // ログインエラーページのURI
//							.usernameParameter("Address") // ログインユーザのname属性
//							.passwordParameter("password");   // ログインパスワードのname属性
//				})
//				.userDetailsService(this.userService)
//				.logout(logout -> {
//					logout
//							.logoutUrl("/logout")
//							.logoutSuccessUrl("/login")
//							.deleteCookies("JSESSIONID")
//							.invalidateHttpSession(true);
//				});
//		return http.build();
//	}
//
//}