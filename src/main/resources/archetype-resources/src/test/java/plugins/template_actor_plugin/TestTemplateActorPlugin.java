package ${package}.plugins.template_actor_plugin;

import info.smart_tools.smartactors.helpers.IOCInitializer.IOCInitializer;
import info.smart_tools.smartactors.iobject.iobject.IObject;
import info.smart_tools.smartactors.ioc.iioccontainer.exception.ResolutionException;
import info.smart_tools.smartactors.ioc.ioc.IOC;
import info.smart_tools.smartactors.ioc.key_tools.Keys;
import ${package}.actors.template_actor.TemplateActor;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

//commented = if stateful actor
public class TestTemplateActorPlugin extends IOCInitializer {
    @Override
    protected void registry(String... strings) throws Exception {
        registryStrategies("ifieldname strategy", "iobject strategy");
    }

    @Test
    public void testRegisterSuccessful() throws Exception {
        final TemplateActorPlugin plugin = new TemplateActorPlugin(null);
        plugin.init();
//        IObject args = IOC.resolve(
//                Keys.getByName(IObject.class.getCanonicalName()),
//                "{" +
//                  "\"argOne\":1," +
//                  "\"argTwo\":2" +
//                "}");
        final Object object = IOC.resolve(Keys.getKeyByName(TemplateActor.class.getCanonicalName())/*, args*/);
        assertTrue(object instanceof TemplateActor);
    }

    @Test(expected = ResolutionException.class)
    public void testRegisterUnsuccessful() throws Exception {
        IOC.resolve(Keys.getKeyByName(TemplateActor.class.getCanonicalName()));
    }

    @Test(expected = ResolutionException.class)
    public void testUnregisterSuccess() throws Exception {
        final TemplateActorPlugin plugin = new TemplateActorPlugin(null);
        plugin.init();
        plugin.unregister();

//        IObject args = IOC.resolve(
//                Keys.getByName(IObject.class.getCanonicalName()),
//                "{" +
//                  "\"argOne\":1," +
//                  "\"argTwo\":2" +
//                "}");
        IOC.resolve(
                Keys.getKeyByName(TemplateActor.class.getCanonicalName())/*, args*/
        );
    }
}
