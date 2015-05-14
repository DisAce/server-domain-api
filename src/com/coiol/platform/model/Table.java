
package com.coiol.platform.model;


public class Table
{

	public Table()
	{
	}

	public static String toClumn(String field)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < field.length(); i++)
		{
			char c = field.charAt(i);
			if (Character.isUpperCase(c) && i > 0)
				sb.append("_").append(Character.toUpperCase(c));
			else
				sb.append(Character.toUpperCase(c));
		}

		return sb.toString();
	}
}
