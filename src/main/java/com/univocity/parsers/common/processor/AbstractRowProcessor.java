/*******************************************************************************
 * Copyright 2014 uniVocity Software Pty Ltd
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.univocity.parsers.common.processor;

import com.univocity.parsers.common.*;

/**
 * A {@link RowProcessor} implementation that just implements all methods defined by the interface.
 *
 * @author uniVocity Software Pty Ltd - <a href="mailto:parsers@univocity.com">parsers@univocity.com</a>
 *
 */
public class AbstractRowProcessor implements RowProcessor {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void processStarted(ParsingContext context) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void rowProcessed(String[] row, ParsingContext context) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void processEnded(ParsingContext context) {
	}
}
