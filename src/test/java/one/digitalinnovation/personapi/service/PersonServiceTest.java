package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static one.digitalinnovation.personapi.utils.PersonUtils.createFakeDTO;
import static one.digitalinnovation.personapi.utils.PersonUtils.createFakeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    PersonDTO personDTO = createFakeDTO();
    Person expectedSavedPerson = createFakeEntity();


    @Test
    @BeforeEach
    void testGivenPersonDTOThenReturnSavedMessage()  {

        PersonDTO personDTO = createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);
        MessageResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPerson.getId(), "Created Person with ID: ");
        MessageResponseDTO successMessage = personService.createPerson(personDTO);

        assertEquals(expectedSuccessMessage, successMessage);
    }



    @Test
    void testDeleteCreatedPersonById() {
        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        personService.createPerson(personDTO);

        personRepository.deleteById(expectedSavedPerson.getId());
    }

    @Test
    void testFindPersonById() {
        personDTO.setId(1L);

        assertEquals(personDTO.getId(), expectedSavedPerson.getId());

    }

    private MessageResponseDTO createExpectedMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }

    @Test
    void testUpdatePersonById() throws PersonNotFoundException {
        when(personRepository.findById(1L)).thenReturn(java.util.Optional.of(expectedSavedPerson));

        personService.updateById(1L, createFakeDTO());

        MessageResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedPerson.getId(), "Updated person with id: ");
        MessageResponseDTO successMessage = personService.updateById(1L, createFakeDTO());

        assertEquals(expectedSuccessMessage, successMessage);

    }

    @Test
    void testListPeople() {

       personService.listAll();

    }

}

