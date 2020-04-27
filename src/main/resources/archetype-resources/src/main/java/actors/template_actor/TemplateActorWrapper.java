package ${package}.actors.template_actor;

import info.smart_tools.smartactors.iobject.iobject.exception.ChangeValueException;
import info.smart_tools.smartactors.iobject.iobject.exception.ReadValueException;

/**
 * Wrapper used by {@link TemplateActor}.
 */
public interface TemplateActorWrapper {
    /**
     * Getter for <param>.
     *
     * @return string
     * @throws ReadValueException if unable to read <param> from message
     */
    String getParam() throws ReadValueException;

    /**
     * Setter for <param>.
     *
     * @param s string
     * @throws ChangeValueException if unable to set <param> to message
     */
    void setParam(String s) throws ChangeValueException;
}
