package org.jboss.logmanager.ext;

import org.jboss.logmanager.ExtLogRecord;
import org.jboss.logmanager.ExtLogRecord.FormatStyle;

/**
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
public abstract class AbstractTest {

    protected ExtLogRecord createLogRecord(final String msg) {
        return createLogRecord(org.jboss.logmanager.Level.INFO, msg);
    }

    protected ExtLogRecord createLogRecord(final String format, final Object... args) {
        return createLogRecord(org.jboss.logmanager.Level.INFO, format, args);
    }

    protected ExtLogRecord createLogRecord(final org.jboss.logmanager.Level level, final String msg) {
        return new ExtLogRecord(level, msg, getClass().getName());
    }

    protected ExtLogRecord createLogRecord(final org.jboss.logmanager.Level level, final String format, final Object... args) {
        final ExtLogRecord record = new ExtLogRecord(level, format, FormatStyle.PRINTF, getClass().getName());
        record.setParameters(args);
        return record;
    }
}
