package concreties;

import java.rmi.RemoteException;

import abstracts.UserValidService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserValidManager implements UserValidService {

	private KPSPublicSoapProxy kps;
	
	
	
	public UserValidManager(KPSPublicSoapProxy kps) {
		
		this.kps = kps;
	}



	@Override
	public boolean personIsValid(User user) {
		boolean valid= false;

		long nationalId = Long.valueOf(user.getNationalityId());
		int yearOfBirth = user.getYearOfBirth().getYear();
		
		try {
			if(this.kps.TCKimlikNoDogrula(nationalId, user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), yearOfBirth)) {
				
				valid=true;
			}
		} catch (RemoteException e) {
			
			e.printStackTrace();
			valid=false;
		}
		
		
		return valid;
	}

}
