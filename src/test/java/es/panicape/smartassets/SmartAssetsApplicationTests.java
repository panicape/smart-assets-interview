package es.panicape.smartassets;

import es.panicape.smartassets.model.CreativeEntity;
import es.panicape.smartassets.persistence.IBrandRepository;
import es.panicape.smartassets.persistence.ICampaignRepository;
import es.panicape.smartassets.persistence.ICreativeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

/**
 * Tests
 *
 * @author Paulo Carrillo
 * @version 1.0 March 2024
 */
@SpringBootTest
class SmartAssetsApplicationTests {

	/**
	 * repository to handle branding data
	 */
	@Autowired
	IBrandRepository brandRepo;

	/**
	 * repository to handle creators data
	 */
	@Autowired
	ICreativeRepository creativeRepo;

	/**
	 * repository to handle campaigns data
	 */
	@Autowired
	ICampaignRepository campaignRepo;



	// Tests

	/**
	 *
	 */
	@Test
	void contextLoads() {
	}

	/**
	 *
	 */
	@Test
	public void getBrandTests() {
		Assert.notNull(brandRepo.findAll(), "SUCCESS");
	}

	/**
	 *
	 */
	@Test
	public void getCreativeTests() {
		Assert.notNull(creativeRepo.findAll(), "SUCCESS");
	}

	/**
	 *
	 */
	@Test
	public void getCampaignTests() {
		Assert.notNull(campaignRepo.findAll(), "SUCCESS");
	}
}
