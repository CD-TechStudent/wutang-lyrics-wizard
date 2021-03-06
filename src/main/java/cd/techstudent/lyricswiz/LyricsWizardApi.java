package cd.techstudent.lyricswiz;

import cd.techstudent.lyricswiz.services.GeniusApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LyricsWizardApi implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(LyricsWizardApi.class);

	@Autowired
	private GeniusApiService geniusApiService;

	public static void main(String[] args) {
		SpringApplication.run(LyricsWizardApi.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		logger.info(geniusApiService.getLyrics("22222"));
	}
}
