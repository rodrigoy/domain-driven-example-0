package hotel.infra;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.wideplay.warp.persist.PersistenceService;

@Singleton
public class JpaInitializer {
	
	@Inject 
	JpaInitializer(PersistenceService service) {
		service.start(); 
	} 
}
