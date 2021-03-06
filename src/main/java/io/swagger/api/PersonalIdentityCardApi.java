/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.PersonalIdentityCard;
import org.springframework.core.io.Resource;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-02T16:04:50.980Z")

@Api(value = "personalIdentityCard", description = "the personalIdentityCard API")
@RequestMapping(value = "/api")
public interface PersonalIdentityCardApi {

    @ApiOperation(value = "Get Personal Identity Card for the User", nickname = "getPersonalIdentityCard", notes = "", response = PersonalIdentityCard.class, authorizations = {
        @Authorization(value = "Token")
    }, tags={ "PersonalIdentityCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved Personal Identity Card model", response = PersonalIdentityCard.class),
        @ApiResponse(code = 404, message = "Personal Identity Card for this {userId} not found") })
    @RequestMapping(value = "/personalIdentityCard/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<PersonalIdentityCard> getPersonalIdentityCard(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"dateOfExpiry\" : \"04 07 2022\",  \"nationality\" : \"Lietuvos Respublikos\",  \"footer\" : \"I<LTU56499778<047803111025<<<<7803118F2207043LTU<<<<<<<<<<<8BRUZAITE<<VIGILIJA<<<<<<<<<<<<\",  \"surname\" : \"Bružaitė\",  \"givenName\" : \"Vigilija\",  \"sex\" : \"MOT/F\",  \"authority\" : \"Vilnius (19)\",  \"personalNo\" : 47803111025,  \"dateOfBirth\" : \"11 03 1978\",  \"dateOfIssue\" : \"04 07 2012\",  \"cardNo\" : 56499778}", PersonalIdentityCard.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalIdentityCardApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get profile image for the Personal Identity Card which belongs to the User", nickname = "getPersonalIdentityCardImage", notes = "", authorizations = {
        @Authorization(value = "Token")
    }, tags={ "PersonalIdentityCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved Personal Identity Card profile image"),
        @ApiResponse(code = 404, message = "Personal Identity Card image for this {userId} not found") })
    @RequestMapping(value = "/personalIdentityCard/{userId}/image",
        produces = { "image/jpeg" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> getPersonalIdentityCardImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalIdentityCardApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get small profile image for the Personal Identity Card which belongs to the User", nickname = "getPersonalIdentityCardImageSmall", notes = "", authorizations = {
        @Authorization(value = "Token")
    }, tags={ "PersonalIdentityCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved Personal Identity Card small profile image"),
        @ApiResponse(code = 404, message = "Personal Identity Card small image for this {userId} not found") })
    @RequestMapping(value = "/personalIdentityCard/{userId}/image/small",
        produces = { "image/jpeg" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> getPersonalIdentityCardImageSmall(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalIdentityCardApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get NFC code for the Personal Identity Card which belongs to the User", nickname = "getPersonalIdentityCardNfc", notes = "", authorizations = {
        @Authorization(value = "Token")
    }, tags={ "PersonalIdentityCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved Personal Identity Card NFC code"),
        @ApiResponse(code = 404, message = "Personal Identity Card NFC code for this {userId} not found") })
    @RequestMapping(value = "/personalIdentityCard/{userId}/nfc",
        produces = { "text/plain" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> getPersonalIdentityCardNfc(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalIdentityCardApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get QR code for the Personal Identity Card which belongs to the User", nickname = "getPersonalIdentityCardQr", notes = "", authorizations = {
        @Authorization(value = "Token")
    }, tags={ "PersonalIdentityCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved Personal Identity Card QR code"),
        @ApiResponse(code = 404, message = "Personal Identity Card QR code for this {userId} not found") })
    @RequestMapping(value = "/personalIdentityCard/{userId}/qr",
        produces = { "text/plain" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> getPersonalIdentityCardQr(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalIdentityCardApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get signature image for the Personal Identity Card which belongs to the User", nickname = "getPersonalIdentityCardSignature", notes = "", authorizations = {
        @Authorization(value = "Token")
    }, tags={ "PersonalIdentityCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved Personal Identity Card signature image"),
        @ApiResponse(code = 404, message = "Personal Identity Card signature image for this {userId} not found") })
    @RequestMapping(value = "/personalIdentityCard/{userId}/signature",
        produces = { "image/jpeg" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> getPersonalIdentityCardSignature(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalIdentityCardApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Update profile image for the Personal Identity Card which belongs to the User", nickname = "putPersonalIdentityCardImage", notes = "", authorizations = {
        @Authorization(value = "Token")
    }, tags={ "PersonalIdentityCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully uploaded Personal Identity Card profile image"),
        @ApiResponse(code = 400, message = "Provided image is invalid") })
    @RequestMapping(value = "/personalIdentityCard/{userId}/image",
        consumes = { "multipart/form-data" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> putPersonalIdentityCardImage(@ApiParam(value = "",required=true) @PathVariable("userId") String userId,@ApiParam(value = "Image to upload") @Valid @RequestPart(value="image", required=true) MultipartFile image) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalIdentityCardApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Request to revalidate and extend expiration for Personal Identity Card", nickname = "putPersonalIdentityCardValidation", notes = "", authorizations = {
        @Authorization(value = "Token")
    }, tags={ "PersonalIdentityCard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully requested Personal Identity Card revalidation"),
        @ApiResponse(code = 404, message = "Personal Identity Card for this {userId} not found") })
    @RequestMapping(value = "/personalIdentityCard/{userId}/validate",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> putPersonalIdentityCardValidation(@ApiParam(value = "",required=true) @PathVariable("userId") String userId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PersonalIdentityCardApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
