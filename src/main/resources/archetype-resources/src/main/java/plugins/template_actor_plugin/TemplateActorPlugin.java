package ${package}.plugins.template_actor_plugin;

import info.smart_tools.smartactors.base.exception.invalid_argument_exception.InvalidArgumentException;
import info.smart_tools.smartactors.base.strategy.apply_function_to_arguments.ApplyFunctionToArgumentsStrategy;
import info.smart_tools.smartactors.feature_loading_system.bootstrap_plugin.BootstrapPlugin;
import info.smart_tools.smartactors.feature_loading_system.interfaces.ibootstrap.IBootstrap;
import info.smart_tools.smartactors.ioc.iioccontainer.exception.RegistrationException;
import info.smart_tools.smartactors.ioc.iioccontainer.exception.ResolutionException;
import info.smart_tools.smartactors.ioc.iioccontainer.exception.DeletionException;
import info.smart_tools.smartactors.ioc.key_tools.Keys;
import info.smart_tools.smartactors.ioc.ioc.IOC;
import ${package}.actors.template_actor.TemplateActor;

/**
 * Plugin for registering {@link TemplateActor} in IOC.
 * <br/><br/>
 * Actor can be resolved by key
 * {@code <actor-reference>}.
 * <br/>
 * Actor type - {@code <stateless_actor/actor(if any args exist)>}.
 * <br/>
 * This actor requires #num arguments:
 * <pre>
 * {@code arg#} - arg# description
 * {@code arg#} - arg# description
 * {@code arg#} - arg# description
 * </pre>
 */
public class TemplateActorPlugin extends BootstrapPlugin {

    /**
     * The constructor.
     *
     * @param bootstrap the bootstrap
     */
    public TemplateActorPlugin(final IBootstrap bootstrap) {
        super(bootstrap);
    }

    /**
     * Method that registers actor in IOC.
     *
     * @throws ResolutionException      if unable to resolve something from IOC
     * @throws RegistrationException    if unable to register actor in IOC
     * @throws InvalidArgumentException if invalid argument was passed to
     *                                  {@link ApplyFunctionToArgumentsStrategy} constructor
     */
    @Item("<your-actor-name>-plugin")
    public void init()
            throws ResolutionException, RegistrationException, InvalidArgumentException {
        IOC.register(Keys.getKeyByName(TemplateActor.class.getCanonicalName()), new ApplyFunctionToArgumentsStrategy(
                args -> new TemplateActor()
        ));
    }

    /**
     * Method that unregisters actor from IOC.
     *
     * @throws ResolutionException if it is not possible to resolve key from IOC
     * @throws DeletionException   if it is not possible to unregister actor from IOC
     */
    @ItemRevert("<your-actor-name>-plugin")
    public void unregister() throws ResolutionException, DeletionException {
        IOC.unregister(Keys.getKeyByName(TemplateActor.class.getCanonicalName()));
    }
}
