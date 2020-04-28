package io.github.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.github.security.models.MyUserDetails;
import io.github.security.models.Userkl;

/*
 * in case of spring jpa security
 */
@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		return new MyUserDetails(username);
		
		Optional<Userkl> user = userRepository.findByUserName(username);
		user.orElseThrow(()->new UsernameNotFoundException("Not Found: "+username));
		return user.map(MyUserDetails::new).get();
	}

}