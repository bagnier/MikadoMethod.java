package mastercrupt;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import mastercrupt.UI;

import org.junit.Test;

public class AcceptanceTest {
	@Test
	public void testLeeting() throws Exception {
		UI ui = new UI();
		assertThat(ui.leetMessage("Secret"), is("Leeted: S3cr3t"));
	}
}