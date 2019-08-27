package com.javaTpoint;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.javaTpoint.service.OrderService;
import com.javaTpoint.service.ProductService;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class MockitoApplicationTests {

	 @Autowired
	   private OrderService orderService;
	   
	   @Autowired
	   private ProductService productService;

	   @Test
	   public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
	      Mockito.when(productService.getProductName()).thenReturn("Mock Product Name");
	      String testName = orderService.getProductName();
	      Assert.assertEquals("Mock Product Name", testName);
	   }

}
