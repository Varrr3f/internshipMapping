package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApplicationDto {

//    @JsonProperty("number")
    private int number;

//    @JsonProperty("amount")
    private int amount;

//    @JsonProperty("currency")
    private String currency;

//    @JsonProperty("applicant")
    private ApplicantDto applicantDto;

//    @JsonProperty("guarantor")
    private GuarantorDto guarantorDto;
}
