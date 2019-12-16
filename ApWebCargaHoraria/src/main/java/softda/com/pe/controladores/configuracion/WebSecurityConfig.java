package softda.com.pe.controladores.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

http.authorizeRequests()
.antMatchers("/css/**", "/imagenes/**", "/js/**", "/", "/Principal", "/home", "/inicio", "/logeo", "/login","/listarTodo","/rest/**")
.permitAll()
.anyRequest().authenticated()
	.and().formLogin().loginPage("/login").defaultSuccessUrl("/Principal", true).permitAll()
	.and().logout()
	.permitAll();

}

	@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

	PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	auth.inMemoryAuthentication().withUser("admin").password(encoder.encode("admin")).roles("ADMIN").and()
	.withUser("doc").password(encoder.encode("doc")).roles("DOCENT").and();
	}

}
