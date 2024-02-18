import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Healthcare.manage.Healthcare;
import com.Healthcare.manage.PatientDao;

public class start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Patient Management App");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 to ADD Patient");
			System.out.println("PRESS 2 to DELETE Patient");
			System.out.println("PRESS 3 to DISPLAY Patient");
			System.out.println("PRESS 4 to EXIT App");
			int c= Integer.parseInt(br.readLine());
			
			if(c==1) 
			{
				//add Patient...
				System.out.println("Enter Patient Name : ");
				String name = br.readLine();
				
				System.out.println("Enter Patient Phone : ");
				String phone=br.readLine();
				
				System.out.println("Enter Patient Age : ");
				String age=br.readLine();
				
				System.out.println("Enter Patient city : ");
				String city=br.readLine();
				
				//create student object to store student
				Healthcare st= new Healthcare(name, phone,age,city);
				boolean answer = PatientDao.insertpatientToDB(st);
				if(answer)
				{
					System.out.println("Patient successfully added......");
				}
				else
				{
					System.out.println("somethimg went wrong....");
				}
				System.out.println(st);
				
			}else if(c==2)
			{
				//delete patient....
				System.out.println("Enter Patient ID to delete");
				int patientId= Integer.parseInt(br.readLine());
				boolean f=PatientDao.deletePatient(patientId);
				
				if(f)
				{
					System.out.println("Deleted.....");
				}
				else
				{
					System.out.println("Something went wrong......");
				}
			}else if(c==3)
			{
				//display patient....
				PatientDao.showAllPatient();
			}else if(c==4)
			{
				//exit...
				break;
			}else
			{
				
			}
		}
		System.out.println("Thank You for using application");
	}

}

