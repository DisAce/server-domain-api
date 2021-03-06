

package org.coiol.platform.core.jackjson;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.coiol.platform.core.log.PlatFormLogger;
import org.coiol.platform.core.log.PlatFormLoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CustomDateTimeDeserializer extends JsonDeserializer<Date> {

	private static final PlatFormLogger logger = PlatFormLoggerFactory
			.getPlatFormLogger(CustomDateTimeDeserializer.class);
	private static final String DATE_TIME[] = { "yyyy-MM-dd HH:mm:ss" };

	public Date deserialize(JsonParser parser, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		try {
			return DateUtils.parseDate(parser.getText(), DATE_TIME);
		} catch (ParseException e) {
			logger.error("ParseException: ", e);
		}
		return null;
	}

}
