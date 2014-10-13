package de.peteral.softplc.model;

import de.peteral.softplc.comm.CommunicationTaskFactory;
import de.peteral.softplc.comm.ServerDataEvent;

/**
 * TaskFactory implementations create {@link CommunicationTask} from
 * {@link ServerDataEvent}.
 *
 * @author peteral
 *
 */
public interface TaskFactory {
	/**
	 * Signals whether this factory instance can handle the event.
	 *
	 * @param dataEvent
	 *            event that needs to be translated into
	 *            {@link CommunicationTask}
	 * @return true - this instance can handle the event
	 */
	boolean canHandle(ServerDataEvent dataEvent);

	/**
	 * Creates a concrete {@link CommunicationTask} instance from a
	 * {@link ServerDataEvent}.
	 *
	 * @param dataEvent
	 *            server data event
	 * @param factory
	 * @return concrete {@link CommunicationTask} instance
	 */
	CommunicationTask createTask(ServerDataEvent dataEvent,
			CommunicationTaskFactory factory);

}
