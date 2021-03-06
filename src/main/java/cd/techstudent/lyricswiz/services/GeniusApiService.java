package cd.techstudent.lyricswiz.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
public class GeniusApiService {
    private static Logger logger = LoggerFactory.getLogger(GeniusApiService.class);

    @Value("${geniusUri}")
    private String baseUri;

    @Value("${geniusToken}")
    private String token;

    private RestTemplate restTemplate;
    private HttpHeaders headers;

    public GeniusApiService(){
        this.restTemplate = new RestTemplate();
    }

    @PostConstruct
    public void setUpPostConstruct(){
        logger.debug("Setting headers with token {}", token);
        headers = new HttpHeaders();
        headers.add("content-type", "application/json" );
        headers.add("Authorization", "Bearer " + token );
    }

    public String getLyrics(String artistId){
        String uri = String.format("%sartist/%s",baseUri , artistId);
        HttpEntity<String> request = new HttpEntity<>("", headers);
        //ResponseEntity<String> data = restTemplate.exchange(uri, HttpMethod.GET, request, String.class);
        return uri;//data.getBody();
    }


}
