package ${package}.actors.template_actor;

import info.smart_tools.smartactors.iobject.iobject.exception.ChangeValueException;
import info.smart_tools.smartactors.iobject.iobject.exception.ReadValueException;

/**
 * Actor that <do-thing>.
 */
public class TemplateActor {
    /**
     * Handler that <do smtng>.
     *
     * @param wrapper wrapper with data required for handler work
     * @throws TemplateActorException (<exc-name>) exception that can be thrown if occurs one of this errors:
     *          -<error-name1>
     *          -<error-name2>
     *          -<error-name3>
     */
    public void handle(final TemplateActorWrapper wrapper) throws TemplateActorException {
        try {
            //do some stuff
            wrapper.getParam();
            wrapper.setParam("someString");
        } catch (ReadValueException e) {
            throw new TemplateActorException("Unable to read value from IObject", e);
        } catch (ChangeValueException e) {
            throw new TemplateActorException("Unable to set value to IObject", e);
        }
    }

}
