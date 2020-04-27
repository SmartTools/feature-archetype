package ${package}.actors.template_actor;

/**
 * Exception used by {@link TemplateActor}.
 */
public class TemplateActorException extends Exception {
    /**
     * Exception constructor with exception message.
     *
     * @param message exception message
     */
    public TemplateActorException(final String message) {
        super(message);
    }

    /**
     * Exception constructor with exception message and cause.
     *
     * @param message exception message
     * @param cause   exception cause
     */
    public TemplateActorException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
