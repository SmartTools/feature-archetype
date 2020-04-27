package ${package}.plugins.template_actor_plugin;

import info.smart_tools.smartactors.base.exception.invalid_argument_exception.InvalidArgumentException;
import info.smart_tools.smartactors.base.interfaces.iaction.exception.FunctionExecutionException;
import info.smart_tools.smartactors.base.strategy.apply_function_to_arguments.ApplyFunctionToArgumentsStrategy;
import info.smart_tools.smartactors.feature_loading_system.bootstrap_plugin.BootstrapPlugin;
import info.smart_tools.smartactors.feature_loading_system.interfaces.ibootstrap.IBootstrap;
import info.smart_tools.smartactors.iobject.ifield_name.IFieldName;
import info.smart_tools.smartactors.iobject.iobject.IObject;
import info.smart_tools.smartactors.iobject.iobject.exception.ReadValueException;
import info.smart_tools.smartactors.ioc.iioccontainer.exception.ResolutionException;
import info.smart_tools.smartactors.ioc.key_tools.Keys;
import info.smart_tools.smartactors.ioc.ioc.IOC;

/**
 * Plugin for registering chain version resolve strategy in IOC.
 * Current chain version requires only one argument in message:
 * <pre>
 * {@code version} - chain version (not exist -> default)
 * </pre>
 */
public class TemplateChainStrategyPlugin extends BootstrapPlugin {

    /**
     * The constructor.
     *
     * @param bootstrap the bootstrap
     */
    public TemplateChainStrategyPlugin(final IBootstrap bootstrap) {
        super(bootstrap);
    }

    /**
     * Method that registers chain versioning strategy in IOC.
     *
     * @throws ResolutionException      if unable to resolve something from IOC
     * @throws InvalidArgumentException if invalid argument was passed to
     *                                  {@link ApplyFunctionToArgumentsStrategy} constructor
     */
    @Item("template-chain-plugin")
    public void init()
            throws ResolutionException, InvalidArgumentException {
        IFieldName versionFN = IOC.resolve(
                Keys.getKeyByName(IFieldName.class.getCanonicalName()),
                "version"
        );
        IOC.resolve(
                Keys.getKeyByName("register_message_version_strategy"),
                "template-chain-name",
                new ApplyFunctionToArgumentsStrategy(args -> {
                    IObject message = (IObject) args[0];
                    try {
                        return message.getValue(versionFN);
                    } catch (ReadValueException ex) {
                        throw new FunctionExecutionException("unable to read value", ex);
                    }
                })
        );
    }
}
