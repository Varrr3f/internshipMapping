package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApplicantDto {

//    @JsonProperty("firstName")
    private String firstName;

//    @JsonProperty("lastName")
    private String lastName;

//    @JsonProperty("passport")
    private String passport; //10 символов

    @JsonProperty("mobilePhone")
    private String mobilePhone; //11 символов

    @JsonProperty("homePhone")
    private String homePhone; //11 символов
}
