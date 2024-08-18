// src/test/java/com/example/shuttlereservation/ShuttleServiceTests.java

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.example.shuttlereservation.service.ShuttleService;
import com.example.shuttlereservation.repository.ShuttleRepository;
import com.example.shuttlereservation.model.Shuttle;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ShuttleServiceTests {

	@InjectMocks
	private ShuttleService shuttleService;

	@Mock
	private ShuttleRepository shuttleRepository;

	@Test
	public void contextLoads() {
		assertNotNull(shuttleService);
	}

	@Test
	public void testGetShuttles() {
		when(shuttleRepository.findAll()).thenReturn(Collections.singletonList(new Shuttle()));
		List<Shuttle> shuttles = shuttleService.getAllShuttles();
		assertNotNull(shuttles);
		assertFalse(shuttles.isEmpty());
	}
}
