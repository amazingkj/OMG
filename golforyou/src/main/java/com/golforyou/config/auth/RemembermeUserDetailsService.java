//package com.golforyou.config.auth;
//
//import java.util.Map;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class RemembermeUserDetailsService implements UserDetailsService {
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		 Map<String, Object> user = authService.getUser(username);
//		 if (user == null) {
//			 throw new UsernameNotFoundException(username + "is not found."); 
//			 }                
//		 
//		 PrincipalDetails principalDetails = new PrincipalDetails(username, user.get("password").toString());
//		 principalDetails.setMRoles((List<GrantedAuthority>) getAuthorities(username));
//		 return principalDetails;
//
//
//	}
//    public Collection<GrantedAuthority> getAuthorities(String username) {  
//    	List<Object> authList = authService.getUserRolesList(username);  
//    	List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();  
//    	for(int inx = 0 ; inx < authList.size() ; inx ++) {    
//    		Map<String, String> auth = (Map<String, String>) authList.get(inx);  
//    		roles.add(new SimpleGrantedAuthority(auth.get("AUTHORITY"))); 
//    		}             
//    	return roles;
//    		
//    }
//}
