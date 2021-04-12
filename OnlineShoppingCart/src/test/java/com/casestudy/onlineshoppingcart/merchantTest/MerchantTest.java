package com.casestudy.onlineshoppingcart.merchantTest;

import com.casestudy.onlineshoppingcart.model.Address;
import com.casestudy.onlineshoppingcart.model.Merchant;
import com.casestudy.onlineshoppingcart.repository.MerchantRepo;
import com.casestudy.onlineshoppingcart.service.MerchantService;
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
public class MerchantTest {


    @Autowired
    private MerchantService merchantService;
    @MockBean
    private MerchantRepo merchantRepo;

    @Test
    public void getAllMerchantsTest() {
        when(merchantRepo.findAll()).thenReturn(Stream.of(
                new Merchant("dvsvfdv","Samsung Edge",new Address("Agram","HAL","Bengaluru","Karnataka",123456),30000.0),
                new Merchant("dvsvfdv","Samsung Edge",new Address("Agram","HAL","Bengaluru","Karnataka",123456),30000.0),
                new Merchant("dvsvfdv","Samsung Edge",new Address("Agram","HAL","Bengaluru","Karnataka",123456),30000.0))
               .collect(Collectors.toList()));

        assertEquals(3,merchantService.getAll().size());
    }

    @Test
    public void addMerchantTest() {
        Merchant merchant =new Merchant("dvsvfdv","Samsung Edge",new Address("Agram","HAL","Bengaluru","Karnataka",123456),30000.0);
        when(merchantRepo.insert(merchant)).thenReturn(merchant);
        assertEquals(merchant,merchantService.addMerchant(merchant));

    }

    @Test
    public void updateMerchantsTest() {
        Merchant merchant =new Merchant("dvsvfdv","Samsung Edge",new Address("Agram","HAL","Bengaluru","Karnataka",123456),30000.0);
        when(merchantRepo.save(merchant)).thenReturn(merchant);
        assertEquals(merchant,merchantService.updateMerchant(merchant));

    }

    @Test
    public void deleteMerchantTest() {
        Merchant merchant =new Merchant("dvsvfdv","Samsung Edge",new Address("Agram","HAL","Bengaluru","Karnataka",123456),30000.0);
        merchantService.deleteMerchant(3);
        verify(merchantRepo,times(1)).deleteById(3);
    }
    @Test
    public void getMerchantTest() {
        Merchant merchant =new Merchant("dvsvfdv","Samsung Edge",new Address("Agram","HAL","Bengaluru","Karnataka",123456),30000.0);
        merchantService.getMerchant(3);
        verify(merchantRepo,times(1)).findById(3);
    }

}
