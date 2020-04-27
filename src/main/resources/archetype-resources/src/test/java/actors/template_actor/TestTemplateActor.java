package ${package}.actors.template_actor;

import info.smart_tools.smartactors.helpers.IOCInitializer.IOCInitializer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestTemplateActor extends IOCInitializer {

    private TemplateActor actor;

    @Mock
    private TemplateActorWrapper wrapper;

//    @Captor
//    private ArgumentCaptor<Object> objectArgumentCaptor; //if needed

    @Override
    protected void registry(String... strings) throws Exception {
        registryStrategies("ifieldname strategy", "iobject strategy");
    }

    @Before
    public void init() {
        actor = new TemplateActor(/*<params, if stateful>*/);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSuccess() throws Exception {
//        Object testObject = <needed-obj-init>;
//        when(wrapper.<any-stuff>()).thenReturn(<smthng>);
//        actor.handle(wrapper);
//        verify(wrapper).<set-stuff(objectArgumentCaptor.capture());
//        assertEquals(testObject, objectArgumentCaptor.getValue());
    }

//    @Test(expected = TemplateActorException.class)
//    public void testReadValueException() throws Exception {
//        when(wrapper.<get-stuff>()).thenThrow(new ReadValueException());
//        actor.handle(wrapper);
//    }

//    @Test(expected = TemplateActorException.class)
//    public void testChangeValueException() throws Exception {
//        doThrow(new ChangeValueException()).when(wrapper).<set-stuff>(any());
//        actor.handle(wrapper);
//    }

}
