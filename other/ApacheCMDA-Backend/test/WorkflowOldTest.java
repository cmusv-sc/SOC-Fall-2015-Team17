import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.*;

import org.junit.Before;
import org.junit.Test;


public class WorkflowOldTest {

	private static long TEST_ID = 0;
	private static String TEST_NAME = "name";
	private static String TEST_PURPOSE = "purpose";
	private static Date TEST_CREATE_TIME;
	private static String TEST_VERSION_NO = "versionNo";
	private static long TEST_ROOT_WORKFLOW_ID = 1;
	private List<User> TEST_USER_SET;
	private List<ClimateService> TEST_CLIMATE_SERVICE_SET;
	
	private static Workflow_old workflowOld;
	private static Workflow_old workflowOld1;
	
	public void initAddClimateService() {
		User user1 = new User();
		User user2 = new User();
		TEST_USER_SET.add(user1);
		TEST_USER_SET.add(user2);
		
		ClimateService climateService1 = new ClimateService();
		ClimateService climateService2 = new ClimateService();
		TEST_CLIMATE_SERVICE_SET.add(climateService1);
		TEST_CLIMATE_SERVICE_SET.add(climateService2);
	}
	
	@Before
	public void setUp() throws Exception{
		workflowOld = new Workflow_old();
		TEST_CREATE_TIME = new Date();
		TEST_USER_SET = new ArrayList<User>();
		TEST_CLIMATE_SERVICE_SET = new ArrayList<ClimateService>();
		
		initAddClimateService();
		workflowOld1 = new Workflow_old(TEST_NAME, TEST_PURPOSE, TEST_CREATE_TIME, TEST_VERSION_NO,
				TEST_ROOT_WORKFLOW_ID, TEST_USER_SET, TEST_CLIMATE_SERVICE_SET);
	}
	
	@Test
	public void testName(){
		workflowOld.setName(TEST_NAME);
		assertEquals(TEST_NAME, workflowOld.getName());
	}

	@Test
	public void testPurpose(){
		workflowOld.setPurpose(TEST_PURPOSE);
		assertEquals(TEST_PURPOSE, workflowOld.getPurpose());
	}
	
	@Test
	public void testCreateTime(){
		workflowOld.setCreateTime(TEST_CREATE_TIME);
		assertEquals(TEST_CREATE_TIME, workflowOld.getCreateTime());
	}
	
	@Test
	public void testVersionNo(){
		workflowOld.setVersionNo(TEST_VERSION_NO);
		assertEquals(TEST_VERSION_NO, workflowOld.getVersionNo());
	}
	
	@Test
	public void testRootWorkflowId(){
		workflowOld.setRootWorkflowId(TEST_ROOT_WORKFLOW_ID);
		assertEquals(TEST_ROOT_WORKFLOW_ID, workflowOld.getRootWorkflowId());
	}
	
	@Test
	public void testUserSet(){
		workflowOld.setUserSet(TEST_USER_SET);
		assertEquals(TEST_USER_SET, workflowOld.getUserSet());
	}
	
	@Test
	public void testClimateServiceSet(){
		workflowOld.setClimateServiceSet(TEST_CLIMATE_SERVICE_SET);
		assertEquals(TEST_CLIMATE_SERVICE_SET, workflowOld.getClimateServiceSet());
	}
}
