//package com.reactfullstack.rest.webservices.restfulwebservices.basicAuth;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;

/*@Configuration
public class BasicAuthenticationConfiguration {

	//filter chain
	//authenticate all requests
	//basic authentication
	//disabling CSRF
	//stateless rest API
	
	//1.Response to preflight request doesn't pass access control check
	 //2.basic auth
	
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return 
				http
					.authorizeHttpRequests(
						auth -> 
							auth
							.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
							.anyRequest().authenticated()
						)
					.httpBasic(Customizer.withDefaults())
					.sessionManagement(
						session -> session.sessionCreationPolicy
						(SessionCreationPolicy.STATELESS))
						// .csrf().disable() Deprecated in SB 3.1.x
					.csrf(csrf -> csrf.disable()) // Starting from SB 3.1.x using Lambda DSL
			     // .csrf(AbstractHttpConfigurer::disable) // Starting from SB 3.1.x using Method Reference
					.build();
		
	}
	
}*/
//@Configuration
/*public class BasicAuthenticationConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests(authorize -> authorize
                .antMatchers(HttpMethod.OPTIONS, "http://localhost:3000/**").permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults())
            .sessionManagement(session -> session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .sessionFixation(sessionFixation -> sessionFixation.none()))
            .csrf().disable();

        return http.build();
    }
}

*/