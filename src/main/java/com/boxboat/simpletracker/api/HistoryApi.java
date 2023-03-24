/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.boxboat.simpletracker.api;

import com.boxboat.simpletracker.model.Contract;
import com.boxboat.simpletracker.model.History;
import com.boxboat.simpletracker.model.HistoryPatch;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-07T14:16:30.773327-08:00[America/Los_Angeles]")
@Validated
@Tag(name = "history", description = "the history API")
public interface HistoryApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /history : Get all history
     * Retrieves all employee contract assignment history
     *
     * @param employeeId numerical employee identifier (optional)
     * @param clientId numerical client identifier (optional)
     * @param contractId numerical contract identifier (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "historyGet",
        summary = "Get all history",
        description = "Retrieves all employee contract assignment history",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = History.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/history",
        produces = { "application/json" }
    )
    default ResponseEntity<List<History>> historyGet(
        @Parameter(name = "employeeId", description = "numerical employee identifier", in = ParameterIn.QUERY) @Valid @RequestParam(value = "employeeId", required = false) Integer employeeId,
        @Parameter(name = "clientId", description = "numerical client identifier", in = ParameterIn.QUERY) @Valid @RequestParam(value = "clientId", required = false) Integer clientId,
        @Parameter(name = "contractId", description = "numerical contract identifier", in = ParameterIn.QUERY) @Valid @RequestParam(value = "contractId", required = false) Integer contractId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"employeeName\" : \"employeeName\", \"clientId\" : 6, \"role\" : \"role\", \"clientName\" : \"clientName\", \"contractId\" : 1, \"employeeId\" : 5, \"id\" : 0 }, { \"employeeName\" : \"employeeName\", \"clientId\" : 6, \"role\" : \"role\", \"clientName\" : \"clientName\", \"contractId\" : 1, \"employeeId\" : 5, \"id\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /history/{historyId} : Delete an employee contract assignment by ID
     *
     * @param historyId Numeric ID of the employee contract assignment (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "historyHistoryIdDelete",
        summary = "Delete an employee contract assignment by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/history/{historyId}"
    )
    default ResponseEntity<Void> historyHistoryIdDelete(
        @Parameter(name = "historyId", description = "Numeric ID of the employee contract assignment", required = true, in = ParameterIn.PATH) @PathVariable("historyId") Integer historyId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /history/{historyId} : Get an employee contract asignment by ID
     *
     * @param historyId Numeric ID of the employee contract assignment (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "historyHistoryIdGet",
        summary = "Get an employee contract asignment by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = History.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/history/{historyId}",
        produces = { "application/json" }
    )
    default ResponseEntity<History> historyHistoryIdGet(
        @Parameter(name = "historyId", description = "Numeric ID of the employee contract assignment", required = true, in = ParameterIn.PATH) @PathVariable("historyId") Integer historyId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"employeeName\" : \"employeeName\", \"clientId\" : 6, \"role\" : \"role\", \"clientName\" : \"clientName\", \"contractId\" : 1, \"employeeId\" : 5, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /history/{historyId} : Update an employee contract assignment by ID
     *
     * @param historyId Numeric ID of the employee contract assignment (required)
     * @param historyPatch  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "historyHistoryIdPut",
        summary = "Update an employee contract assignment by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Contract.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/history/{historyId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Contract> historyHistoryIdPut(
        @Parameter(name = "historyId", description = "Numeric ID of the employee contract assignment", required = true, in = ParameterIn.PATH) @PathVariable("historyId") Integer historyId,
        @Parameter(name = "HistoryPatch", description = "", required = true) @Valid @RequestBody HistoryPatch historyPatch
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tech\" : [ \"tech\", \"tech\" ], \"clientId\" : 6, \"endDate\" : \"endDate\", \"id\" : 0, \"type\" : \"type\", \"startDate\" : \"startDate\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /history : Create new employee contract assignment
     * Add a new contract assignment with fields
     *
     * @param historyPatch  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "historyPost",
        summary = "Create new employee contract assignment",
        description = "Add a new contract assignment with fields",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = History.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/history",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<History> historyPost(
        @Parameter(name = "HistoryPatch", description = "", required = true) @Valid @RequestBody HistoryPatch historyPatch
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"employeeName\" : \"employeeName\", \"clientId\" : 6, \"role\" : \"role\", \"clientName\" : \"clientName\", \"contractId\" : 1, \"employeeId\" : 5, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
