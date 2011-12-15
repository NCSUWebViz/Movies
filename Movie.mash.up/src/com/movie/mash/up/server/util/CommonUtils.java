package com.movie.mash.up.server.util;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {

	/**
	 * 
	 * @param input
	 * @return
	 */
	public static Map<String, Integer> stringToMap(String input) {

		if (input == null || input.length() == 0) {
			return null;
		}
		String formattedString = (String) input.subSequence(1,
				input.length() - 1);

		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] nameValuePairs = formattedString.split(",");
		for (String nameValuePair : nameValuePairs) {
			String[] nameValue = nameValuePair.split("=");

			map.put(nameValue[0], Integer.parseInt(nameValue[1]));

		}

		return map;
	}

	public static Map<Integer, Integer> stringToMapIntInt(String input) {

		if (input == null || input.length() == 0) {
			return null;
		}
		String formattedString = (String) input.subSequence(1,
				input.length() - 1);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		String[] nameValuePairs = formattedString.split(",");
		for (String nameValuePair : nameValuePairs) {
			String[] nameValue = nameValuePair.split("=");

			try
			{
			map.put(Integer.parseInt(nameValue[0].trim()),
					Integer.parseInt(nameValue[1].trim()));
			}catch(NumberFormatException e){
				e.printStackTrace();
			}

		}

		return map;
	}

	/**
	 * Helper to match the Given patter in the source
	 * 
	 * @param pattern
	 * @param source
	 * @return
	 */
	public static boolean patternMatch(String pattern, String source) {
		if (pattern == null) {
			return false;
		}
		Pattern p = Pattern.compile(pattern);
		Matcher matches = p.matcher(source);
		return matches.matches();
	}
}
