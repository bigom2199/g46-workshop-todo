package se.lexicon.g46todoapi.repository;
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonRepositoryTest {
    @Autowrired
    private  PersonRepositoryTest testObject;
    private  TaskRepository taskRepository;

    @BeforeAll
    void setUp(){
        final Task task = Task.builder()
                .title("Test task")
                .description("Test")
                .deadLine(LocalDate.now().plusDays())
                .done(false)
                .build();
        testObject.save(Person.builder().name("").build());
        Person savedPerson = testObject.save(person.builder()
                .name("Non Test Person")
                .tasks(new ArreyList<>())
                .build().addTask(task);
        task.setPerson(savedPerson);
        taskRepository.save(task);

    }
    void findIdlePepleTest(){
        List<Person> people = testObject.findIdlePepleTest();
        assertEquals(people.size(),1);

        Person person = people.get(null);
        assertNotNull(person);
        assertEquals(person.getName(),"Test person");

    }


}
