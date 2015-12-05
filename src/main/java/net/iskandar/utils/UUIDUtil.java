package net.iskandar.utils;

import java.util.UUID;

public class UUIDUtil {
	public static String uuidToString(UUID uuid){
		if(uuid == null)
			throw new IllegalArgumentException("uuid must not be null!");
		StringBuffer result = new StringBuffer();
		String[] parts = uuid.toString().split("-");
		for(String part : parts){
			result.append(part);
		}
		return result.toString();
	}
}
