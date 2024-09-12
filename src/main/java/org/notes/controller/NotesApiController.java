/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.notes.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.notes.dto.NoteRegistrationInfo;
import org.notes.dto.Note;
import org.notes.dto.AllNotes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-26T20:58:07.952931800+02:00[Europe/Warsaw]")
@Validated
@Tag(name = "notes", description = "the notes API")
public interface NotesApiController {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /notes/create
     *
     * @param noteRegistrationInfo  (optional)
     * @return response (status code 200)
     */
    @Operation(
        operationId = "createNote",
        tags = { "Create Note" },
        responses = {
            @ApiResponse(responseCode = "200", description = "response", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Note.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/notes/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Note> createNote(
        @Parameter(name = "NoteRegistrationInfo", description = "", schema = @Schema(description = "")) @Valid @RequestBody(required = false) NoteRegistrationInfo noteRegistrationInfo
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date_update\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 777, \"title\" : \"TestNoteTitle\", \"message\" : \"test note description\", \"date_creation\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /notes/delete
     *
     * @param noteId note id (optional)
     * @return response (status code 200)
     */
    @Operation(
        operationId = "deleteNote",
        tags = { "Delete Note" },
        responses = {
            @ApiResponse(responseCode = "200", description = "response", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Note.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/notes/delete",
        produces = { "application/json" }
    )
    default ResponseEntity<Note> deleteNote(
        @Parameter(name = "noteId", description = "note id", schema = @Schema(description = "")) @Valid @RequestParam(value = "noteId", required = false) Integer noteId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date_update\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 777, \"title\" : \"TestNoteTitle\", \"message\" : \"test note description\", \"date_creation\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /notes/search
     * get note by id
     *
     * @param noteId note id (optional)
     * @return response (status code 200)
     */
    @Operation(
        operationId = "getById",
        tags = { "Get note by id" },
        responses = {
            @ApiResponse(responseCode = "200", description = "response", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Note.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/notes/search",
        produces = { "application/json" }
    )
    default ResponseEntity<Note> getById(
        @Parameter(name = "noteId", description = "note id", schema = @Schema(description = "")) @Valid @RequestParam(value = "noteId", required = false) Integer noteId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date_update\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 777, \"title\" : \"TestNoteTitle\", \"message\" : \"test note description\", \"date_creation\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /notes/getall
     * get all note
     *
     * @return response (status code 200)
     */
    @Operation(
        operationId = "getNotes",
        tags = { "Get All Notes" },
        responses = {
            @ApiResponse(responseCode = "200", description = "response", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  AllNotes.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/notes/getall",
        produces = { "application/json" }
    )
    default ResponseEntity<AllNotes> getNotes(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"notes\" : [ { \"date_update\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 777, \"title\" : \"TestNoteTitle\", \"message\" : \"test note description\", \"date_creation\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"date_update\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 777, \"title\" : \"TestNoteTitle\", \"message\" : \"test note description\", \"date_creation\" : \"2000-01-23T04:56:07.000+00:00\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /notes/update
     *
     * @param noteId note id (optional)
     * @param noteRegistrationInfo  (optional)
     * @return response (status code 200)
     */
    @Operation(
        operationId = "updateNote",
        tags = { "Update Note" },
        responses = {
            @ApiResponse(responseCode = "200", description = "response", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Note.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/notes/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Note> updateNote(
        @Parameter(name = "noteId", description = "note id", schema = @Schema(description = "")) @Valid @RequestParam(value = "noteId", required = false) Integer noteId,
        @Parameter(name = "NoteRegistrationInfo", description = "", schema = @Schema(description = "")) @Valid @RequestBody(required = false) NoteRegistrationInfo noteRegistrationInfo
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date_update\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 777, \"title\" : \"TestNoteTitle\", \"message\" : \"test note description\", \"date_creation\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
