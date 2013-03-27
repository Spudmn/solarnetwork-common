/* ==================================================================
 * JodaDateTimeSerializer.java - Mar 20, 2013 8:04:50 PM
 * 
 * Copyright 2007-2013 SolarNetwork.net Dev Team
 * 
 * This program is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software 
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 
 * 02111-1307 USA
 * ==================================================================
 */

package net.solarnetwork.util;

import java.io.IOException;
import java.util.TimeZone;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.DateTime;

/**
 * JsonSerializer for {@link DateTime} into simple strings.
 * 
 * @author matt
 * @version 1.0
 */
public class JodaDateTimeSerializer extends JodaBaseJsonSerializer<DateTime> {

	/**
	 * Default constructor.
	 * 
	 * <p>
	 * Uses the pattern <code>yyyy-MM-dd HH:mm:ss.SSS'Z'</code>.
	 * </p>
	 */
	public JodaDateTimeSerializer() {
		this("yyyy-MM-dd HH:mm:ss.SSS'Z'", TimeZone.getTimeZone("GMT"));
	}

	/**
	 * Construct with values.
	 * 
	 * @param pattern
	 *        the pattern
	 * @param timeZone
	 *        the time zone
	 */
	public JodaDateTimeSerializer(String pattern, TimeZone timeZone) {
		super(DateTime.class, pattern, timeZone);
	}

	/**
	 * Construct with a pattern.
	 * 
	 * @param pattern
	 *        the pattern
	 */
	public JodaDateTimeSerializer(String pattern) {
		super(DateTime.class, pattern);
	}

	@Override
	public void serialize(DateTime o, JsonGenerator generator, SerializerProvider provider)
			throws IOException, JsonGenerationException {
		if ( o == null ) {
			return;
		}
		generator.writeString(serializeWithFormatter(o));
	}

}
