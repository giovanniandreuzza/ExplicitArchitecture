package io.github.giovanniandreuzza.explicitarchitecture.application

import io.github.giovanniandreuzza.explicitarchitecture.application.annotations.IsApplicationEvent
import io.github.giovanniandreuzza.explicitarchitecture.shared.events.Event

/**
 * Application Event.
 *
 * @author Giovanni Andreuzza
 */
@IsApplicationEvent
public interface ApplicationEvent : Event