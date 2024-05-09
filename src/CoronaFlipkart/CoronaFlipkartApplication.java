package CoronaFlipkart;

import CoronaFlipkart.entity.Admin;
import CoronaFlipkart.entity.SelfAssessment;
import CoronaFlipkart.entity.Symptoms;
import CoronaFlipkart.entity.User;
import CoronaFlipkart.inmemory.PandemicInMemory;
import CoronaFlipkart.inmemory.UserInMemory;
import CoronaFlipkart.service.AdminInterface;
import CoronaFlipkart.service.PandemicInterface;
import CoronaFlipkart.service.impl.AdminServiceImpl;
import CoronaFlipkart.service.impl.PandemicServiceImpl;
import CoronaFlipkart.service.impl.UserServiceImpl;

public class CoronaFlipkartApplication {

	public void execute() {

		UserInMemory userInMemory = new UserInMemory();
		PandemicInMemory pandemicInMemory = new PandemicInMemory();

		CoronaFlipkart.service.UserInterface userInterface = new UserServiceImpl(userInMemory);
		AdminInterface adminInterface = new AdminServiceImpl(userInMemory, pandemicInMemory);
		PandemicInterface pandemicInterface = new PandemicServiceImpl(pandemicInMemory);
		User user = new User("Rajiv", "99939495", "20024");
		userInterface.registerUser(user);
		userInterface.showUser();

		userInterface.RemoveUsers();
		SelfAssessment selfAssessment = new SelfAssessment();
		Symptoms symptoms = new Symptoms();
		symptoms.setHeadache(true);
		selfAssessment.setSymptoms(symptoms);
		selfAssessment.setTravelAffectedArea(true);

		userInterface.selfAssessment("99939495", selfAssessment);

		Admin admin = new Admin("Admin", "94855732", "20024", "amdin");
		adminInterface.registerUser(admin);

		userInterface.showUser();
		adminInterface.PandemicResult("94855732", "99939495", com.example.CoronaFlipkart.enums.Status.Yes);
		pandemicInterface.getZone("20024");
		adminInterface.PandemicResult("94855732", "99939495", com.example.CoronaFlipkart.enums.Status.No);
		pandemicInterface.getZone("20024");
//		System.out.println("Heelo");

//		SpringApplication.run(CoronaFlipkartApplication.class, args);

	}

}
