package com.casestudy.registration.crudtests;


import com.casestudy.registration.model.UserProfile;
import com.casestudy.registration.repository.UserProfileRepo;
import com.casestudy.registration.service.UserProfileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserProfileTests {

    @Autowired
    private UserProfileService userProfileService;

    @MockBean
    private UserProfileRepo profileRepo;

    @Test
    public void getAllUserTest() {
        when(profileRepo.findAll()).thenReturn(Stream.of(
                new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc","123456"),
                new UserProfile(3,"rahu","Deal","sadhu","sshd","123456"))
                .collect(Collectors.toList()));
        assertEquals(2,userProfileService.getAll().size());

    }

    @Test
    public void addUserTest() {
        UserProfile userProfile =new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc","123456");
        when(profileRepo.insert(userProfile)).thenReturn(userProfile);
        assertEquals(userProfile,userProfileService.addUser(userProfile));

    }

    @Test
    public void updateUsersTest() {
        UserProfile userProfile =new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc","123456");
        when(profileRepo.save(userProfile)).thenReturn(userProfile);
        assertEquals(userProfile,userProfileService.updateUser(userProfile));

    }

    @Test
    public void deleteUserTest() {
        UserProfile userProfile =new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc","123456");
        userProfileService.deleteUser(3);
        verify(profileRepo,times(1)).deleteById(3);
    }
    @Test
    public void getUserTest() {
        UserProfile userProfile =new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc","123456");
        userProfileService.getUser(3);
        verify(profileRepo,times(1)).findById(3);
    }

}
