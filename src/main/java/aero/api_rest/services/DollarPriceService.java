package aero.api_rest.services;

import aero.api_rest.models.DollarRateDTO;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Optional;

import static aero.api_rest.utils.Constants.*;

@Service
public class DollarPriceService {

    public float getDollarRateARS() {
        Optional<DollarRateDTO> dollarRateDTO = getDollarRateDTO();
        if (!dollarRateDTO.isPresent() || dollarRateDTO.get().getRate() < 1) return 1;
        return dollarRateDTO.get().getRate();
    }

    private Optional<DollarRateDTO> getDollarRateDTO() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response;

        try {
            response = restTemplate.getForEntity(DOLLAR_PRICE_URL, String.class);
        } catch (HttpClientErrorException e) {
            System.out.println(e);
            return Optional.empty();
        }
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        try {
            root = mapper.readTree(response.getBody());
        } catch (IOException e) {
            System.out.println(e);
            return Optional.empty();
        }
        DollarRateDTO dollarRateDTO = mapper.convertValue(root, DollarRateDTO.class);
        return Optional.of(dollarRateDTO);
    }
}
