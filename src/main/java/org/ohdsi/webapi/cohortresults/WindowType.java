/*
 * Copyright 2018 cknoll1.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ohdsi.webapi.cohortresults;

import java.util.Arrays;

/**
 *
 * @author cknoll1
 */
public enum WindowType {
	BASELINE("baseline"), AT_RISK("atrisk");
	
	private String value;
	
	private WindowType(String value) {
		this.value = value;
	}

	public static WindowType fromString(String value) {
		for (WindowType category : values()) {
			if (category.value.equalsIgnoreCase(value)) {
				return category;
			}
		}
		throw new IllegalArgumentException(
				"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
	}	
}
