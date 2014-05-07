/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.logmanager.ext.formatters;

import java.io.IOException;
import java.io.Writer;

/**
 * A writer that writes to a {@link java.lang.StringBuilder}.
 * <p/>
 * This is not thread safe.
 *
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
class StringBuilderWriter extends Writer {
    private final StringBuilder sb;

    public StringBuilderWriter() {
        this(512);
    }

    public StringBuilderWriter(final int initSize) {
        sb = new StringBuilder(initSize);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    @Override
    public void write(final int c) throws IOException {
        sb.append((char) c);
    }

    @Override
    public void write(final char[] cbuf) throws IOException {
        sb.append(cbuf);
    }

    @Override
    public void write(final String str) throws IOException {
        sb.append(str);
    }

    @Override
    public void write(final String str, final int off, final int len) throws IOException {
        sb.append(str, off, len);
    }

    @Override
    public Writer append(final CharSequence csq) throws IOException {
        sb.append(csq);
        return this;
    }

    @Override
    public Writer append(final CharSequence csq, final int start, final int end) throws IOException {
        sb.append(csq, start, end);
        return this;
    }

    @Override
    public Writer append(final char c) throws IOException {
        sb.append(c);
        return this;
    }

    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {
        sb.append(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
        // do nothing
    }

    @Override
    public void close() throws IOException {
        // do nothing
    }
}
