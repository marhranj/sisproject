package com.sis.project.security;


import com.sis.project.model.Role;
import com.sis.project.model.User;
import com.sis.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException
    {
        final User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail);
        if (user == null)
        {
            return new org.springframework.security.core.userdetails.User(" ", " ", new HashSet<>());
        }
        final Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (final Role r : user.getRoles())
        {
            grantedAuthorities.add(new SimpleGrantedAuthority(r.getName().toUpperCase()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }

}
