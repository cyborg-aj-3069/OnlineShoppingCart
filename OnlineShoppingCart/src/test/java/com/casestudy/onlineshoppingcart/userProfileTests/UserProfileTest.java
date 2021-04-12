package com.casestudy.onlineshoppingcart.userProfileTests;

import com.casestudy.onlineshoppingcart.model.UserProfile;
import com.casestudy.onlineshoppingcart.repository.UserProfileRepo;
import com.casestudy.onlineshoppingcart.service.UserProfileService;
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
public class UserProfileTest {

    @Autowired
    private UserProfileService userProfileService;

    @MockBean
    private UserProfileRepo profileRepo;

    @Test
    public void getAllUserTest() {
        when(profileRepo.findAll()).thenReturn(Stream.of(
                new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc"),
                new UserProfile(3,"rahu","Deal","sadhu","sshd"))
                .collect(Collectors.toList()));
        assertEquals(2,userProfileService.getAll().size());

    }

    @Test
    public void addUserTest() {
        UserProfile userProfile =new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc");
        when(profileRepo.insert(userProfile)).thenReturn(userProfile);
        assertEquals(userProfile,userProfileService.addUser(userProfile));

    }

    @Test
    public void updateUsersTest() {
        UserProfile userProfile =new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc");
        when(profileRepo.save(userProfile)).thenReturn(userProfile);
        assertEquals(userProfile,userProfileService.updateUser(userProfile));

    }

    @Test
    public void deleteUserTest() {
        UserProfile userProfile =new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc");
        userProfileService.deleteUser(3);
        verify(profileRepo,times(1)).deleteById(3);
    }
    @Test
    public void getUserTest() {
        UserProfile userProfile =new UserProfile(3,"rahul","Dealer","ssadjhcb","scbshdc");
        userProfileService.getUser(3);
        verify(profileRepo,times(1)).findById(3);
    }

}
