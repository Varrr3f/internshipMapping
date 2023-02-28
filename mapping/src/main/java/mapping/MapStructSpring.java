package mapping;

import dto.ApplicantDto;
import dto.ApplicationDto;
import dto.GuarantorDto;
import model.Application;
import model.Client;
import model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapStructSpring {

    @Mapping(source = "application.number", target = "number")
    @Mapping(source = "application.amount", target = "amount")
    @Mapping(source = "application.currency", target = "currency")
    ApplicationDto applicationToDto(Application application);

    @Mapping(source = "client.firstName", target = "firstName")
    @Mapping(source = "client.lastName", target = "lastName")
    @Mapping(source = "client.passportSeries", target = "passport")/////
    @Mapping(source = "client.passportNumber", target = "passport")/////
    ApplicantDto clientToDto(Client client);

    @Mapping(source = "phone.mobilePhone", target = "mobilePhone")
    @Mapping(source = "phone.homePhone", target = "homePhone")
    ApplicantDto phoneToDto(Phone phone);

    @Mapping(source = "client.firstName", target = "firstName")
    @Mapping(source = "client.lastName", target = "lastName")
    @Mapping(source = "client.passportSeries", target = "passport")/////
    @Mapping(source = "client.passportNumber", target = "passport")/////
    GuarantorDto clientToDtoSecond(Client client);

    @Mapping(source = "phone.mobilePhone", target = "mobilePhone")
    @Mapping(source = "phone.homePhone", target = "homePhone")
    GuarantorDto phoneToDtoSecond(Phone phone);

    /*===============================================================*/

    @Mapping(source = "applicationDto.number", target = "number")
    @Mapping(source = "applicationDto.amount", target = "amount")
    @Mapping(source = "applicationDto.currency", target = "currency")
    Application toApplicationEntity(ApplicationDto applicationDto);

    @Mapping(source = "applicantDto.firstName", target = "firstName")
    @Mapping(source = "applicantDto.lastName", target = "lastName")
    @Mapping(source = "applicantDto.passportSeries", target = "passport")/////
    @Mapping(source = "applicantDto.passportNumber", target = "passport")/////
    Client toClientEntity(ApplicantDto applicantDto);

    @Mapping(source = "applicantDto.", target = "number")////
    Phone toMobilePhoneEntity(ApplicantDto applicantDto);

    @Mapping(source = "applicantDto.", target = "number")////
    Phone toHomePhoneEntity(ApplicantDto applicantDto);
}
